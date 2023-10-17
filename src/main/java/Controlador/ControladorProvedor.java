/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloProvedor;
import Vista.Nuevo_Provedor;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class ControladorProvedor implements ActionListener {
     
            Principal princi = new Principal();//Instancia(Llama) la ventana principal
            Nuevo_Provedor prove = new Nuevo_Provedor(); //Instancia el modelo de usuario
            ModeloProvedor mpro = new ModeloProvedor();

    
    public  ControladorProvedor (){
         prove.getBtnGuardar().addActionListener(this);
         prove.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
          prove.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                   
                    
             ControladorPrincipal pri = new ControladorPrincipal();
             pri.iniciarSesion();
                }
            });
                   
        }
    
    public void controlar_prove() {
    
         /*Al cerrar la ventana nuevo no cierra el programa sino que abre la ventana principal*/
          
            princi.setVisible(false);//Cierra la ventana principal para a que solo se visualice la ventana de nuevo usuario
            prove.setLocationRelativeTo(null);
            prove.setVisible(true);
            
            //Lleno el combobox de sexo
            prove.getBoxSexo().addItem("Seleccione...");
            Map<String,Integer>dato = mpro.llenarCombo("sexo");
            for(String sexo:dato.keySet()){
                prove.getBoxSexo().addItem(sexo);
            }
            //Lleno el combobox de rol
            prove.getBoxPersona().addItem("Seleccione...");
            Map<String,Integer>datos = mpro.llenarCombo("provedor");
            for(String provedor:datos.keySet()){
                prove.getBoxPersona().addItem( provedor);
 }
    
                 
            
           
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if (e.getSource().equals(prove.getBtnGuardar())){    
        if (prove.getTxtDocumento().getText().isEmpty() || prove.getTxtNombre().getText().isEmpty() || prove.getTxtCorreo().getText().isEmpty()
             || prove.getBoxPersona().getSelectedItem().equals("Selecione")|| prove.getTxtTelefono().getText().isEmpty()
                || prove.getBoxSexo().getSelectedItem().equals("Selecione")
                || prove.getDateFecha()== null) {
              JOptionPane.showMessageDialog(null,"Debes completar los campos requerido..." );
        }else {
         String valorSexo = prove.getBoxSexo().getSelectedItem().toString();
         String valorPersona = prove.getBoxSexo().getSelectedItem().toString();
            int sexo = mpro.llenarCombo("sexo").get(valorSexo);
            int TipoPersona = mpro.llenarCombo("Tipo_provedor").get(valorPersona);
                   
        }
            
         }
    }
}
 