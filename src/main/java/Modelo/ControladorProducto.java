
package Modelo;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class ControladorProducto {
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
      
      
      FileNameExtensionFilter Filtro = new FileNameExtensionFilter("JPG,PNG & GLF","jpg","png","gif");
      
      archivos.setFileFilter(Filtro);
      if(archivos.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
          setRuta(archivos.getSelectedFile().getAbsolutePath());
      }
  }
    
}
