
package Controlador;

import Modelo.ModeloCliente;
import Vista.Nuevo_Cliente;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ControladorCliente implements ActionListener {
    
          Principal princi = new Principal();//Instancia(Llama) la ventana principal
    Nuevo_Cliente nuev = new Nuevo_Cliente();
    ModeloCliente cli = new ModeloCliente();//Instancia el modelo de usuario
    

    
    public  ControladorCliente(){
         nuev.getBtnGuardar().addActionListener(this);
         nuev.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
          nuev.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                   
                    
             ControladorPrincipal pri = new ControladorPrincipal();
             pri.iniciarSesion();
                }
            });
                   
        }
    
    public void controlar_cli() {
    
         /*Al cerrar la ventana nuevo no cierra el programa sino que abre la ventana principal*/
          
            princi.setVisible(false);//Cierra la ventana principal para a que solo se visualice la ventana de nuevo usuario
            nuev.setLocationRelativeTo(null);
            nuev.setVisible(true);
            
            //Lleno el combobox de sexo
            nuev.getBoxSexo().addItem("Seleccione...");
            Map<String,Integer>dato = cli.llenarCombo("sexo");
            for(String sexo:dato.keySet()){
                nuev.getBoxSexo().addItem(sexo);
            }
            //Lleno el combobox de rol
            
 }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource().equals(nuev.getBtnGuardar())){    
        if (nuev.getTxtDocumento().getText().isEmpty() || nuev.getTxtNombre().getText().isEmpty() || nuev.getTxtCorreo().getText().isEmpty()
                || nuev.getTxtTelefono().getText().isEmpty()
                || nuev.getBoxSexo().getSelectedItem().equals("Selecione")
                || nuev.getDateSexo()== null) {
              JOptionPane.showMessageDialog(null,"Debes completar los campos requerido..." );
        }else {
         String valorSexo = nuev.getBoxSexo().getSelectedItem().toString();
            int sexo = cli.llenarCombo("sexo").get(valorSexo);
                   
        }
            
        }
    
    }
    
                 
            
           
    }

