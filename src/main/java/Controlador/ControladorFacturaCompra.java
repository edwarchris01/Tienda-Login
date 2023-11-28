package Controlador;

import Modelo.ModeloFacturaCompra;
import Modelo.ModeloProvedor;
import Modelo.ModeloUsuario;
import Vista.Nueva_FacturaCompra;
import Vista.Principal;
import Vista.buscarProveedor;
import Vista.buscarUsuario;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ControladorFacturaCompra implements ActionListener, DocumentListener {

    Principal princi = new Principal();//Instancia(Llama) la ventana principal
    Nueva_FacturaCompra nuevoF = new Nueva_FacturaCompra();
    ModeloFacturaCompra modelf = new ModeloFacturaCompra();//Instancia el modelo de usuario
    ModeloUsuario modelusu = new ModeloUsuario();
    ModeloProvedor modelpro = new ModeloProvedor();
    buscarUsuario buscarusu = new buscarUsuario();
    buscarProveedor buscarpro = new buscarProveedor();

    public ControladorFacturaCompra() {
      buscarusu.getTxtBusacarUsuario().getDocument().addDocumentListener(this);
      buscarpro.getTxtBuscarProveedor().getDocument().addDocumentListener(this);
        nuevoF.getBtnGuargarF().addActionListener(this);
        nuevoF.getBtnCancelarF().addActionListener(this);
        nuevoF.getBntProvedor().addActionListener(this);
        nuevoF.getBtnUsuario().addActionListener(this);
        nuevoF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        nuevoF.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {

                ControladorPrincipal pri = new ControladorPrincipal();
                pri.iniciarSesion(4);
            }
        });

    }

    public void controlar_FacturaCompra() {
       
        /*Al cerrar la ventana nuevo no cierra el programa sino que abre la ventana principal*/
        princi.setVisible(false);//Cierra la ventana principal para a que solo se visualice la ventana de nuevo usuario
        nuevoF.setLocationRelativeTo(null);
        nuevoF.setTitle("Nueva Factura Compra");
        nuevoF.setVisible(true);
//        buscar_usuario();
    }
    
//    
//      public void buscar_usuario(){
//          buscarusu.getTxtBusacarUsuario().addMouseListener(new MouseAdapter(){
//              public void mouseClicked(MouseAdapter e)    {
//                  buscarusu.getTxtBusacarUsuario().setText("");
//                  buscarusu.getTxtBusacarUsuario().setForeground(Color.green);
//              }    
//      });
//      }
//    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(nuevoF.getBntProvedor())) {
            nuevoF.setVisible(false);
            buscarpro.setVisible(true);
            modelpro.mostrarTableProvedor(buscarpro.getTableBuscarProveedor(), "", "Proveedor");
            
            buscarpro.getTxtBuscarProveedor().addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                
                buscarpro.getTxtBuscarProveedor().setText("");               
                buscarpro.getTxtBuscarProveedor().setForeground(Color.green);
            }           
            });
            buscarpro.getTableBuscarProveedor().addMouseListener(new MouseAdapter(){
                @Override
                public void mouseClicked (MouseEvent e ){
                    int fila = buscarpro.getTableBuscarProveedor().rowAtPoint(e.getPoint());
                    int colum = buscarpro.getTableBuscarProveedor().columnAtPoint(e.getPoint());
                    modelpro.setDoc(Integer.parseInt(princi.getTableProvedor().getValueAt(fila, 0).toString()));
                    if (colum == 9){
//                          buscarusu.setVisible(false);
//                          nuevoF.setVisible(true);
                          Object prove= modelpro.getDoc();
                          nuevoF.getBtnUsuario().setText(prove.toString());
                      }
                }
            } 
            );
        }
        if (e.getSource().equals(nuevoF.getBtnUsuario())) {    
            
             nuevoF.setVisible(false);
            buscarusu.setVisible(true);
            modelusu.mostrarTablaUsuario(buscarusu.getTableBuscarUsuario(), "", "buscar");     
          
              buscarusu.getTxtBusacarUsuario().addMouseListener(new MouseAdapter(){
              @Override
              public void mouseClicked(MouseEvent e)    {
                  buscarusu.getTxtBusacarUsuario().setText("");
                  buscarusu.getTxtBusacarUsuario().setForeground(Color.green);
              }    
      });
              buscarusu.getTableBuscarUsuario().addMouseListener(new MouseAdapter() {
                  @Override
                  public void mouseClicked(MouseEvent e){
                      int fila = buscarusu.getTableBuscarUsuario().rowAtPoint(e.getPoint());
                      int colum = buscarusu.getTableBuscarUsuario().columnAtPoint(e.getPoint());
                      
                      modelusu.setDoc(Integer.parseInt(princi.getTableUsuario().getValueAt(fila, 0).toString()));
                      if (colum == 9){
//                          buscarusu.setVisible(false);
//                          nuevoF.setVisible(true);
                          Object usu = modelusu.getDoc();
                          nuevoF.getTXTusuario().setText(usu.toString());
                      }
                  }
                  
              });
              
           
        }
  
        
        if (e.getSource().equals(nuevoF.getBtnCancelarF())) {
            nuevoF.dispose();
        }
    }

    void actualizar_FacturaCompra(int id) {
        modelf.buscar_Factura(id);
        nuevoF.getTXTprovedor().setText(String.valueOf(modelf.getProve()));
        nuevoF.getTXTusuario().setText(String.valueOf(modelf.getUsuario()));
        nuevoF.getBoxTipoPago().setSelectedItem(modelf.getTipo());
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
modelusu.mostrarTablaUsuario(buscarusu.getTableBuscarUsuario(), buscarusu.getTxtBusacarUsuario().getText(), "");
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
modelusu.mostrarTablaUsuario(buscarusu.getTableBuscarUsuario(), buscarusu.getTxtBusacarUsuario().getText(), "");    }

    @Override
    public void changedUpdate(DocumentEvent e) {
modelusu.mostrarTablaUsuario(buscarusu.getTableBuscarUsuario(), buscarusu.getTxtBusacarUsuario().getText(), "");    }
}
