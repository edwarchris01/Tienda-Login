
package Controlador;

import Modelo.ModeloCliente;
import Modelo.ModeloProvedor;
import Modelo.ModeloUsuario;
import Modelo.ModeloProducto;
import Vista.Nueva_Factura;
import Vista.Nueva_Producto;
import Vista.Nuevo_Cliente;
import Vista.Nuevo_Provedor;
import Vista.Nuevo_Usuario;
import Vista.Nuevo_Venta;
import Vista.Principal;
import java.awt.Color;
import static java.awt.Color.black;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/*import java.awt.event.WindowAdapter;*/
public final class ControladorPrincipal implements ActionListener, ChangeListener, DocumentListener {

    Principal princi = new Principal();//Instancia(Llama) la ventana principal
    Nuevo_Usuario nuevo = new Nuevo_Usuario();//Instanca (Llama) la ventana(vista) Nuevo usuario
    ModeloUsuario usu = new ModeloUsuario();//Instancia el modelo de usuario
    ControladorUsuario controUsu = new ControladorUsuario();
    ControladorCliente controCli = new ControladorCliente();
    Nuevo_Cliente nuev = new Nuevo_Cliente();
    Nueva_Producto nuePro = new Nueva_Producto();
    Nuevo_Venta nueVenta = new Nuevo_Venta();
    Nueva_Factura compraF = new Nueva_Factura();
    Nuevo_Provedor nuep = new Nuevo_Provedor();
    ModeloProvedor modpro = new ModeloProvedor();
    ModeloCliente modelcli = new  ModeloCliente();
    ModeloProducto modprod = new ModeloProducto();
    ControladorProducto controlpro = new ControladorProducto();
    ControladorProvedor conpro = new ControladorProvedor();
    

    public ControladorPrincipal() {
        princi.getBtnNuevo().addActionListener(this);
        princi.getBtnNuevo2().addActionListener(this);//Agrega el boton nuevo para que se escuche cuando se de clic
        princi.getBtnNuevo3().addActionListener(this);
        princi.getBtnNuevo4().addActionListener(this);
        princi.getBtnNuevo5().addActionListener(this);
        princi.getBtnFactura().addActionListener(this);
//        princi.getBtnBuscarUsu().addActionListener(this);
        princi.getJBuscar().addActionListener(this);
        princi.getJbuscarProducto().addActionListener(this);
        princi.getJbuscarC().addActionListener(this);
        princi.getJbuscarF().addActionListener(this);
        princi.getJbuscarP().addActionListener(this); 
       princi.getTablePrincipal().addChangeListener(this);
        princi.getJbuscarP().getDocument().addDocumentListener(this);
       princi.getJBuscar().getDocument().addDocumentListener(this);
        princi.getJbuscarProducto().getDocument().addDocumentListener(this); //que escuche el txt para buscar
        princi.getJbuscarC().getDocument().addDocumentListener(this);
        nuevo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        nuev.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Desactiva la x que cierrar el programa para que permita abrir o volver a la ventana principal
        nuePro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        nueVenta.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        compraF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        nuep.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }

    public void iniciarSesion(int valor) {
        princi.setLocationRelativeTo(null);//Centra la ventana
        princi.setTitle("Principal");//Le da titulo a la ventana
        princi.setVisible(true);//Hace visible la ventana
        princi.setExtendedState(JFrame.MAXIMIZED_BOTH);
        princi.getTablePrincipal().setSelectedIndex(valor);
        gestionUsuario();
       
       gestionCliente();
    }

   
    public void gestionUsuario() {
        
        usu.mostrarTablaUsuario(princi.getTableUsuario(), "", "Usuario");
        princi.getJBuscar().addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                princi.getJBuscar().setText("");
                princi.getJBuscar().setForeground(Color.black);                
            }
            
        });        

        //            borra toto cunado le damos cli a la caja de texto
        princi.getTableUsuario().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
              int fila = princi.getTableUsuario().rowAtPoint(e.getPoint());
              int colum = princi.getTableUsuario().columnAtPoint(e.getPoint());
              usu.setDoc(Integer.parseInt(princi.getTableUsuario().getValueAt(fila, 1).toString()));
              if (colum == 9) {
                  princi.setVisible(false);
                  princi.setExtendedState(JFrame.MAXIMIZED_BOTH);
                  controUsu.actualizarUsuario(usu.getDoc());
                  
              }
              if (colum==10){
                 controUsu.eliminarUsuario(usu.getDoc());
                  usu.mostrarTablaUsuario(princi.getTableUsuario(), "", "Usuario");
                  
//                  controUsu.eliminarUsuario(usu.getDoc());
//                  usu.mostrarTablaUsuario(princi.getTableUsuario(), "", "Usuario");
                          
              }
            }
        });             
    }
    
    public void gestionCliente() {
       modelcli.mostrarTableCliente(princi.getTableCliente(), "", "Cliente");
        princi.getJbuscarC().addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                princi.getJbuscarC().setText("");
                princi.getJbuscarC().setForeground( Color.red);
            }
            
        });  
        princi.getTableCliente().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
              int fila = princi.getTableCliente().rowAtPoint(e.getPoint());
              int colum = princi.getTableCliente().columnAtPoint(e.getPoint());
              modelcli.setDoc(Integer.parseInt(princi.getTableCliente().getValueAt(fila, 1).toString()));
              
               if (colum == 8) {
                  princi.setVisible(false);
                  princi.setExtendedState(JFrame.MAXIMIZED_BOTH);
                  controCli.actualizarCliente(modelcli.getDoc());
                  
              }
              if (colum==9){
                 controCli.eliminarCliente(modelcli.getDoc());                
                  modelcli.mostrarTableCliente(princi.getTableCliente(), "", "Cliente");
                  
//                  controCli.eliminarCliente(modelcli.getDoc());
//             modelcli.mostrarTableCliente(princi.getTableCliente(), "", "Cliente");
                          
              }
            }
        });
    }
        public void gestionProvedor() {
          
       modpro.mostrarTableProvedor(princi.getTableProvedor(), "", "Provedor");
        princi.getJbuscarP().addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                princi.getJbuscarP().setText("");
                princi.getJbuscarP().setForeground(Color.red);
            }
            
        });  
        princi.getTableProvedor().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
              int fila = princi.getTableProvedor().rowAtPoint(e.getPoint());
              int colum = princi.getTableProvedor().columnAtPoint(e.getPoint());
              modpro.setDoc(Integer.parseInt(princi.getTableProvedor().getValueAt(fila, 0).toString()));
              
               if (colum == 9) {
                  princi.setVisible(false);
//                  princi.setExtendedState(JFrame.MAXIMIZED_BOTH);
                  conpro.actualizarProvedor(modpro.getDoc());
                  
              }
              if (colum==10){      
                   conpro.eliminarProvedor(modpro.getDoc());    
                  modpro.mostrarTableProvedor(princi.getTableProvedor(), "", "Provedor");
                  
                 
                  
                          
              }
            }
        });
        }
       
        public void gestionProducto() {
          
       modprod.mostrarTablaProducto(princi.getTableProducto(), "", "Producto");
        princi.getJbuscarProducto().addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                princi.getJbuscarProducto().setText("");
                princi.getJbuscarProducto().setForeground(Color.red);
            }
            
        });  
        princi.getTableProducto().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
              int fila = princi.getTableProducto().rowAtPoint(e.getPoint());
              int colum = princi.getTableProducto().columnAtPoint(e.getPoint());
              modprod.setDoc(Integer.parseInt(princi.getTableProducto().getValueAt(fila, 0).toString()));
              
               if (colum == 6) {
                  princi.setVisible(false);
//                  princi.setExtendedState(JFrame.MAXIMIZED_BOTH);
                  controlpro.actualizarProducto(modprod.getDoc());
                  
              }
              if (colum==7){      
                   controlpro.eliminarProducto(modprod.getDoc());    
                  modprod.mostrarTablaProducto(princi.getTableProducto(), "", "Producto");                                                                      
              }
            }
        });
        }
    @Override
    public void actionPerformed(ActionEvent e) { //Valida los eventos
        if (e.getSource().equals(princi.getBtnNuevo())) {//Se crea al acción cuando le damos clic en el boton nuevo de la vista princial
            princi.setVisible(false);
            controUsu.controlar_usu();
        }

        if (e.getSource().equals(princi.getBtnNuevo2())) {//Se crea al acción cuando le damos clic en el boton nuevo de la vista princial
            princi.setVisible(false);

            controCli.controlarclite();

        }

        if (e.getSource().equals(princi.getBtnNuevo3())) {//Se crea al acción cuando le damos clic en el boton nuevo de la vista princial
            princi.setVisible(false);

            conpro.controlar_prove();

        }

        if (e.getSource().equals(princi.getBtnNuevo4())) {//Se crea al acción cuando le damos clic en el boton nuevo de la vista princial
            princi.setVisible(false);

           controlpro.iniciarProducto();
        }

        if (e.getSource().equals(princi.getBtnNuevo5())) {//Se crea al acción cuando le damos clic en el boton nuevo de la vista princial
            princi.setVisible(false);

            nueVenta.setLocationRelativeTo(null);
            nueVenta.setTitle("Nuevo_Venta");
            nueVenta.setVisible(true);
        }

        if (e.getSource().equals(princi.getBtnFactura())) {//Se crea al acción cuando le damos clic en el boton nuevo de la vista princial
            princi.setVisible(false);

            compraF.setLocationRelativeTo(null);
            compraF.setTitle("Nuevo_Factura");
            compraF.setVisible(true);
        }
        
    }
 
       public void gestionFactura() {
        princi.getJtPrincipal().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
            }          
        });
        princi.getJBuscar().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                princi.getJBuscar().setText("");
                princi.getJBuscar().setForeground(black);
            }
        });
    }
       
    @Override
    public void stateChanged(ChangeEvent e) {
        int selecionar = princi.getJtPrincipal().getSelectedIndex();// indica en que posicion esta la pestaña en la principal
        System.out.println("La pantalla esta en esta posicion " + selecionar);
        if (selecionar == 0) {
            gestionUsuario();
        }
         if (selecionar == 1) {
            gestionProvedor();
        }
         if (selecionar == 2) {
            gestionCliente();
        }
         
           if (selecionar == 3) {
           gestionProducto();
        }
            if (selecionar == 4) {
           gestionFactura();
        }
             if (selecionar == 5) {
//            gestionVenta();
        }
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        usu.mostrarTablaUsuario(princi.getTableUsuario(), princi.getJBuscar().getText(),"Usuario");
        modelcli.mostrarTableCliente(princi.getTableCliente(), princi.getJbuscarC().getText(), "Cliente");
        modpro.mostrarTableProvedor(princi.getTableProvedor(), princi.getJbuscarP().getText(), "Provedor");
        modprod .mostrarTablaProducto(princi.getTableProducto(), princi.getJbuscarProducto().getText(), "Producto");
   
        
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        usu.mostrarTablaUsuario(princi.getTableUsuario(), princi.getJBuscar().getText(),"Usuario");
        modelcli.mostrarTableCliente(princi.getTableCliente(), princi.getJbuscarC().getText(), "Cliente");
        modpro.mostrarTableProvedor(princi.getTableProvedor(), princi.getJbuscarP().getText(), "Provedor");
         modprod .mostrarTablaProducto(princi.getTableProducto(), princi.getJbuscarProducto().getText(), "Producto");
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        usu.mostrarTablaUsuario(princi.getTableUsuario(), princi.getJBuscar().getText(),"Usuario");
        modelcli.mostrarTableCliente(princi.getTableCliente(), princi.getJbuscarC().getText(), "Cliente");
        modpro.mostrarTableProvedor(princi.getTableProvedor(), princi.getJbuscarP().getText(), "Provedor");
         modprod .mostrarTablaProducto(princi.getTableProducto(), princi.getJbuscarProducto().getText(), "Producto");
    }
     
    
    
}
