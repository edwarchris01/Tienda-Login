
package Controlador;

import Modelo.ModeloCliente;
import Modelo.ModeloFacturaCompra;
import Modelo.ModeloUsuario;
import Modelo.ModeloVenta;
import Vista.NuevoVenta;
import Vista.Principal;
import Vista.agregarFacturaC;
import Vista.buscarCliente;
import Vista.buscarProducto;
import Vista.buscarUsuario;
import Vista.detalleFacturaCompra;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;




public class ControladorFactura implements ActionListener, DocumentListener {
    
   Principal princi = new Principal();//Instancia(Llama) la ventana principal
    NuevoVenta nuevov = new NuevoVenta();
    ModeloFacturaCompra modelf = new ModeloFacturaCompra();//Instancia el modelo de usuario
    ModeloUsuario modelusu = new ModeloUsuario();
    ModeloCliente modelcli = new ModeloCliente();
    ModeloVenta modelventa = new ModeloVenta();
    buscarUsuario buscarusu = new buscarUsuario();
    buscarCliente buscarcli = new buscarCliente();
    detalleFacturaCompra detalle = new detalleFacturaCompra();
    agregarFacturaC agregarf = new agregarFacturaC();
    buscarProducto buscarprod = new buscarProducto();

    public ControladorFactura() {
        buscarusu.getTxtBusacarUsuario().getDocument().addDocumentListener(this);
        buscarcli.getTxtBuscarVenta().getDocument().addDocumentListener(this);
        nuevov.getBntGuardar().addActionListener(this);
        nuevov.getBtnCancelar().addActionListener( this);
       nuevov.getBtnBuscarC().addActionListener(this);
      nuevov.getBtnBuscarU().addActionListener(this);
        nuevov.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        buscarusu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      buscarcli.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        detalle.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        agregarf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        nuevov.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {

                ControladorPrincipal pri = new ControladorPrincipal();
                pri.iniciarSesion(4);
            }
                      
        });
        
        buscarusu.addWindowListener(new WindowAdapter(){
             @Override
             public void windowClosed(WindowEvent e) {
                nuevov.setVisible(true);
                buscarusu.setVisible(false);
             }
        });    
        
        buscarcli.addWindowListener(new WindowAdapter(){
             @Override
             public void windowClosed(WindowEvent e) {
                nuevov.setVisible(true);
                buscarcli.setVisible(false);
             }
        });   

    }

    public void agreFactV(){
        agregarf.setVisible(true);
        agregarf.setLocationRelativeTo(null);
    }
    
    public void controlar_FacturaVenta() {

        /*Al cerrar la ventana nuevo no cierra el programa sino que abre la ventana principal*/
        princi.setVisible(false);//Cierra la ventana principal para a que solo se visualice la ventana de nuevo usuario
        nuevov.setLocationRelativeTo(null);
        nuevov.setTitle("Nueva Venta");
        nuevov.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(nuevov.getBtnBuscarC())){
            nuevov.setVisible(false);
            buscarcli.setVisible(true);
            modelcli.mostrarTableCliente(buscarcli.getTableBuscarCliente(), "", "Cliente");

            buscarcli.getTxtBuscarVenta().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    buscarcli.getTxtBuscarVenta().setText("");
                    buscarcli.getTxtBuscarVenta().setForeground(Color.green);
                }
            });
            buscarcli.getTableBuscarCliente().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int fila = buscarcli.getTableBuscarCliente().rowAtPoint(e.getPoint());
                    int colum = buscarcli.getTableBuscarCliente().columnAtPoint(e.getPoint());
                    modelcli.setDoc(Integer.parseInt(buscarcli.getTableBuscarCliente().getValueAt(fila, 0).toString()));
                    if (colum == 9) {
                        buscarcli.setVisible(false);
                        nuevov.setVisible(true);
                        Object prove = modelcli.getDoc();
                        nuevov.getTxtcliente().setText(prove.toString());
                    }
                }
            }
            );
        }
        if (e.getSource().equals(nuevov.getBtnBuscarU())) {
           
            nuevov.setVisible(false);
            buscarusu.setVisible(true);
            modelusu.mostrarTablaUsuario(buscarusu.getTableBuscarUsuario(), "", "buscar");

            buscarusu.getTxtBusacarUsuario().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    buscarusu.getTxtBusacarUsuario().setText("");
                    buscarusu.getTxtBusacarUsuario().setForeground(Color.green);
                }
            });
            buscarusu.getTableBuscarUsuario().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int fila = buscarusu.getTableBuscarUsuario().rowAtPoint(e.getPoint());
                    int colum = buscarusu.getTableBuscarUsuario().columnAtPoint(e.getPoint());

                    modelusu.setDoc(Integer.parseInt(buscarusu.getTableBuscarUsuario().getValueAt(fila, 0).toString()));
                    if (colum == 9) {
                        buscarusu.setVisible(false);
                        nuevov.setVisible(true);
                        Object usu = modelusu.getDoc();
                        nuevov.getTxtusuario().setText(usu.toString());
                    }
                }

            });

        }

        if (e.getSource().equals(nuevov.getBntGuardar())) {           
            
            if ((nuevov.getTxtcliente().getText().isEmpty())
                    || (nuevov.getTxtusuario().getText().isEmpty())
                    ||(nuevov.getTxtcomprobante().getText().isEmpty())
                    || (nuevov.getBoxtipoPago().getSelectedItem().equals("Selecione"))) {
                JOptionPane.showMessageDialog(null, "Debes completar los campos requerido...");
            } else {
                modelf.setProve(Integer.parseInt(nuevov.getTxtcliente().getText()));
                modelf.setUsuario(Integer.parseInt(nuevov.getTxtusuario().getText()));
                modelf.setTipo(nuevov.getBoxtipoPago().getSelectedItem().toString());
            }
            if (nuevov.getBntGuardar().getText().equals("Guardar")) {
                modelventa.insertarFacturaV();
                modelventa.limpiar(nuevov.getjPanelVenta().getComponents());
            } else {
                modelventa.actualizarFacturaV();
                nuevov.setVisible(false);
                modelventa.mostrarTablaFacturaVenta(princi.getTableUsuario(), "", "Venta");
                nuevov.dispose();
            }
        }

        if (e.getSource().equals(nuevov.getBtnCancelar())) {
            nuevov.dispose();
        }
    }

    void actualizar_FacturaVenta(int id) {
        modelventa.buscarFacturaV(id);
        nuevov.getTxtcomprobante().setEnabled(false);
        nuevov.getTxtcomprobante().setText(String.valueOf(modelventa.getCom()));
        nuevov.getTxtcliente().setText(String.valueOf(modelventa.getCli()));
        nuevov.getTxtusuario().setText(String.valueOf(modelventa.getUsu()));
        
        nuevov.getBoxtipoPago().setSelectedItem(modelf.getTipo());
        nuevov.getJLtitulo().setText("Atualizar Venta");
       
        nuevov.getJLtitulo();
        princi.setVisible(false);
        nuevov.setLocationRelativeTo(null);
        nuevov.getBtnCancelar().setText("Actualizar");
        nuevov.setVisible(true);
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        modelusu.mostrarTablaUsuario(buscarusu.getTableBuscarUsuario(), buscarusu.getTxtBusacarUsuario().getText(), "");
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        modelusu.mostrarTablaUsuario(buscarusu.getTableBuscarUsuario(), buscarusu.getTxtBusacarUsuario().getText(), "");
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        modelusu.mostrarTablaUsuario(buscarusu.getTableBuscarUsuario(), buscarusu.getTxtBusacarUsuario().getText(), "");
    }
        
}
