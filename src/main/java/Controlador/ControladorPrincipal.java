/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloProvedor;
import Modelo.ModeloUsuario;
import Vista.Login;
import Vista.Nueva_Factura;
import Vista.Nueva_Producto;
import Vista.Nuevo_Cliente;
import Vista.Nuevo_Provedor;
import Vista.Nuevo_Usuario;
import Vista.Nuevo_Venta;
import Vista.Principal;
import static java.awt.Color.black;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
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
    ControladorProvedor conpro = new ControladorProvedor();
    Login log = new Login();

    public ControladorPrincipal() {
        princi.getBtnNuevo().addActionListener(this);
        princi.getBtnNuevo2().addActionListener(this);//Agrega el boton nuevo para que se escuche cuando se de clic
        princi.getBtnNuevo3().addActionListener(this);
        princi.getBtnNuevo4().addActionListener(this);
        princi.getBtnNuevo5().addActionListener(this);
        princi.getBtnFactura().addActionListener(this);
        princi.getBtnBuscarUsu().addActionListener(this);
        princi.getJBuscar().getDocument().addDocumentListener(this); //que escuche el txt para buscar
        nuevo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        nuev.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Desactiva la x que cierrar el programa para que permita abrir o volver a la ventana principal
        nuePro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        nueVenta.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        compraF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        nuep.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        manejoPestana();
    }

    public void iniciarSesion() {
        princi.setLocationRelativeTo(null);//Centra la ventana
        princi.setTitle("Principal");//Le da titulo a la ventana
        princi.setVisible(true);//Hace visible la ventana
    }

    public void manejoPestana() {

    }

    public void gestionUsuario() {
        princi.getJtPrincipal().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
            }
        });

        //            borra toto cunado le damos cli a la caja de texto
        princi.getJBuscar().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                princi.getJBuscar().setText("");
                princi.getJBuscar().setForeground(black);
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

            controCli.controlar_cli();

        }

        if (e.getSource().equals(princi.getBtnNuevo3())) {//Se crea al acción cuando le damos clic en el boton nuevo de la vista princial
            princi.setVisible(false);

            conpro.controlar_prove();

        }

        if (e.getSource().equals(princi.getBtnNuevo4())) {//Se crea al acción cuando le damos clic en el boton nuevo de la vista princial
            princi.setVisible(false);

            nuePro.setLocationRelativeTo(null);
            nuePro.setTitle("Nueva_Producto");
            nuePro.setVisible(true);

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

    @Override
    public void stateChanged(ChangeEvent e) {
        int selecionar = princi.getJtPrincipal().getSelectedIndex();// indica en que posicion esta la pestaña en la principal
        System.out.println("La pantalla esta en esta posicion " + selecionar);
        if (selecionar == 0) {
            gestionUsuario();
        }
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        usu.mostrarTablaUsuario(princi.getTableUsuario(), princi.getJBuscar().getText());
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        usu.mostrarTablaUsuario(princi.getTableUsuario(), princi.getJBuscar().getText());
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        usu.mostrarTablaUsuario(princi.getTableUsuario(), princi.getJBuscar().getText());
    }
}
