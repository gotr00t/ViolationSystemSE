/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package violationsystem;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Lin
 */
public class CoorMain extends javax.swing.JFrame {

    int mousepX;
    int mousepY;

    public CoorMain() {
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

        bg = new javax.swing.JPanel();
        MenuBar = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        scan = new javax.swing.JButton();
        manage = new javax.swing.JButton();
        register = new javax.swing.JButton();
        logout = new javax.swing.JLabel();
        generate = new javax.swing.JLabel();
        MainFrame = new javax.swing.JPanel();
        scanPanel = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        studentName = new javax.swing.JLabel();
        studentNumber = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        track = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        track1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        scanbg = new javax.swing.JLabel();
        managePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        registerPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        bgg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addContainerGap(1329, Short.MAX_VALUE)
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

        bg.add(MenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 54));

        sidebar.setBackground(new java.awt.Color(255, 181, 8));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/logosmall.png"))); // NOI18N
        logo.setToolTipText("");

        scan.setBackground(new java.awt.Color(255, 0, 51));
        scan.setFont(new java.awt.Font("Corbel", 1, 22)); // NOI18N
        scan.setForeground(new java.awt.Color(255, 255, 255));
        scan.setText("Scan Barcode");
        scan.setAlignmentY(0.0F);
        scan.setContentAreaFilled(false);
        scan.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/smol button.png"))); // NOI18N
        scan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        scan.setIconTextGap(0);
        scan.setMargin(null);
        scan.setPreferredSize(new java.awt.Dimension(147, 51));
        scan.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        scan.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        scan.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        scan.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N

        manage.setBackground(new java.awt.Color(255, 51, 102));
        manage.setFont(new java.awt.Font("Corbel", 1, 22)); // NOI18N
        manage.setForeground(new java.awt.Color(255, 255, 255));
        manage.setText("Manage Data");
        manage.setAlignmentY(0.0F);
        manage.setContentAreaFilled(false);
        manage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        manage.setIconTextGap(0);
        manage.setMargin(null);
        manage.setPreferredSize(new java.awt.Dimension(147, 51));
        manage.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        manage.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        manage.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N

        register.setFont(new java.awt.Font("Corbel", 1, 22)); // NOI18N
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setText("Register");
        register.setAlignmentY(0.0F);
        register.setContentAreaFilled(false);
        register.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        register.setIconTextGap(0);
        register.setMargin(null);
        register.setPreferredSize(new java.awt.Dimension(147, 51));
        register.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        register.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        register.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        register.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/logout.png"))); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        generate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/generate.png"))); // NOI18N
        generate.setText("jLabel7");
        generate.setPreferredSize(new java.awt.Dimension(44, 41));

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(scan, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(manage, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(register, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout)
                .addGap(22, 22, 22))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(logo)
                .addGap(65, 65, 65)
                .addComponent(scan, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(manage, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(generate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        bg.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 300, 740));

        MainFrame.setLayout(new java.awt.CardLayout());

        scanPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icon.png"))); // NOI18N
        icon.setText("jLabel5");
        scanPanel.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 170, 170));

        studentName.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        studentName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentName.setText("Enter your Student Number:");
        studentName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        scanPanel.add(studentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 280, 720, 30));

        studentNumber.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 20)); // NOI18N
        studentNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        scanPanel.add(studentNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 340, 30));

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("STUDENT NUMBER");
        scanPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, -1, -1));

        track.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 20)); // NOI18N
        track.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        track.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        scanPanel.add(track, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 340, 30));

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 13)); // NOI18N
        jLabel5.setText("TRACK");
        scanPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, -1, -1));

        track1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 20)); // NOI18N
        track1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        track1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        scanPanel.add(track1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, 340, 30));

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 13)); // NOI18N
        jLabel6.setText("SECTION");
        scanPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, -1, -1));

        scanbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/bgmini.PNG"))); // NOI18N
        scanPanel.add(scanbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1120, 750));

        MainFrame.add(scanPanel, "card2");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/bgmini.PNG"))); // NOI18N

        javax.swing.GroupLayout managePanelLayout = new javax.swing.GroupLayout(managePanel);
        managePanel.setLayout(managePanelLayout);
        managePanelLayout.setHorizontalGroup(
            managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
        );
        managePanelLayout.setVerticalGroup(
            managePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MainFrame.add(managePanel, "card2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/bgmini.PNG"))); // NOI18N

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(96, 96, 96))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MainFrame.add(registerPanel, "card2");

        bg.add(MainFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 1120, 730));

        bgg.setBackground(new java.awt.Color(255, 186, 8));
        bgg.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        bgg.setForeground(new java.awt.Color(51, 51, 51));
        bgg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bgg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/bgg2.png"))); // NOI18N
        bgg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        bg.add(bgg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 790));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        Login login = new Login();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

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
            java.util.logging.Logger.getLogger(CoorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoorMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoorMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainFrame;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bgg;
    private javax.swing.JLabel close;
    private javax.swing.JLabel generate;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logout;
    private javax.swing.JButton manage;
    private javax.swing.JPanel managePanel;
    private javax.swing.JLabel minimize;
    private javax.swing.JButton register;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JButton scan;
    private javax.swing.JPanel scanPanel;
    private javax.swing.JLabel scanbg;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel studentName;
    private javax.swing.JLabel studentNumber;
    private javax.swing.JLabel track;
    private javax.swing.JLabel track1;
    // End of variables declaration//GEN-END:variables
}