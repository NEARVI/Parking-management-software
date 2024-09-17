/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author carl1
 */
public class VParqueadero extends javax.swing.JFrame {

    /**
     * Creates new form VVehiculo
     */
    public VParqueadero() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtHoraEntrada = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHoraSalida = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIdVehiculo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTipoVehiculo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();
        btnListasVehiculos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/images.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 200));

        btnRegistrar.setBackground(new java.awt.Color(204, 255, 153));
        btnRegistrar.setText("Registrar Vehiculo");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 150, 30));

        btnEliminar.setBackground(new java.awt.Color(153, 255, 102));
        btnEliminar.setText("Retirar Vehiculo");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 140, 30));

        btnModificar.setBackground(new java.awt.Color(153, 255, 102));
        btnModificar.setText("Modificar Registro");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 150, 30));

        btnBuscar.setBackground(new java.awt.Color(204, 255, 102));
        btnBuscar.setText("Buscar Vehiculo");
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 140, 30));
        jPanel1.add(txtHoraEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 210, 30));

        jLabel1.setText("Hora Entrada:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 90, 90, -1));
        jPanel1.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 210, 30));

        jLabel3.setText("Placa Vehiculo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 50, 90, -1));

        jLabel4.setText("Hora Salida:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 130, 80, -1));
        jPanel1.add(txtHoraSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 210, 30));

        jLabel5.setText("Tipo Vehiculo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 210, 90, -1));
        jPanel1.add(txtIdVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 110, 30));

        jLabel6.setText("Precio:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 170, 50, -1));
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 210, 30));

        jLabel7.setText("Id:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));
        jPanel1.add(txtTipoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 210, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Formulario de registro parqueadero");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 320, 30));

        jtDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdVehiculo", "Placa", "horaEntrada", "horaSalida", "precio", "tipoVehiculo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtDatos);
        if (jtDatos.getColumnModel().getColumnCount() > 0) {
            jtDatos.getColumnModel().getColumn(0).setResizable(false);
            jtDatos.getColumnModel().getColumn(1).setResizable(false);
            jtDatos.getColumnModel().getColumn(2).setResizable(false);
            jtDatos.getColumnModel().getColumn(3).setResizable(false);
            jtDatos.getColumnModel().getColumn(4).setResizable(false);
            jtDatos.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 720, 150));

        btnListasVehiculos.setBackground(new java.awt.Color(204, 255, 102));
        btnListasVehiculos.setText("Listar Vehiculos");
        jPanel1.add(btnListasVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VParqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VParqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VParqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VParqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VParqueadero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnListasVehiculos;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtDatos;
    public javax.swing.JTextField txtHoraEntrada;
    public javax.swing.JTextField txtHoraSalida;
    public javax.swing.JTextField txtIdVehiculo;
    public javax.swing.JTextField txtPlaca;
    public javax.swing.JTextField txtPrecio;
    public javax.swing.JTextField txtTipoVehiculo;
    // End of variables declaration//GEN-END:variables
}