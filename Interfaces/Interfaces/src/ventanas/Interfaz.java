/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.awt.Image; //Importamos para el logo en vez de jar
import java.awt.Toolkit;//
import javax.swing.JOptionPane;

/**
 *
 * @author keynerrex
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null); //Centrar

    }

    public Image getIconImage() {//codigo cambio de logo ejecutable
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logohp.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalir = new javax.swing.JButton();
        jLabelIcono = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelContrasena = new javax.swing.JLabel();
        jTextUsuario = new javax.swing.JTextField();
        jContrasena = new javax.swing.JPasswordField();
        jButtonIniciar = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalir.setBackground(new java.awt.Color(0, 0, 51));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLabelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/User.png"))); // NOI18N
        getContentPane().add(jLabelIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 250, 250));

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelUsuario.setText("Usuario:");
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabelContrasena.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelContrasena.setText("Contraseña:");
        getContentPane().add(jLabelContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jTextUsuario.setBackground(new java.awt.Color(0, 0, 51));
        jTextUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jTextUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 140, -1));

        jContrasena.setBackground(new java.awt.Color(0, 0, 51));
        jContrasena.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jContrasenaClick(evt);
            }
        });
        jContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jContrasenaActionPerformed(evt);
            }
        });
        getContentPane().add(jContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 140, -1));

        jButtonIniciar.setBackground(new java.awt.Color(0, 0, 51));
        jButtonIniciar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonIniciar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIniciar.setText("Iniciar Sesion");
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* COMIENZO*/

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        //Boton Salir
        System.exit(0); //Cerrar Interfaz
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jTextUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUsuarioActionPerformed
        //Texto Usuario
    }//GEN-LAST:event_jTextUsuarioActionPerformed

    private void jContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jContrasenaActionPerformed
        //Texto Contraseña     
    }//GEN-LAST:event_jContrasenaActionPerformed

    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
        //Boton Iniciar Sesion
        System.exit(0);


    }//GEN-LAST:event_jButtonIniciarActionPerformed

    //Evento de click 
    private void jContrasenaClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jContrasenaClick
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "No se la digas a nadie");
    }//GEN-LAST:event_jContrasenaClick
    /* FIN*/

    //
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JPasswordField jContrasena;
    private javax.swing.JLabel jLabelContrasena;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JTextField jTextUsuario;
    // End of variables declaration//GEN-END:variables
}
