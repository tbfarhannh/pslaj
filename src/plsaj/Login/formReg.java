/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plsaj.Login;

import plsaj.Font.CustomFont;
import javax.swing.JOptionPane;


/**
 *
 * @author Wahyu Khoirur Rizal
 */
public class formReg extends javax.swing.JFrame {
//    
    int xx, xy;
    CustomFont Poppins = new CustomFont();
    
    /**
     * Creates new form formLogin
     */
    private boolean over;
    private javax.swing.JMenu XMenuBar = XMenuBar = new javax.swing.JMenu(); 
    public formReg() {
        initComponents();
     
    }
    
    void bersih(){
//        usernameText.setText("enter your username");
//        passwordText.setText("enter your username");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        panelUsername1 = new javax.swing.JPanel();
        usernameLbl = new javax.swing.JLabel();
        usernameText1 = new javax.swing.JTextField();
        bgUsername = new plsaj.Custom.customButtonAcil();
        panelPassword = new javax.swing.JPanel();
        passwordLbl = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        bgPassword = new plsaj.Custom.customButtonAcil();
        myAccount = new javax.swing.JLabel();
        buttonX = new plsaj.Custom.FButton();
        ForgotPassword = new javax.swing.JLabel();
        buttonLogin = new plsaj.Custom.FButton2();
        buttonSignUp = new plsaj.Custom.FButton1();
        backgroundLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPanel.setOpaque(false);
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelUsername1.setOpaque(false);
        panelUsername1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameLbl.setText("Username");
        panelUsername1.add(usernameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        usernameText1.setText("Username");
        usernameText1.setBorder(null);
        usernameText1.setOpaque(false);
        usernameText1.setPreferredSize(new java.awt.Dimension(340, 50));
        usernameText1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usernameText1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usernameText1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usernameText1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                usernameText1MouseReleased(evt);
            }
        });
        panelUsername1.add(usernameText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        bgUsername.setBorder(null);
        bgUsername.setEnabled(false);
        bgUsername.setTepi(25);
        panelUsername1.add(bgUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 410, 70));

        loginPanel.add(panelUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 430, 140));

        panelPassword.setOpaque(false);
        panelPassword.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordLbl.setText("Password");
        panelPassword.add(passwordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        passwordText.setText("jPasswordField1");
        passwordText.setBorder(null);
        passwordText.setOpaque(false);
        passwordText.setPreferredSize(new java.awt.Dimension(340, 50));
        passwordText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwordTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passwordTextMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordTextMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                passwordTextMouseReleased(evt);
            }
        });
        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });
        panelPassword.add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        bgPassword.setBorder(null);
        bgPassword.setEnabled(false);
        bgPassword.setTepi(25);
        panelPassword.add(bgPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 410, 70));

        loginPanel.add(panelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 430, 140));

        myAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plsaj/Img/account.png"))); // NOI18N
        loginPanel.add(myAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        buttonX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plsaj/Img/button-x.png"))); // NOI18N
        buttonX.setRadiusBorder(17);
        buttonX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonXMouseClicked(evt);
            }
        });
        loginPanel.add(buttonX, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 40, 40));

        ForgotPassword.setFont(Poppins.getPoppinsSemiBold().deriveFont(13f));
        ForgotPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ForgotPassword.setText("Fotgot Password?");
        loginPanel.add(ForgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 360, 40));

        buttonLogin.setText("Log In");
        buttonLogin.setFillClick(new java.awt.Color(19, 54, 44));
        buttonLogin.setFillOver(new java.awt.Color(31, 87, 70));
        buttonLogin.setFont(Poppins.getPoppinsSemiBold().deriveFont(15f));
        buttonLogin.setRadiusBorder(19);
        loginPanel.add(buttonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 360, 45));

        buttonSignUp.setForeground(new java.awt.Color(102, 102, 102));
        buttonSignUp.setText("Sign Up");
        buttonSignUp.setFocusable(false);
        buttonSignUp.setFont(Poppins.getPoppinsSemiBold().deriveFont(15f));
        buttonSignUp.setRadiusBorder(19);
        buttonSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSignUpActionPerformed(evt);
            }
        });
        loginPanel.add(buttonSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 360, 45));

        bgPanel.add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 650));

        backgroundLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plsaj/Img/bg_sign-up.png"))); // NOI18N
        bgPanel.add(backgroundLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(bgPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
        
    }//GEN-LAST:event_formMousePressed

    private void buttonXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonXMouseClicked
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin keluar?", "KONFIRMASI KELUAR",
                JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.OK_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_buttonXMouseClicked

    private void buttonSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSignUpActionPerformed

    private void usernameText1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameText1MouseEntered
        // TODO add your handling code here:
        bgUsername.setBackground(bgUsername.getWarnaOver());
        over = true;
    }//GEN-LAST:event_usernameText1MouseEntered

    private void usernameText1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameText1MouseExited
        // TODO add your handling code here:
        bgUsername.setBackground(bgUsername.getWarna());
        over = false;
    }//GEN-LAST:event_usernameText1MouseExited

    private void usernameText1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameText1MousePressed
        // TODO add your handling code here:
        bgUsername.setBackground(bgUsername.getWarnaClick());
    }//GEN-LAST:event_usernameText1MousePressed

    private void usernameText1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameText1MouseReleased
        // TODO add your handling code here:
        if (over) {
            bgUsername.setBackground(bgUsername.getWarnaOver());
        } else {
            bgUsername.setBackground(bgUsername.getWarna());
        }
    }//GEN-LAST:event_usernameText1MouseReleased

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextActionPerformed

    private void passwordTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTextMouseEntered
        // TODO add your handling code here:
        bgPassword.setBackground(bgPassword.getWarnaOver());
        over = true;
    }//GEN-LAST:event_passwordTextMouseEntered

    private void passwordTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTextMouseExited
        // TODO add your handling code here:
        bgPassword.setBackground(bgPassword.getWarna());
        over = false;
    }//GEN-LAST:event_passwordTextMouseExited

    private void passwordTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTextMousePressed
        // TODO add your handling code here:
        bgPassword.setBackground(bgUsername.getWarnaClick());
    }//GEN-LAST:event_passwordTextMousePressed

    private void passwordTextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTextMouseReleased
        // TODO add your handling code here:
        if (over) {
            bgPassword.setBackground(bgPassword.getWarnaOver());
        } else {
            bgPassword.setBackground(bgPassword.getWarna());
        }
    }//GEN-LAST:event_passwordTextMouseReleased

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
            java.util.logging.Logger.getLogger(formReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formReg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ForgotPassword;
    private javax.swing.JLabel backgroundLogin;
    private javax.swing.JPanel bgPanel;
    private plsaj.Custom.customButtonAcil bgPassword;
    private plsaj.Custom.customButtonAcil bgUsername;
    private plsaj.Custom.FButton2 buttonLogin;
    private plsaj.Custom.FButton1 buttonSignUp;
    private plsaj.Custom.FButton buttonX;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel myAccount;
    private javax.swing.JPanel panelPassword;
    private javax.swing.JPanel panelUsername1;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JTextField usernameText1;
    // End of variables declaration//GEN-END:variables
}
