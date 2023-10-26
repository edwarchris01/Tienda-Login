/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author edwch
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    public JButton getBtnNuevo() {
        return BtnNuevo;
    }

    public JTable getTableProvedor() {
        return TableProvedor;
    }

    public void setTableProvedor(JTable TableProvedor) {
        this.TableProvedor = TableProvedor;
    }

    public JTabbedPane getTablePrincipal() {
        return tablePrincipal;
    }

    public void setTablePrincipal(JTabbedPane tablePrincipal) {
        this.tablePrincipal = tablePrincipal;
    }

    public void setBtnNuevo(JButton BtnNuevo) {
        this.BtnNuevo = BtnNuevo;
    }

    public JButton getBtnNuevo2() {
        return BtnNuevo2;
    }

    public void setBtnNuevo2(JButton BtnNuevo2) {
        this.BtnNuevo2 = BtnNuevo2;
    }

    public JButton getBtnNuevo3() {
        return BtnNuevo3;
    }

    public void setBtnNuevo3(JButton BtnNuevo3) {
        this.BtnNuevo3 = BtnNuevo3;
    }

    public JTabbedPane getJtPrincipal() {
        return tablePrincipal;
    }

    public void setJtPrincipal(JTabbedPane jtPrincipal) {
        this.tablePrincipal = jtPrincipal;
    }

    public JTable getTableCliente() {
        return TableCliente;
    }

    public void setTableCliente(JTable TableCliente) {
        this.TableCliente = TableCliente;
    }

    

    public JTable getTableUsuario() {
        return TableUsuario;
    }

    public void setTableUsuario(JTable TableUsuario) {
        this.TableUsuario = TableUsuario;
    }

    public JTextField getJBuscar() {
        return JBuscar;
    }

    public void setJBuscar(JTextField JBuscar) {
        this.JBuscar = JBuscar;
    }

    public JButton getjBtnBuscar() {
        return jBtnBuscar;
    }

    public void setjBtnBuscar(JButton jBtnBuscar) {
        this.jBtnBuscar = jBtnBuscar;
    }

    public JButton getBtnBuscarUsu() {
        return BtnBuscarUsu;
    }

    public void setBtnBuscarUsu(JButton BtnBuscarUsu) {
        this.BtnBuscarUsu = BtnBuscarUsu;
    }

    public JButton getBtnNuevo4() {
        return BtnNuevo4;
    }

    public void setBtnNuevo4(JButton BtnNuevo4) {
        this.BtnNuevo4 = BtnNuevo4;
    }

    public JButton getBtnNuevo5() {
        return BtnNuevo5;
    }

    public void setBtnNuevo5(JButton BtnNuevo5) {
        this.BtnNuevo5 = BtnNuevo5;
    }

    

    public JButton getBtnFactura() {
        return BtnFactura;
    }

    public void setBtnFactura(JButton BtnFactura) {
        this.BtnFactura = BtnFactura;
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tablePrincipal = new javax.swing.JTabbedPane();
        Usuario = new javax.swing.JPanel();
        BtnNuevo = new javax.swing.JButton();
        JBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableUsuario = new javax.swing.JTable();
        BtnBuscarUsu = new javax.swing.JButton();
        Cliente = new javax.swing.JPanel();
        BtnNuevo2 = new javax.swing.JButton();
        JbuscarC = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableCliente = new javax.swing.JTable();
        jBtnBuscar = new javax.swing.JButton();
        Provedor = new javax.swing.JPanel();
        BtnNuevo3 = new javax.swing.JButton();
        JbuscarP = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableProvedor = new javax.swing.JTable();
        Factura = new javax.swing.JPanel();
        BtnFactura = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        JbuscarF = new javax.swing.JTextField();
        Producto = new javax.swing.JPanel();
        BtnNuevo4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Jbuscar = new javax.swing.JTextField();
        panelVenta = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnNuevo5 = new javax.swing.JButton();
        JbuscarP1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("TIENDA COM");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Usuario.setBackground(new java.awt.Color(153, 153, 153));
        Usuario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 255)));

        BtnNuevo.setBackground(new java.awt.Color(255, 153, 204));
        BtnNuevo.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        BtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-usuario.png"))); // NOI18N
        BtnNuevo.setText("Nuevo");
        BtnNuevo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });

        JBuscar.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        JBuscar.setForeground(new java.awt.Color(153, 153, 153));
        JBuscar.setText("Buscar usuario");
        JBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBuscarActionPerformed(evt);
            }
        });

        TableUsuario.setBackground(new java.awt.Color(204, 204, 255));
        TableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TableUsuario);

        BtnBuscarUsu.setText("jButton1");

        javax.swing.GroupLayout UsuarioLayout = new javax.swing.GroupLayout(Usuario);
        Usuario.setLayout(UsuarioLayout);
        UsuarioLayout.setHorizontalGroup(
            UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UsuarioLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(UsuarioLayout.createSequentialGroup()
                        .addComponent(BtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(BtnBuscarUsu)
                        .addGap(37, 37, 37))))
        );
        UsuarioLayout.setVerticalGroup(
            UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuarioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnNuevo)
                    .addComponent(JBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscarUsu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );

        tablePrincipal.addTab("Usuario", Usuario);

        Cliente.setBackground(new java.awt.Color(153, 153, 153));

        BtnNuevo2.setBackground(new java.awt.Color(255, 153, 204));
        BtnNuevo2.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        BtnNuevo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-usuario.png"))); // NOI18N
        BtnNuevo2.setText("Nuevo");
        BtnNuevo2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnNuevo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevo2ActionPerformed(evt);
            }
        });

        JbuscarC.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        JbuscarC.setForeground(new java.awt.Color(153, 153, 153));
        JbuscarC.setText("Buscar usuario");
        JbuscarC.setBorder(null);

        TableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TableCliente);

        javax.swing.GroupLayout ClienteLayout = new javax.swing.GroupLayout(Cliente);
        Cliente.setLayout(ClienteLayout);
        ClienteLayout.setHorizontalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(BtnNuevo2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JbuscarC, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                .addContainerGap())
        );
        ClienteLayout.setVerticalGroup(
            ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnNuevo2)
                    .addComponent(JbuscarC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        tablePrincipal.addTab("Cliente", Cliente);

        Provedor.setBackground(new java.awt.Color(153, 153, 153));

        BtnNuevo3.setBackground(new java.awt.Color(255, 153, 204));
        BtnNuevo3.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        BtnNuevo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-usuario.png"))); // NOI18N
        BtnNuevo3.setText("Nuevo");
        BtnNuevo3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnNuevo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevo3ActionPerformed(evt);
            }
        });

        JbuscarP.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        JbuscarP.setForeground(new java.awt.Color(153, 153, 153));
        JbuscarP.setText("Buscar usuario");
        JbuscarP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TableProvedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(TableProvedor);

        javax.swing.GroupLayout ProvedorLayout = new javax.swing.GroupLayout(Provedor);
        Provedor.setLayout(ProvedorLayout);
        ProvedorLayout.setHorizontalGroup(
            ProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProvedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnNuevo3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JbuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(ProvedorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        ProvedorLayout.setVerticalGroup(
            ProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProvedorLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(ProvedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnNuevo3)
                    .addComponent(JbuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        tablePrincipal.addTab("Provedor", Provedor);

        Factura.setBackground(new java.awt.Color(204, 204, 204));

        BtnFactura.setBackground(new java.awt.Color(255, 153, 204));
        BtnFactura.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        BtnFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-usuario.png"))); // NOI18N
        BtnFactura.setText("Nuevo");
        BtnFactura.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFacturaActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTable3);

        JbuscarF.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        JbuscarF.setForeground(new java.awt.Color(153, 153, 153));
        JbuscarF.setText("Buscar usuario");
        JbuscarF.setBorder(null);

        javax.swing.GroupLayout FacturaLayout = new javax.swing.GroupLayout(Factura);
        Factura.setLayout(FacturaLayout);
        FacturaLayout.setHorizontalGroup(
            FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FacturaLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(FacturaLayout.createSequentialGroup()
                        .addComponent(BtnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JbuscarF, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
        );
        FacturaLayout.setVerticalGroup(
            FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FacturaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(FacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnFactura)
                    .addComponent(JbuscarF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tablePrincipal.addTab("Factura", Factura);

        Producto.setBackground(new java.awt.Color(204, 204, 204));

        BtnNuevo4.setBackground(new java.awt.Color(255, 153, 204));
        BtnNuevo4.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        BtnNuevo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-usuario.png"))); // NOI18N
        BtnNuevo4.setText("Nuevo");
        BtnNuevo4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnNuevo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevo4ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable2);

        Jbuscar.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        Jbuscar.setForeground(new java.awt.Color(153, 153, 153));
        Jbuscar.setText("Buscar usuario");
        Jbuscar.setBorder(null);

        javax.swing.GroupLayout ProductoLayout = new javax.swing.GroupLayout(Producto);
        Producto.setLayout(ProductoLayout);
        ProductoLayout.setHorizontalGroup(
            ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(BtnNuevo4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Jbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(ProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        ProductoLayout.setVerticalGroup(
            ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductoLayout.createSequentialGroup()
                .addGroup(ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(BtnNuevo4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Jbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        tablePrincipal.addTab("Producto", Producto);

        panelVenta.setBackground(new java.awt.Color(204, 204, 204));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(jTable1);

        BtnNuevo5.setBackground(new java.awt.Color(255, 153, 204));
        BtnNuevo5.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        BtnNuevo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-usuario.png"))); // NOI18N
        BtnNuevo5.setText("Nuevo");
        BtnNuevo5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnNuevo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevo5ActionPerformed(evt);
            }
        });

        JbuscarP1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        JbuscarP1.setForeground(new java.awt.Color(153, 153, 153));
        JbuscarP1.setText("Buscar usuario");
        JbuscarP1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panelVentaLayout = new javax.swing.GroupLayout(panelVenta);
        panelVenta.setLayout(panelVentaLayout);
        panelVentaLayout.setHorizontalGroup(
            panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnNuevo5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JbuscarP1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVentaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        panelVentaLayout.setVerticalGroup(
            panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVentaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnNuevo5)
                    .addComponent(JbuscarP1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );

        tablePrincipal.addTab("Venta", panelVenta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tablePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(tablePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNuevo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnNuevo4ActionPerformed

    private void BtnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnFacturaActionPerformed

    private void BtnNuevo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnNuevo3ActionPerformed

    private void BtnNuevo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnNuevo2ActionPerformed

    private void JBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBuscarActionPerformed

    }//GEN-LAST:event_JBuscarActionPerformed

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void BtnNuevo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnNuevo5ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarUsu;
    private javax.swing.JButton BtnFactura;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JButton BtnNuevo2;
    private javax.swing.JButton BtnNuevo3;
    private javax.swing.JButton BtnNuevo4;
    private javax.swing.JButton BtnNuevo5;
    private javax.swing.JPanel Cliente;
    private javax.swing.JPanel Factura;
    private javax.swing.JTextField JBuscar;
    private javax.swing.JTextField Jbuscar;
    private javax.swing.JTextField JbuscarC;
    private javax.swing.JTextField JbuscarF;
    private javax.swing.JTextField JbuscarP;
    private javax.swing.JTextField JbuscarP1;
    private javax.swing.JPanel Producto;
    private javax.swing.JPanel Provedor;
    private javax.swing.JTable TableCliente;
    private javax.swing.JTable TableProvedor;
    private javax.swing.JTable TableUsuario;
    private javax.swing.JPanel Usuario;
    private javax.swing.JButton jBtnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JPanel panelVenta;
    private javax.swing.JTabbedPane tablePrincipal;
    // End of variables declaration//GEN-END:variables
}
