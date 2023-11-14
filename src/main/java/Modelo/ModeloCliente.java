
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
import java.util.Arrays;
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


public class ModeloCliente {
    private int doc, sex;
    private String nom, tele, correo, dire,tipo ;
    private Date fec;

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

    
      public Map<String, Integer> llenarCombo(String valor) {
        Conectar conex = new Conectar();
        Connection co = conex.iniciarConexion();
        
        String sql = "SELECT * FROM mostrar_" + valor;

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
    
    public void Insertar_Cliente() {

        Conectar conex = new Conectar();
        Connection co = conex.iniciarConexion();

        String sql = "Call ins_clic (?,?,?,?,?,?,?,?)";//colsulta a la base de datos 

        try {
            PreparedStatement ps = co.prepareStatement(sql);            
            ps.setInt(1, getDoc());
            ps.setString(2, getTipo());
            ps.setString(3, getNom());
            ps.setString(4, getTele());
            ps.setString(5, getCorreo());            
            ps.setInt(6, getSex());
            ps.setDate(7, getFec());
            ps.setString(8, getDire());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro guardado","registro",sex);
            co.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showInternalMessageDialog(null, "error al guardar", "error", JOptionPane.ERROR_MESSAGE);
        }
        conex.cerrarConexion();
    }

    public void limpiar(Component[]panelCliente) {
        
        for(Object limpiar: panelCliente){
            if(limpiar instanceof JTextField){
                ((JTextField)limpiar).setText("");
            }
            
            if(limpiar instanceof JComboBox){
                ((JComboBox)limpiar).setSelectedItem("Seleccione...");
            }
            
              if(limpiar instanceof JDateChooser){
                ((JDateChooser)limpiar).setDate(null);
            }
        }

    }
     public void mostrarTableCliente (JTable tabla,String valor,String nomPeste){
        Conectar conxes = new Conectar();
        Connection co = conxes.iniciarConexion();
//        personalizar el  encabezado
        JTableHeader encabezado = tabla.getTableHeader();
                encabezado.setDefaultRenderer(new GestionEncabezado());
                tabla.setTableHeader(encabezado);
                
         tabla.setDefaultRenderer(Object.class, new GestionCeldas() );       
        JButton editar = new JButton("editar");
        JButton eliminar = new JButton("eliminar");
        
//        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png")));
//        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png")));
//agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png")));
        String[] titulo = {"tipo de documento","documento","nombre","correo","telefono","sexo","fecha de naciminto","direccion"};
        
        int opcion =titulo.length;
          if (nomPeste.equals("Cliente")) {
            titulo = Arrays.copyOf(titulo, titulo.length + 2);
            titulo[titulo.length - 2] = "";
            titulo[titulo.length - 1] = "";
        } else {
            titulo = Arrays.copyOf(titulo, titulo.length + 1);
            titulo[titulo.length - 1] = "";
        }
        DefaultTableModel tableCliente = new DefaultTableModel(null, titulo){
            
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        String  sqlCliente;
        if (valor.equals("")){
            sqlCliente= "select * from mostrar_cliente ";
        } else {
             sqlCliente= "Call * from consul_cliente1('"+valor+"')"; 
        }
       try {
            String[] dato = new String[titulo.length];
            Statement st = co.createStatement(); //Crea una consulta
            ResultSet rs = st.executeQuery(sqlCliente);
            while (rs.next()) {
                for (int i = 0; i < opcion; i++) {
                    dato[i] = rs.getString(i + 1);
                }
                Object[] fila = {dato[0], dato[1], dato[2], dato[3], dato[4], dato[5], dato[6], dato[7]};
                if (nomPeste.equals("Cliente")) {
                    fila = Arrays.copyOf(fila, fila.length + 2);
                    fila[fila.length - 2] = editar;
                    fila[fila.length - 1] = eliminar;
                } else {
                    //fila[fila.length - 1] = agregar;
                }
                tableCliente.addRow(fila);
            }
            co.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        tabla.setModel(tableCliente);
        //Darle Tamaño a cada Columna
        int Colum = tabla.getColumnCount();
        int[] ancho = {100, 180, 100, 150, 100, 160, 100, 180, 30, 30};
        for (int i = 0; i < Colum; i++) {
            TableColumn columna = tabla.getColumnModel().getColumn(i);
            columna.setPreferredWidth(ancho[i]);
        } 
        conxes.iniciarConexion();
    }
       

    
      public void buscar_cliente(int valor){
        Conectar cone = new Conectar();
        Connection cn = cone.iniciarConexion();
        String sql =" Call AtualizarCliente ("+valor+")";
        
        
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs =st.executeQuery(sql);
            
            while (rs.next()){
                setTipo(rs.getString(1));
                setDoc(rs.getInt(2));                
                 setNom(rs.getString(3));
                 setTele(rs.getString(4));
                 setCorreo(rs.getString(5));
                 setDire(rs.getString(6)); 
                 setSex(rs.getInt(7));      
                 setFec(rs.getDate(8));                
                      
            }
            
        }catch (SQLException e){
           e.printStackTrace();
        }
    }

    public String obtenerSeleccion(Map<String, Integer> dato, int sex) {

        return null;

    }

}

