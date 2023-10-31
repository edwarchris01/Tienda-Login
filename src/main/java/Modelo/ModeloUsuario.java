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

public class ModeloUsuario {

    private int doc, sex, car,tipo;
    private String nom, tele, correo, dire, log, contra;
    private Date fec;

    public int getSex() {
        return sex;
    }

    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
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

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Date getFec() {
        return fec;
    }

    public void setFec(Date fec) {
        this.fec = fec;
    }

    public int getCar() {
        return car;
    }

    public void setCar(int car) {
        this.car = car;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    

    public Map<String, Integer> llenarCombo(String valor) {
        Conectar conexs = new Conectar();
        Connection co = conexs.iniciarConexion();
        String sql = "Select * from  mostrar_" + valor;

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

    public void Insertar_USUARIO() {

        Conectar conex = new Conectar();
        Connection co = conex.iniciarConexion();

        String sql = "Call usuario (?,?,?,?,?,?,?,?,?,?)";//colsulta a la base de datos 

        try {
            PreparedStatement ps = co.prepareStatement(sql);
             ps.setInt(1, getTipo());
             ps.setInt(2, getDoc());
            ps.setString(3, getNom());
            ps.setString(4, getTele());
            ps.setString(5, getCorreo());
            ps.setString(6, getDire());
            ps.setInt(7, getSex());
            ps.setDate(8, getFec());
            ps.setInt(9, getCar());
            ps.setString(10, getLog());
            ps.setString(11, getContra());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro guardado");
            co.close();
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null, "error al guardar", "error", JOptionPane.ERROR_MESSAGE);
        }
      conex.cerrarConexion();
    }
    public void limpiar(Component[]panel) {
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
    public void mostrarTablaUsuario (JTable tabla,String valor){
        Conectar conx = new Conectar();
        Connection cx = conx.iniciarConexion();
        
        JTableHeader encabezado = tabla.getTableHeader();
                encabezado.setDefaultRenderer(new GestionEncabezado());
                tabla.setTableHeader(encabezado);
                
                tabla.setDefaultRenderer(Object.class, new GestionCeldas() );
        
        JButton editar = new JButton("Editar");
        JButton eliminar = new JButton("Eliminar");
        
//        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png")));
//        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png")));
        String[] titulo = {"tipo de documrnto","documento","nombre","direccion","telefono","sexo","correo","fecha de naciminto","cargo"};
        DefaultTableModel tablaUsuario = new DefaultTableModel(null, titulo){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        String sqlUsuario;
        if (valor.equals("")){
            sqlUsuario= "Select*from mostrar_usuario";
        } else {
            sqlUsuario= "Call *from mostrar_usuario('"+valor+"')"; 
        }
       try {
           String[] dato = new String[titulo.length];
           Statement st = cx.createStatement();
           ResultSet rs = st.executeQuery(sqlUsuario);
           
           while(rs.next()){
               for(int i=0;i<titulo.length-2; i++){
                   dato[i]=rs.getString(i + 1);                   
               }
               tablaUsuario.addRow(new Object[]{dato[0],dato[1],dato[2],dato[3],dato[4],dato[5],dato[6],dato[7],dato[8]});//agrega en el mismo orden de la tabla de usuario
           }
       } catch (SQLException e)    {
           
       } 
       tabla.setModel(tablaUsuario);
        //darle tamano a cada columna 
       int numero_columnas = tabla.getColumnCount();
       int []tamanos_celdas = {100,150,150,100,100,150,150,100,100,150,100,30,30};
       for(int i = 0; i <numero_columnas;i++){
           TableColumn  columna = tabla.getColumnModel().getColumn(i);
           columna.setPreferredWidth(tamanos_celdas[i]);
           
       }
       
    }
    public void buscar_usuario(int valor){
        Conectar cone = new Conectar();
        Connection cn = cone.iniciarConexion();
        String sql ="Call Atualizar_Usuario("+valor+")";
        
        
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs =st.executeQuery(sql);
            
            while (rs.next()){
                setDoc(rs.getInt(1));
                setTipo(rs.getInt(2));
                 setNom(rs.getString(3));
                 setTele(rs.getString(4));
                 setCorreo(rs.getString(5));
                 setDire(rs.getString(6));
                 setSex(rs.getInt(7));      
                 setFec(rs.getDate(8));
                 setCar(rs.getInt(9));
                 setLog(rs.getString(10));
                 setContra(rs.getString(11));
                  
            }
            
        }catch (SQLException e){
           e.printStackTrace();
        }
    }
        //para que el atualizar me muestre el dato que seleciono el usuario
        public String obtenerSeleccion(Map<String,Integer>dato, int valor){
            for (Map.Entry<String,Integer>seleccion:dato.entrySet()){
                if(seleccion.getValue()==valor){
                    return seleccion.getKey();
                }
            }
        return null;
        }
              
}