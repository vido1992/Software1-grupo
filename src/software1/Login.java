/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software1;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Login extends javax.swing.JFrame {
 Validar validar= new Validar();
 
     public int SELECCIÓN = 0, ADMINISTRADOR = 1, OPERADOR = 2;

    public String PASS_ADMIN = "1234", PASS_USER = "123";
    public String CI_ADMIN = "0503018707", CI_USER = "1711112969";
    int intentos;
 
 
    /**
     * Creates new form Login
     */
    public Login() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBotonIniciarSesion = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jContraseñaField = new javax.swing.JTextField();
        jCCField = new javax.swing.JTextField();
        jComboUsuario = new javax.swing.JComboBox<String>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Bienvenido");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Sistema de gestión de combustible e inventario y facturación");

        jLabel2.setText("Seleccione tipo de usuario");

        jLabel3.setText("CI/RUC/Pasaporte");

        jLabel4.setText("Contraseña:");

        jBotonIniciarSesion.setText("Iniciar sesión");
        jBotonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonIniciarSesionActionPerformed(evt);
            }
        });

        jLabel5.setText("Recuperar contraseña");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jCCField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCCFieldActionPerformed(evt);
            }
        });
        jCCField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCCFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jCCFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jCCFieldKeyTyped(evt);
            }
        });

        jComboUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Administrador", "Operador" }));
        jComboUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(202, 202, 202))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboUsuario, 0, 139, Short.MAX_VALUE)
                            .addComponent(jCCField)
                            .addComponent(jContraseñaField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jBotonIniciarSesion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCCField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jContraseñaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBotonIniciarSesion)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonIniciarSesionActionPerformed

        validar.validarCC(this.jCCField.getText().toString());
        
        String res = validarIngreso(jComboUsuario.getSelectedIndex(), jCCField.getText(), jContraseñaField.getText());
        
         
    }//GEN-LAST:event_jBotonIniciarSesionActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        recuperarcontraseña r1 = new recuperarcontraseña();
        r1.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jCCFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCCFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCCFieldActionPerformed

    private void jCCFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCCFieldKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_jCCFieldKeyPressed

    private void jCCFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCCFieldKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jCCFieldKeyReleased

    private void jCCFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCCFieldKeyTyped

    }//GEN-LAST:event_jCCFieldKeyTyped

    private void jComboUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboUsuarioActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
 if(JOptionPane.showConfirmDialog(null,"¿Está seguro?")==0){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    
    public void validarPass(int index, String CI, String pass){

        switch (index) {
            case 1:
                if(pass.equals(PASS_ADMIN)&&CI.equals(CI_ADMIN)){
                this.setVisible(false);
                Menú m1=new Menú();
                m1.setVisible(true);
                m1.setEnabled(true);
                }else if(intentos == 3){
                    JOptionPane.showMessageDialog(null, "Ha excedido el numero de intentos. Vuelva mas tarde");
                    System.exit(0);
                }else{
                    JOptionPane.showMessageDialog(null, "Contraseña o usuario incorrecto. Asegúrese de introducir correctamente sus datos. \n Quedan " + (3 - intentos) + " intentos.");
                    jCCField.setText("");
                    jContraseñaField.setText("");
                    intentos = intentos + 1;
                }
                break;
                
            case 2:
                if(pass.equals(PASS_USER)&&CI.equals(CI_USER)){
                JOptionPane.showMessageDialog(null, "Ha iniciado sesión como operador operador");
                this.setVisible(false);
                Menú m1=new Menú();
                m1.setVisible(true);
                m1.setEnabled(true);
               // m1.asignarOperador();
                }else{
                    JOptionPane.showMessageDialog(null, "Contraseña o usuario incorrecto. Asegúrese de introducir correctamente sus datos.");
                }
                break;
        }

    }
    
     public String validarIngreso(int index, String CI, String pass){

        String retorno = "";

        if(index == SELECCIÓN){
            retorno = "No se ha seleccionado usuario";
        }else{
            /*if(index==ADMINISTRADOR){
                //retorno="Se ha seleccionado Administrador";
                this.setVisible(false);
                Menú m1=new Menú();
                m1.setVisible(true);
                m1.setEnabled(true);
            }else{
                retorno="Se ha seleccionado Operador";
            }*/
            validarPass(index, CI, pass);
        }

        return retorno;
    }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonIniciarSesion;
    private javax.swing.JTextField jCCField;
    private javax.swing.JComboBox<String> jComboUsuario;
    private javax.swing.JTextField jContraseñaField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
