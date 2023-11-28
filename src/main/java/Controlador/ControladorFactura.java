
package Controlador;

import Modelo.ModeloUsuario;
import Vista.buscarUsuario;


public class ControladorFactura {
    
    public ControladorFactura(){
}
    public void buscar(String buscar){
            if(buscar.equals("Usuario")){
                buscarUsuario busUsu = new  buscarUsuario();
                ModeloUsuario modusu = new ModeloUsuario();
                modusu.mostrarTablaUsuario(busUsu.getTableBuscarUsuario(), "", "Factura");
                System.out.println("Factura");
                busUsu.setLocationRelativeTo(null);
                busUsu.setVisible(true);
            } else {
                
            }
            
        }
}
