/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Nuevo_Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Nuevo_Cliente
     */
    public Nuevo_Cliente() {
        initComponents();
    }

    public JComboBox<String> getBoxSexo() {
        return BoxSexo;
    }

    public void setBoxSexo(JComboBox<String> BoxSexo) {
        this.BoxSexo = BoxSexo;
    }

    public JButton getBtnCancelar() {
        return BtnCancelar;
    }

    public void setBtnCancelar(JButton BtnCancelar) {
        this.BtnCancelar = BtnCancelar;
    }

    public JButton getBtnGuardar() {
        return BtnGuardar;
    }

    public void setBtnGuardar(JButton BtnGuardar) {
        this.BtnGuardar = BtnGuardar;
    }

    public JTextField getTxtCorreo() {
        return TxtCorreo;
    }

    public void setTxtCorreo(JTextField TxtCorreo) {
        this.TxtCorreo = TxtCorreo;
    }

    public JTextField getTxtDireccion() {
        return TxtDireccion;
    }

    public void setTxtDireccion(JTextField TxtDireccion) {
        this.TxtDireccion = TxtDireccion;
    }

    public JTextField getTxtDocumento() {
        return TxtDocumento;
    }

    public void setTxtDocumento(JTextField TxtDocumento) {
        this.TxtDocumento = TxtDocumento;
    }

    public JTextField getTxtNombre() {
        return TxtNombre;
    }

    public void setTxtNombre(JTextField TxtNombre) {
        this.TxtNombre = TxtNombre;
    }

    public JTextField getTxtTelefono() {
        return TxtTelefono;
    }

    public void setTxtTelefono(JTextField TxtTelefono) {
        this.TxtTelefono = TxtTelefono;
    }

    public JDateChooser getjDateChooser1() {
        return DateFecha;
    }

    public void setjDateChooser1(JDateChooser jDateChooser1) {
        this.DateFecha = jDateChooser1;
    }

    public JDateChooser getDateFecha() {
        return DateFecha;
    }

    public void setDaFecha(JDateChooser DateSexo) {
        this.DateFecha = DateSexo;
    }

    public JPanel getjPanelCliente() {
        return jPanelCliente;
    }

    public void setjPanelCliente(JPanel jPanelCliente) {
        this.jPanelCliente = jPanelCliente;
    }

    public JComboBox<String> getBoxDocumento() {
        return BoxDocumento;
    }

    public void setBoxDocumento(JComboBox<String> BoxDocumento) {
        this.BoxDocumento = BoxDocumento;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCliente = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtDocumento = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        TxtCorreo = new javax.swing.JTextField();
        TxtDireccion = new javax.swing.JTextField();
        BoxSexo = new javax.swing.JComboBox<>();
        DateFecha = new com.toedter.calendar.JDateChooser();
        BtnGuardar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        BoxDocumento = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelCliente.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel1.setText("NUEVO CLIENTE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Documento");

        jLabel3.setText("Nombre");

        jLabel4.setText("Telefono");

        jLabel5.setText("Correo");

        jLabel6.setText("Sexo");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha de nacimiento");

        jLabel8.setText("Direccion");

        BoxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxSexoActionPerformed(evt);
            }
        });

        BtnGuardar.setBackground(new java.awt.Color(102, 102, 255));
        BtnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnCancelar.setBackground(new java.awt.Color(102, 102, 255));
        BtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancelar.setText("Cancelar");

        jLabel9.setText("TipoDocumento");

        BoxDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selecione...", "cedula de ciudania", "cedula extranjera", "pasaporte" }));

        javax.swing.GroupLayout jPanelClienteLayout = new javax.swing.GroupLayout(jPanelCliente);
        jPanelCliente.setLayout(jPanelClienteLayout);
        jPanelClienteLayout.setHorizontalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanelClienteLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DateFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(TxtDireccion)))
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClienteLayout.createSequentialGroup()
                                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BoxSexo, 0, 209, Short.MAX_VALUE)
                                    .addComponent(TxtCorreo)))
                            .addGroup(jPanelClienteLayout.createSequentialGroup()
                                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanelClienteLayout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(38, 38, 38))
                                        .addGroup(jPanelClienteLayout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(56, 56, 56)))
                                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClienteLayout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)))
                                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(BoxDocumento, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TxtDocumento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))))))
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(BtnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnCancelar)
                .addGap(79, 79, 79))
        );
        jPanelClienteLayout.setVerticalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(BoxDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(TxtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(BoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(DateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardar)
                    .addComponent(BtnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jPanelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BoxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxSexoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxDocumento;
    private javax.swing.JComboBox<String> BoxSexo;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnGuardar;
    private com.toedter.calendar.JDateChooser DateFecha;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtDocumento;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCliente;
    // End of variables declaration//GEN-END:variables
}
