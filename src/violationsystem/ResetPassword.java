/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package violationsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author _
 * 
 */
public class ResetPassword extends javax.swing.JFrame {

    int mousepX;
    int mousepY;
    Connection conn = DBConnector.ConnectDB();

    public ResetPassword() {
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

        resetPw = new javax.swing.JPanel();
        MenuBar = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        LabelEmpId = new javax.swing.JLabel();
        EmpID = new javax.swing.JTextField();
        nPassLabel = new javax.swing.JLabel();
        cPassLabel = new javax.swing.JLabel();
        SKeyLabel = new javax.swing.JLabel();
        npass = new javax.swing.JPasswordField();
        cpass = new javax.swing.JPasswordField();
        SKeyField = new javax.swing.JPasswordField();
        errorResponse = new javax.swing.JLabel();
        resetPwBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1420, 790));
        setUndecorated(true);

        resetPw.setBackground(new java.awt.Color(255, 255, 255));
        resetPw.setBorder(null);
        resetPw.setMaximumSize(new java.awt.Dimension(1420, 600));
        resetPw.setMinimumSize(new java.awt.Dimension(1000, 600));
        resetPw.setPreferredSize(new java.awt.Dimension(1000, 600));
        resetPw.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuBar.setBackground(new java.awt.Color(255, 153, 0));
        MenuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuBar.setPreferredSize(new java.awt.Dimension(1000, 50));
        MenuBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MenuBarMouseDragged(evt);
            }
        });
        MenuBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuBarMousePressed(evt);
            }
        });

        close.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 28)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/exit.png"))); // NOI18N
        close.setBorder(null);
        close.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        minimize.setFont(new java.awt.Font("Britannic Bold", 1, 34)); // NOI18N
        minimize.setForeground(new java.awt.Color(255, 255, 255));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/minimize.png"))); // NOI18N
        minimize.setBorder(null);
        minimize.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MenuBarLayout = new javax.swing.GroupLayout(MenuBar);
        MenuBar.setLayout(MenuBarLayout);
        MenuBarLayout.setHorizontalGroup(
            MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimize)
                .addGap(18, 18, 18)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MenuBarLayout.setVerticalGroup(
            MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(close)
                    .addComponent(minimize))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        resetPw.add(MenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 1000, -1));

        save.setBackground(new java.awt.Color(255, 255, 255));
        save.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/button2.png"))); // NOI18N
        save.setText("Save");
        save.setBorder(null);
        save.setContentAreaFilled(false);
        save.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        save.setPreferredSize(new java.awt.Dimension(147, 51));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        resetPw.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 200, 50));

        cancel.setBackground(new java.awt.Color(255, 255, 255));
        cancel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/button2.png"))); // NOI18N
        cancel.setText("Cancel");
        cancel.setBorder(null);
        cancel.setContentAreaFilled(false);
        cancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancel.setPreferredSize(new java.awt.Dimension(147, 51));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        resetPw.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, 200, 50));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/logo.png"))); // NOI18N
        logo.setToolTipText("");
        logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        resetPw.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        LabelEmpId.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        LabelEmpId.setForeground(new java.awt.Color(51, 51, 51));
        LabelEmpId.setText("To reset password, please enter your Employee ID:  ");
        resetPw.add(LabelEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        EmpID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EmpID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EmpIDKeyReleased(evt);
            }
        });
        resetPw.add(EmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 260, 30));

        nPassLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        nPassLabel.setForeground(new java.awt.Color(102, 102, 102));
        nPassLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nPassLabel.setText("New Password");
        nPassLabel.setBorder(null);
        nPassLabel.setFocusable(false);
        nPassLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nPassLabel.setRequestFocusEnabled(false);
        nPassLabel.setVerifyInputWhenFocusTarget(false);
        resetPw.add(nPassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 100, 50));

        cPassLabel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cPassLabel.setForeground(new java.awt.Color(102, 102, 102));
        cPassLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cPassLabel.setText("Confirm Password");
        cPassLabel.setFocusable(false);
        cPassLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cPassLabel.setRequestFocusEnabled(false);
        cPassLabel.setVerifyInputWhenFocusTarget(false);
        resetPw.add(cPassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 120, 50));

        SKeyLabel.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        SKeyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SKeyLabel.setText("Secret Key");
        SKeyLabel.setFocusable(false);
        SKeyLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SKeyLabel.setRequestFocusEnabled(false);
        SKeyLabel.setVerifyInputWhenFocusTarget(false);
        resetPw.add(SKeyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 80, 50));

        npass.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        npass.setForeground(new java.awt.Color(102, 102, 102));
        npass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        npass.setToolTipText("");
        npass.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        npass.setCaretColor(new java.awt.Color(102, 102, 102));
        npass.setEnabled(false);
        npass.setName(""); // NOI18N
        npass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                npassMouseClicked(evt);
            }
        });
        npass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                npassKeyReleased(evt);
            }
        });
        resetPw.add(npass, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 300, 50));

        cpass.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        cpass.setForeground(new java.awt.Color(102, 102, 102));
        cpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cpass.setToolTipText("");
        cpass.setAutoscrolls(false);
        cpass.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cpass.setCaretColor(new java.awt.Color(102, 102, 102));
        cpass.setEnabled(false);
        cpass.setName(""); // NOI18N
        cpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpassMouseClicked(evt);
            }
        });
        cpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cpassKeyReleased(evt);
            }
        });
        resetPw.add(cpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 300, 50));

        SKeyField.setForeground(new java.awt.Color(102, 102, 102));
        SKeyField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SKeyField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SKeyField.setCaretColor(new java.awt.Color(102, 102, 102));
        SKeyField.setEnabled(false);
        SKeyField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SKeyFieldKeyReleased(evt);
            }
        });
        resetPw.add(SKeyField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 300, 50));

        errorResponse.setForeground(new java.awt.Color(255, 153, 0));
        resetPw.add(errorResponse, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 300, 30));

        resetPwBg.setBackground(new java.awt.Color(255, 255, 255));
        resetPwBg.setForeground(new java.awt.Color(1, 1, 1));
        resetPwBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/bgmini.PNG"))); // NOI18N
        resetPwBg.setBorder(null);
        resetPwBg.setMaximumSize(new java.awt.Dimension(1000, 600));
        resetPwBg.setMinimumSize(new java.awt.Dimension(1000, 600));
        resetPwBg.setPreferredSize(new java.awt.Dimension(1000, 600));
        resetPw.add(resetPwBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resetPw, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resetPw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        if (npass.getText().equals(cpass.getText())) {

            try {
                String EmployeeID = EmpID.getText();
                String sqlFetchID = "SELECT * FROM SYSTEMPRIMARYUSERS WHERE EmployeeID=?";
                PreparedStatement stmt = conn.prepareStatement(sqlFetchID, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                stmt.setString(1, EmployeeID);
                ResultSet records = stmt.executeQuery();

                if (!records.next()) {
                    errorResponse.setText("Employee not found");
                }
                String Key = records.getString("SECRETANSWER");
                //add decrypt function for secret key
                if (Key.equals(SKeyField.getText())) {
                    String encryptedPass = Security.encrypt(npass.getText());
                    records.updateString("PASSWORD", encryptedPass);
                    records.updateRow();
                    records.close();
                    errorResponse.setText("Password has been updated successfully");
                } else {
                    errorResponse.setText("Invalid Key");
                }

            } catch (SQLException ex) {
                Logger.getLogger(ResetPassword.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            errorResponse.setText("Password Mismatch");
        }


    }//GEN-LAST:event_saveActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void MenuBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuBarMouseDragged
        int coorX = evt.getXOnScreen();
        int coorY = evt.getYOnScreen();

        this.setLocation(coorX - mousepX, coorY - mousepY);
    }//GEN-LAST:event_MenuBarMouseDragged

    private void MenuBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuBarMousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_MenuBarMousePressed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        new Login().setVisible(true);
        new Login().pack();
        new Login().setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void npassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_npassMouseClicked
        errorResponse.setText("");
    }//GEN-LAST:event_npassMouseClicked

    private void cpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpassMouseClicked
        errorResponse.setText("");
    }//GEN-LAST:event_cpassMouseClicked

    private void EmpIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmpIDKeyReleased
        if (!EmpID.getText().trim().isEmpty()) {
            npass.setEnabled(true);
            nPassLabel.setText("");
        } else {
            nPassLabel.setText("New Password");
            npass.setText("");
            npass.setEnabled(false);
            cPassLabel.setText("Confirm Password");
            cpass.setText("");
            cpass.setEnabled(false);
            SKeyLabel.setText("Secret Key");
            SKeyField.setText("");
            SKeyField.setEnabled(false);

        }
    }//GEN-LAST:event_EmpIDKeyReleased

    private void npassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_npassKeyReleased
        if (!EmpID.getText().trim().isEmpty() && !npass.getText().trim().isEmpty()) {
            cpass.setEnabled(true);
            cPassLabel.setText("");
        } else {
            cpass.setEnabled(false);
            cpass.setText("");
            cPassLabel.setText("Confirm Password");
            SKeyField.setEnabled(false);
            SKeyField.setText("");
            SKeyLabel.setText("Secret Key");
        }
    }//GEN-LAST:event_npassKeyReleased

    private void cpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpassKeyReleased
        if (!npass.getText().trim().isEmpty() && SKeyField.getText().trim().isEmpty()) {

            cpass.setEnabled(true);
            cPassLabel.setText("");
            SKeyField.setEnabled(true);
            SKeyLabel.setText("");

        } else {
            SKeyField.setEnabled(false);
            SKeyField.setText("");
            SKeyLabel.setText("Secret Key");
        }
    }//GEN-LAST:event_cpassKeyReleased

    private void SKeyFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SKeyFieldKeyReleased
        if (cpass.getText().trim().isEmpty() && npass.getText().trim().isEmpty()) {
            SKeyField.setEnabled(false);
            SKeyField.setText("");
            SKeyLabel.setText("Secret Key");
        }
    }//GEN-LAST:event_SKeyFieldKeyReleased

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
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmpID;
    private javax.swing.JLabel LabelEmpId;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JPasswordField SKeyField;
    private javax.swing.JLabel SKeyLabel;
    private javax.swing.JLabel cPassLabel;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel close;
    private javax.swing.JPasswordField cpass;
    private javax.swing.JLabel errorResponse;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel nPassLabel;
    private javax.swing.JPasswordField npass;
    private javax.swing.JPanel resetPw;
    private javax.swing.JLabel resetPwBg;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
