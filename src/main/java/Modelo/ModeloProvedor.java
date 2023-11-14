
package Modelo;

import Controlador.Conectar;
import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;


public class ModeloProvedor {
        
              private int doc, Tipo,sex;
    private String nom, tele,correo, dire,nit ;
    
    private Date fec;
    

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }
    
    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        this.dire = dire;
    }

    public Date getFec() {
        return fec;
    }

    public void setFec(Date fec) {
        this.fec = fec;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

  

    
      public Map<String, Integer> llenarCombo(String valor) {
        Conectar conex = new Conectar();
        Connection co = conex.iniciarConexion();
        String sql = "Select * from mostrar_" + valor;

        Map<String, Integer> llenar_Combo = new HashMap<>();

        try {
            Statement sc = co.createStatement();
            ResultSet rs = sc.executeQuery(sql);

            while (rs.next()) {
                llenar_Combo.put(rs.getString(2), rs.getInt(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return llenar_Combo;
    }
    
    public void Insertar_Provedor() {

        Conectar conex = new Conectar();
        Connection co = conex.iniciarConexion();

        String sql = "Call ins_provedor (?,?,?,?,?,?,?,?,?)";//colsulta a la base de datos 

        try {
            PreparedStatement ps = co.prepareStatement(sql);
            ps.setInt(1, getDoc());
            ps.setString(2, getNit());
             ps.setString(3, getNom());
            ps.setInt( 4 , getTipo());
            ps.setString(5, getTele());
            ps.setString(6, getCorreo());
            ps.setInt(7, getSex());
            ps.setDate(8, getFec());
            ps.setString(9, getDire());            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro guardado");
            co.close();
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "error al guardar", "error", JOptionPane.ERROR_MESSAGE);
        }
       conex.cerrarConexion();
    }

    public void limpiar(Component[] panel) {
        for(Object control: panel){
            if(control instanceof JTextField){
                ((JTextField)control).setText("");
            }
            
            if(control instanceof JComboBox){
                ((JComboBox)control).setSelectedItem("Seleccione");
            }
            
              if(control instanceof JDateChooser){
                ((JDateChooser)control).setDate(null);
            }
        }
    }
   public void mostrarTablaProvedor (JTable tabla,String valor,String nomPesta){
        Conectar conx = new Conectar();
        Connection cx = conx.iniciarConexion();
//        personalizar el  encabezado
        JTableHeader encabezado = tabla.getTableHeader();
                encabezado.setDefaultRenderer(new GestionEncabezado());
                tabla.setTableHeader(encabezado);
                
                tabla.setDefaultRenderer(Object.class, new GestionCeldas() );
        
        JButton editar = new JButton("Editar");
        JButton eliminar = new JButton("Eliminar");
        
//        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png")));
//        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png")));
//agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png")));
        String[] titulo = {"tipo de documento","documento","nombre","telefono","correo","direccion","cargo","sexo","fecha de naciminto",};
        DefaultTableModel tablaProvedor = new DefaultTableModel(null, titulo){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        String sqlProvedor;
        if (valor.equals("")){
            sqlProvedor= "Select*from mostrar_prove";
        } else {
            sqlProvedor= "Call *from consul_provedor('"+valor+"')"; 
        }
       try {
           String[] dato = new String[titulo.length];
           Statement st = cx.createStatement();
           ResultSet rs = st.executeQuery(sqlProvedor);
           
           while(rs.next()){
               for(int i=0;i<titulo.length-2; i++){
                   dato[i]=rs.getString(i + 1);                   
               }
               tablaProvedor.addRow(new Object[]{dato[0],dato[1],dato[2],dato[3],dato[4],dato[5],dato[6],dato[7],dato[8]});//agrega en el mismo orden de la tabla de usuario
           }
       } catch (SQLException e)    {
           
       } 
       tabla.setModel(tablaProvedor);
        //darle tamano a cada columna 
       int numero_columnas = tabla.getColumnCount();
       int []tamanos_celdas = {100,150,150,100,100,150,150,100,100,30,30};
       for(int i = 0; i <numero_columnas;i++){
           TableColumn  columna = tabla.getColumnModel().getColumn(i);
           columna.setPreferredWidth(tamanos_celdas[i]);
           
       }
       
    }
   
}

 