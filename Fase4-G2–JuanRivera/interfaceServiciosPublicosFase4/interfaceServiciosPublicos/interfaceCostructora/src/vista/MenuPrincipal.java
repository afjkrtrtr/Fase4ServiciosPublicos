/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Usuario
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents(); 
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnIngresoEm = new javax.swing.JButton();
        btnConsultaEm = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblMenu = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); 

        btnIngresoEm.setForeground(new java.awt.Color(0, 0, 204));
        btnIngresoEm.setText("Ingresar Empleado");
        btnIngresoEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoEmActionPerformed(evt);
            }
        });

        btnConsultaEm.setForeground(new java.awt.Color(0, 0, 204));
        btnConsultaEm.setText("Consultar empleados");
        btnConsultaEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaEmActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(51, 51, 255));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblMenu.setForeground(new java.awt.Color(0, 0, 204));
        lblMenu.setText("MENU PRINCIPAL");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultaEm)
                        .addGap(57, 57, 57)
                        .addComponent(btnIngresoEm)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(lblMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(16, 16, 16))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMenu)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresoEm)
                    .addComponent(btnConsultaEm))
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresoEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoEmActionPerformed
        IngresoEmpleado ingresoEmpleado=new IngresoEmpleado();
        ingresoEmpleado.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIngresoEmActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        VistaInicioSesion vistaInicioSesion=new VistaInicioSesion();
        vistaInicioSesion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnConsultaEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaEmActionPerformed
        ConsultaEmpleado consultaEmpleado=new ConsultaEmpleado();
        consultaEmpleado.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsultaEmActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultaEm;
    private javax.swing.JButton btnIngresoEm;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblMenu;
    // End of variables declaration//GEN-END:variables
}
