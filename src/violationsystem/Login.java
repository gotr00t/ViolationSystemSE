/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package violationsystem;

import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author _
 */
public class Login extends javax.swing.JFrame {

    int mousepX;
    int mousepY;
    Connection conn = DBConnector.ConnectDB();

    public Login() {
        System.out.println("Calling LogIn form");
        System.out.println("Calling initComponents");
        initComponents();

        username.setDocument(new FieldLimit(16));
        password.setDocument(new FieldLimit(24));
        //initialize text limits to all fields matching the DB size
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userRole = new javax.swing.ButtonGroup();
        Login = new javax.swing.JPanel();
        LoginButton = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        logo = new javax.swing.JLabel();
        ResetPassword = new javax.swing.JButton();
        MenuBar = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        Coordinator = new javax.swing.JRadioButton();
        Administrator = new javax.swing.JRadioButton();
        errorResponse = new javax.swing.JLabel();
        bgg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginButton.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/button.png"))); // NOI18N
        LoginButton.setText("Login");
        LoginButton.setBorder(null);
        LoginButton.setContentAreaFilled(false);
        LoginButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        Login.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 550, 300, 60));

        username.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        username.setForeground(new java.awt.Color(102, 102, 102));
        username.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
        });
        Login.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 300, 60));

        password.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        password.setForeground(new java.awt.Color(102, 102, 102));
        password.setToolTipText("");
        password.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        password.setCaretColor(new java.awt.Color(102, 102, 102));
        password.setName(""); // NOI18N
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        Login.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 300, 60));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/logo.png"))); // NOI18N
        logo.setToolTipText("");
        Login.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, -1, -1));

        ResetPassword.setText("Reset Password");
        ResetPassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
        ResetPassword.setContentAreaFilled(false);
        ResetPassword.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ResetPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetPasswordActionPerformed(evt);
            }
        });
        Login.add(ResetPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 620, 150, 20));

        MenuBar.setBackground(new java.awt.Color(255, 153, 0));
        MenuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/exit.png"))); // NOI18N
        close.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        minimize.setFont(new java.awt.Font("Britannic Bold", 1, 34)); // NOI18N
        minimize.setForeground(new java.awt.Color(255, 255, 255));
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/minimize.png"))); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MenuBarLayout.setVerticalGroup(
            MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(minimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(close))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Login.add(MenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 50));

        Coordinator.setBackground(new java.awt.Color(255, 255, 255));
        userRole.add(Coordinator);
        Coordinator.setText("Coordinator");
        Coordinator.setBorder(null);
        Login.add(Coordinator, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, -1, -1));

        Administrator.setBackground(new java.awt.Color(255, 255, 255));
        userRole.add(Administrator);
        Administrator.setText("Administrator");
        Administrator.setBorder(null);
        Login.add(Administrator, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 500, -1, -1));

        errorResponse.setForeground(new java.awt.Color(255, 153, 0));
        Login.add(errorResponse, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, 300, 30));

        bgg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bgg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/bgg.png"))); // NOI18N
        bgg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        Login.add(bgg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 790));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
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

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        String Username = username.getText();
        String Password = password.getText();
        Coordinator.setActionCommand("Coordinator");
        Administrator.setActionCommand("Administrator");

        if (conn != null) {

            if (Username.trim().isEmpty() && Password.trim().isEmpty()) {
                errorResponse.setText("Username and Password field is empty");

            } else if (Username.trim().isEmpty()) {
                errorResponse.setText("Username field is empty");

            } else if (Password.trim().isEmpty()) {
                errorResponse.setText("Password field is empty");

            } else {

                try {

                    //check logic on login, produces SQLexception error, calls the records twice.
                    String LogQry = "SELECT * FROM USERCRED WHERE USERNAME=?";
                    PreparedStatement stmt = conn.prepareStatement(LogQry);
                    stmt.setString(1, Username);
                    ResultSet records = stmt.executeQuery();

                    if (!records.next()) {
                        errorResponse.setText("Invalid Username or Password");
                    } else {
                        String RoleSelected = userRole.getSelection().getActionCommand();
                        String DBUser = records.getString("USERNAME");
                        String DBPass = records.getString("UPASSWORD");
                        String decryptedPass = Security.decrypt(DBPass);
                        String DBRole = records.getString("ROLE");
                        String DBID = records.getString("EID");

                        Login Checker = new Login();
                        String valResult = Checker.ValidateCred(Username, Password, DBUser, decryptedPass, DBRole, RoleSelected);

                        switch (valResult) {

                            case "Coordinator":

                                records.close();
                                new CoorMain(DBID).setVisible(true);
                                new CoorMain(DBID).pack();
                                new CoorMain(DBID).setLocationRelativeTo(null);
                                this.dispose();
                                break;

                            case "Administrator":

                                records.close();
                                new AdminMain(DBID).setVisible(true);
                                new AdminMain(DBID).pack();
                                new AdminMain(DBID).setLocationRelativeTo(null);
                                this.dispose();
                                break;

                            case "InvalidUser":

                                errorResponse.setText("Invalid Role Selected");
                                records.close();
                                break;

                            case "InvalidCredentials":

                                errorResponse.setText("Incorrect Username or Password");
                                records.close();
                                break;
                        }
                    }
                } catch (NullPointerException e) {
                    errorResponse.setText("Please choose your assigned role");
                } catch (SQLException sql) {
                    sql.printStackTrace();
                }

            }

        }

    }//GEN-LAST:event_LoginButtonActionPerformed

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
        errorResponse.setText("");
    }//GEN-LAST:event_usernameMouseClicked

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        errorResponse.setText("");
    }//GEN-LAST:event_passwordMouseClicked

    private void ResetPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetPasswordActionPerformed
        new ResetPassword().setVisible(true);
        new ResetPassword().pack();
        new ResetPassword().setLocationRelativeTo(null);

    }//GEN-LAST:event_ResetPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    public String ValidateCred(String Username, String Password, String DBUser, String decryptedPass, String Role, String RoleSelected) {

        if (Username.equals(DBUser) && Password.equals(decryptedPass)) {

            if (Role.equals(RoleSelected) && Role.equals("Coordinator")) {
                return "Coordinator";
            } else if (Role.equals(RoleSelected) && Role.equals("Administrator")) {
                return "Administrator";
            } else if (Role.equals("MASTERADMIN")) {
                return RoleSelected;
            } else {
                return "InvalidUser";
            }

        } else {
            return "InvalidCredentials";
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Administrator;
    private javax.swing.JRadioButton Coordinator;
    private javax.swing.JPanel Login;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JButton ResetPassword;
    private javax.swing.JLabel bgg;
    private javax.swing.JLabel close;
    private javax.swing.JLabel errorResponse;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField password;
    private javax.swing.ButtonGroup userRole;
    public javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
