
package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Nueva_FacturaCompra extends javax.swing.JFrame {

    
    public Nueva_FacturaCompra() {
        initComponents();
    }

    public JComboBox<String> getBoxTipoPago() {
        return BoxTipoPago;
    }

    public void setBoxTipoPago(JComboBox<String> BoxTipoPago) {
        this.BoxTipoPago = BoxTipoPago;
    }

    public JButton getBtnCancelar() {
        return BtnCancelarF;
    }

    public void setBtnCancelar(JButton BtnCancelar) {
        this.BtnCancelarF = BtnCancelar;
    }

    public JButton getBtnCancelarF() {
        return BtnCancelarF;
    }

    public void setBtnCancelarF(JButton BtnCancelarF) {
        this.BtnCancelarF = BtnCancelarF;
    }

    public JButton getBtnGuargarF() {
        return BtnGuargarF;
    }

    public void setBtnGuargarF(JButton BtnGuargarF) {
        this.BtnGuargarF = BtnGuargarF;
    }

    public JTextField getTXTprovedor() {
        return TXTprovedor;
    }

    public void setTXTprovedor(JTextField TXTprovedor) {
        this.TXTprovedor = TXTprovedor;
    }

    public JTextField getTXTusuario() {
        return TXTusuario;
    }

    public void setTXTusuario(JTextField TXTusuario) {
        this.TXTusuario = TXTusuario;
    }

    public JPanel getJpanelFactura() {
        return jpanelFactura;
    }

    public void setJpanelFactura(JPanel jpanelFactura) {
        this.jpanelFactura = jpanelFactura;
    }

    public JButton getBntProvedor() {
        return bntProvedor;
    }

    public void setBntProvedor(JButton bntProvedor) {
        this.bntProvedor = bntProvedor;
    }

    public JButton getBtnUsuario() {
        return btnUsuario;
    }

    public void setBtnUsuario(JButton btnUsuario) {
        this.btnUsuario = btnUsuario;
    }

    public JTextField getTxtComprobante() {
        return txtComprobante;
    }

    public void setTxtComprobante(JTextField txtComprobante) {
        this.txtComprobante = txtComprobante;
    }

    public JLabel getJLnuevaFactura() {
        return JLnuevaFactura;
    }

    public void setJLnuevaFactura(JLabel JLnuevaFactura) {
        this.JLnuevaFactura = JLnuevaFactura;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelFactura = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TXTprovedor = new javax.swing.JTextField();
        TXTusuario = new javax.swing.JTextField();
        t = new javax.swing.JLabel();
        BtnGuargarF = new javax.swing.JButton();
        BtnCancelarF = new javax.swing.JButton();
        BoxTipoPago = new javax.swing.JComboBox<>();
        bntProvedor = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        JLnuevaFactura = new javax.swing.JLabel();
        txtComprobante = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanelFactura.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Identificacion Proveedor");

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Identificacion Usuario");

        TXTprovedor.setBackground(new java.awt.Color(239, 255, 247));
        TXTprovedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TXTprovedor.setBorder(null);
        TXTprovedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTprovedorActionPerformed(evt);
            }
        });

        TXTusuario.setEditable(false);
        TXTusuario.setBackground(new java.awt.Color(239, 255, 247));
        TXTusuario.setBorder(null);
        TXTusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTusuarioActionPerformed(evt);
            }
        });

        t.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        t.setForeground(new java.awt.Color(0, 102, 102));
        t.setText("Tipo de pago");

        BtnGuargarF.setBackground(new java.awt.Color(0, 102, 102));
        BtnGuargarF.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        BtnGuargarF.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuargarF.setText("Guardar");
        BtnGuargarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuargarFActionPerformed(evt);
            }
        });

        BtnCancelarF.setBackground(new java.awt.Color(0, 102, 102));
        BtnCancelarF.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        BtnCancelarF.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancelarF.setText("Cancelar");

        BoxTipoPago.setBackground(new java.awt.Color(239, 255, 247));
        BoxTipoPago.setEditable(true);
        BoxTipoPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BoxTipoPago.setForeground(new java.awt.Color(0, 102, 102));
        BoxTipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "PSE", "Tarjeta de Debito", "Tarjeta de Credito", "Efectivo", " " }));
        BoxTipoPago.setBorder(null);

        bntProvedor.setBackground(new java.awt.Color(0, 102, 102));
        bntProvedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        bntProvedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));

        btnUsuario.setBackground(new java.awt.Color(0, 102, 102));
        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btnUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        JLnuevaFactura.setBackground(new java.awt.Color(0, 0, 0));
        JLnuevaFactura.setFont(new java.awt.Font("Bell MT", 1, 48)); // NOI18N
        JLnuevaFactura.setForeground(new java.awt.Color(0, 102, 102));
        JLnuevaFactura.setText("Nueva  Factura Compra");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(JLnuevaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLnuevaFactura)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtComprobante.setBackground(new java.awt.Color(239, 255, 247));
        txtComprobante.setBorder(null);
        txtComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComprobanteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("N°Comprobante");

        javax.swing.GroupLayout jpanelFacturaLayout = new javax.swing.GroupLayout(jpanelFactura);
        jpanelFactura.setLayout(jpanelFacturaLayout);
        jpanelFacturaLayout.setHorizontalGroup(
            jpanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanelFacturaLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jpanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelFacturaLayout.createSequentialGroup()
                        .addGroup(jpanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtComprobante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(TXTprovedor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTusuario, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bntProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BoxTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelFacturaLayout.createSequentialGroup()
                        .addComponent(BtnGuargarF)
                        .addGap(130, 130, 130)
                        .addComponent(BtnCancelarF)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpanelFacturaLayout.setVerticalGroup(
            jpanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelFacturaLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jpanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpanelFacturaLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTprovedor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bntProvedor))
                .addGap(39, 39, 39)
                .addGroup(jpanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelFacturaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(11, 11, 11))
                    .addGroup(jpanelFacturaLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)))
                .addComponent(txtComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoxTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jpanelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuargarF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCancelarF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuargarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuargarFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGuargarFActionPerformed

    private void TXTusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTusuarioActionPerformed

    private void TXTprovedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTprovedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTprovedorActionPerformed

    private void txtComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComprobanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComprobanteActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxTipoPago;
    private javax.swing.JButton BtnCancelarF;
    private javax.swing.JButton BtnGuargarF;
    private javax.swing.JLabel JLnuevaFactura;
    private javax.swing.JTextField TXTprovedor;
    private javax.swing.JTextField TXTusuario;
    private javax.swing.JButton bntProvedor;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpanelFactura;
    private javax.swing.JLabel t;
    private javax.swing.JTextField txtComprobante;
    // End of variables declaration//GEN-END:variables
}
