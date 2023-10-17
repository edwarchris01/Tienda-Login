
package Controlador;

import Modelo.ModeloUsuario;
import Vista.Nuevo_Usuario;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ControladorUsuario implements ActionListener{
      Principal princi = new Principal();//Instancia(Llama) la ventana principal
    Nuevo_Usuario nuevo = new Nuevo_Usuario();
    ModeloUsuario usu = new ModeloUsuario();//Instancia el modelo de usuario
    

    
    public  ControladorUsuario (){
         nuevo.getBntguardar().addActionListener(this);
         nuevo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
          nuevo.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                   
                    
             ControladorPrincipal pri = new ControladorPrincipal();
             pri.iniciarSesion();
                }
            });
                   
        }
    
    public void controlar_usu() {
    
         /*Al cerrar la ventana nuevo no cierra el programa sino que abre la ventana principal*/
          
            princi.setVisible(false);//Cierra la ventana principal para a que solo se visualice la ventana de nuevo usuario
            nuevo.setLocationRelativeTo(null);
            nuevo.setVisible(true);
            
            //Lleno el combobox de sexo
            nuevo.getBoxSexo().addItem("Seleccione...");
            Map<String,Integer>dato = usu.llenarCombo("sexo");
            for(String sexo:dato.keySet()){
                nuevo.getBoxSexo().addItem(sexo);
            }
            //Lleno el combobox de rol
            nuevo.getBoxCargo().addItem("Seleccione...");
            Map<String,Integer>datos = usu.llenarCombo("cargo");
            for(String cargo:datos.keySet()){
                nuevo.getBoxCargo().addItem( cargo);
 }      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if (e.getSource().equals(nuevo.getBntguardar())){    
        if (nuevo.getTXTdocumento().getText().isEmpty() || nuevo.getTXTnombre().getText().isEmpty() || nuevo.getTXTcorreo().getText().isEmpty()
                || nuevo.getTXTdireccion().getText().isEmpty() || nuevo.getTXTlogin2().getText().isEmpty() || nuevo.getTXTtelefono().getText().isEmpty()
                || nuevo.getBoxSexo().getSelectedItem().equals("Selecione")|| nuevo.getBoxCargo().getSelectedItem().equals("Selecione")
                || nuevo.getDateFecha().getDate() == null) {
              JOptionPane.showMessageDialog(null,"Debes completar los campos requerido..." );
        }else {
         String valorSexo = nuevo.getBoxSexo().getSelectedItem().toString();
             String valorCargo = nuevo.getBoxCargo().getSelectedItem().toString();
            int sexo = usu.llenarCombo("sexo").get(valorSexo);
                int cargo = usu.llenarCombo("cargo").get(valorCargo); 
                
                
                //cambia el formato de la fecha que entiende el msq
                java.util.Date fech = nuevo.getDateFecha().getDate();
                long fe = fech.getTime();
                java.sql.Date fecha = new Date(fe);
                
                //contraseña
                char[] contra =  nuevo.getTXTclave().getPassword();
                String contrasena = String.valueOf(contra);
                
                usu.setDoc(Integer.parseInt(nuevo.getTXTdocumento().getText()));
                usu.setNom(nuevo.getTXTnombre().getText());
                usu.setFec(fecha);
                usu.setTele(nuevo.getTXTtelefono().getText());
                usu.setCorreo(nuevo.getTXTcorreo().getText());
                usu.setDire(nuevo.getTXTdireccion().getText());
                usu.setSex(sexo);
                usu.setLog(nuevo.getTXTlogin2().getText());
                usu.setContra(contrasena);
                
                //usu.setFec(Integer.parsed(fecha));
                
             ///  try {
               //    usu.Insertar_USUARIO();
              // } catch (SQLException ex){
                   //Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null,nuevo.g);
               }
                       
        }
        usu.limpiar(nuevo.getJpanelUsuario().getComponents());
        
     if (e.getSource().equals(nuevo.getBtncancelar())){
         
     }
    
}
}

