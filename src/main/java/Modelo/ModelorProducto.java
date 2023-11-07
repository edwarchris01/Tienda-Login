
package Modelo;

import Controlador.Conectar;
import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;


public class ModelorProducto {
    private String nom, desc,ruta;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
    private byte imagen[];

  public void buscarImagen(){
      JFileChooser archivos = new JFileChooser();
      
      String rutaCarpeta= getClass().getClassLoader().getResource("producto").getPath();
              File carpeta = new File(rutaCarpeta);
              archivos.setCurrentDirectory(carpeta);
      FileNameExtensionFilter Filtro = new FileNameExtensionFilter("JPG,PNG & GLF","jpg","png","gif");
      
      archivos.setFileFilter(Filtro);
      if(archivos.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
          setRuta(archivos.getSelectedFile().getAbsolutePath());
      }
  }
  public byte [] obtenerImagen ()
  
   public void insertarProducto() throws SQLException {
       Conectar con = new Conectar();
       Connection cn = con.Connection.iniciarConexion();
       String insProducto ="Call in_produc(?,?,?)";
       try {
           PreparedStatement ps = cn.prepareCall(insProducto);
           ps.setString(1, getNom());
           ps.setString(2, getDesc());
           ps.setBytes(3, getImagen());
           ps.setString(4, getRuta());
           ps.executeUpdate();
           JOptionPane.Show
       }
       
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
}
