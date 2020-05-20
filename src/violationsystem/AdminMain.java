/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package violationsystem;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author _
 */
public class AdminMain extends javax.swing.JFrame {

    int mousepX;
    int mousepY;
    Connection conn = DBConnector.ConnectDB();
    String UID = null;
    CardLayout cardLayout;

    public AdminMain(String DBID) {

        UID = DBID;
        initComponents();

        //set Field Limits for Text Areas
        cardLayout = (CardLayout) (MainPanel.getLayout());
        DefaultTableModel vioTable = (DefaultTableModel) vioTableData.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CoorMain = new javax.swing.JPanel();
        MenuBar = new javax.swing.JPanel();
        minimizeBtn = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        SplitPane = new javax.swing.JSplitPane();
        sidebar = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        manData = new javax.swing.JButton();
        Syslog = new javax.swing.JButton();
        logout = new javax.swing.JLabel();
        generate = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        manPanel = new javax.swing.JPanel();
        manFName = new javax.swing.JTextField();
        manMidName = new javax.swing.JTextField();
        manLName = new javax.swing.JTextField();
        manSNumber = new javax.swing.JTextField();
        password1 = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();
        LoginAs = new javax.swing.JComboBox();
        manPhoto = new javax.swing.JLabel();
        manGrade = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        vioTableData = new javax.swing.JTable();
        manBg = new javax.swing.JLabel();
        logPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        vioTableData1 = new javax.swing.JTable();
        sysViewRec = new javax.swing.JButton();
        logSvBtn = new javax.swing.JButton();
        manBg1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        CoorMain.setMinimumSize(new java.awt.Dimension(1410, 790));
        CoorMain.setPreferredSize(new java.awt.Dimension(1410, 790));
        CoorMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuBar.setBackground(new java.awt.Color(255, 153, 0));
        MenuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuBar.setMinimumSize(new java.awt.Dimension(1410, 50));
        MenuBar.setPreferredSize(new java.awt.Dimension(1410, 50));
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

        minimizeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/minimize.png"))); // NOI18N
        minimizeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeBtnMouseClicked(evt);
            }
        });

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/exit.png"))); // NOI18N
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MenuBarLayout = new javax.swing.GroupLayout(MenuBar);
        MenuBar.setLayout(MenuBarLayout);
        MenuBarLayout.setHorizontalGroup(
            MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuBarLayout.createSequentialGroup()
                .addContainerGap(1291, Short.MAX_VALUE)
                .addComponent(minimizeBtn)
                .addGap(22, 22, 22)
                .addComponent(closeBtn)
                .addGap(29, 29, 29))
        );
        MenuBarLayout.setVerticalGroup(
            MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minimizeBtn)
                    .addComponent(closeBtn))
                .addGap(797, 797, 797))
        );

        CoorMain.add(MenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1410, 50));

        SplitPane.setBorder(null);
        SplitPane.setDividerSize(0);

        sidebar.setBackground(new java.awt.Color(255, 181, 8));
        sidebar.setBorder(null);
        sidebar.setMinimumSize(new java.awt.Dimension(300, 790));
        sidebar.setPreferredSize(new java.awt.Dimension(300, 790));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/logosmall.png"))); // NOI18N
        logo.setToolTipText("");

        manData.setBackground(new java.awt.Color(255, 255, 255));
        manData.setFont(new java.awt.Font("Corbel", 1, 22)); // NOI18N
        manData.setForeground(new java.awt.Color(255, 255, 255));
        manData.setText("Manage Data");
        manData.setAlignmentY(0.0F);
        manData.setBorder(null);
        manData.setContentAreaFilled(false);
        manData.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        manData.setIconTextGap(0);
        manData.setMargin(null);
        manData.setPreferredSize(new java.awt.Dimension(147, 51));
        manData.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        manData.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        manData.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        manData.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        manData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manDataActionPerformed(evt);
            }
        });

        Syslog.setFont(new java.awt.Font("Corbel", 1, 22)); // NOI18N
        Syslog.setForeground(new java.awt.Color(255, 255, 255));
        Syslog.setText("System Logs");
        Syslog.setAlignmentY(0.0F);
        Syslog.setBorder(null);
        Syslog.setContentAreaFilled(false);
        Syslog.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Syslog.setIconTextGap(0);
        Syslog.setMargin(null);
        Syslog.setPreferredSize(new java.awt.Dimension(147, 51));
        Syslog.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        Syslog.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        Syslog.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        Syslog.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        Syslog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SyslogActionPerformed(evt);
            }
        });

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
                .addGap(54, 54, 54)
                .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(logout)
                .addGap(51, 51, 51))
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Syslog, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manData, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(logo)
                        .addGap(35, 35, 35)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(logo)
                .addGap(18, 18, 18)
                .addComponent(manData, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Syslog, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout)
                    .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(333, Short.MAX_VALUE))
        );

        SplitPane.setLeftComponent(sidebar);

        MainPanel.setLayout(new java.awt.CardLayout());

        manPanel.setBackground(new java.awt.Color(255, 255, 255));
        manPanel.setBorder(null);
        manPanel.setMinimumSize(new java.awt.Dimension(1120, 740));
        manPanel.setPreferredSize(new java.awt.Dimension(1120, 740));
        manPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manFName.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        manFName.setForeground(new java.awt.Color(102, 102, 102));
        manFName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        manFName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        manFName.setPreferredSize(new java.awt.Dimension(265, 60));
        manFName.setSelectionColor(new java.awt.Color(255, 255, 255));
        manPanel.add(manFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 265, 60));

        manMidName.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        manMidName.setForeground(new java.awt.Color(102, 102, 102));
        manMidName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        manMidName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Middle Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        manMidName.setPreferredSize(new java.awt.Dimension(265, 60));
        manMidName.setSelectionColor(new java.awt.Color(255, 255, 255));
        manPanel.add(manMidName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 265, 60));

        manLName.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        manLName.setForeground(new java.awt.Color(102, 102, 102));
        manLName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        manLName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        manLName.setPreferredSize(new java.awt.Dimension(265, 60));
        manLName.setSelectionColor(new java.awt.Color(255, 255, 255));
        manPanel.add(manLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 265, 60));

        manSNumber.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        manSNumber.setForeground(new java.awt.Color(102, 102, 102));
        manSNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        manSNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seccret Key", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        manSNumber.setPreferredSize(new java.awt.Dimension(265, 60));
        manSNumber.setSelectionColor(new java.awt.Color(255, 255, 255));
        manPanel.add(manSNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 265, 60));

        password1.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        password1.setForeground(new java.awt.Color(102, 102, 102));
        password1.setToolTipText("");
        password1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Confirm Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        password1.setCaretColor(new java.awt.Color(102, 102, 102));
        password1.setName(""); // NOI18N
        password1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                password1MouseClicked(evt);
            }
        });
        manPanel.add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 265, 60));

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
        manPanel.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 265, 60));

        LoginAs.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        LoginAs.setForeground(new java.awt.Color(102, 102, 102));
        LoginAs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "   Administrator", "   Coordinator" }));
        LoginAs.setBorder(javax.swing.BorderFactory.createTitledBorder("Choose a role"));
        manPanel.add(LoginAs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 265, 50));

        manPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icon.png"))); // NOI18N
        manPhoto.setBorder(null);
        manPhoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        manPanel.add(manPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 185, 160));

        manGrade.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        manGrade.setForeground(new java.awt.Color(102, 102, 102));
        manGrade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        manGrade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        manGrade.setPreferredSize(new java.awt.Dimension(265, 60));
        manGrade.setSelectionColor(new java.awt.Color(255, 255, 255));
        manPanel.add(manGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 265, 60));

        vioTableData.setBorder(null);
        vioTableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Middle Name", "Last Name", "Username", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vioTableData.setRowHeight(20);
        vioTableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vioTableDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(vioTableData);

        manPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 800, 710));

        manBg.setBackground(new java.awt.Color(255, 186, 8));
        manBg.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        manBg.setForeground(new java.awt.Color(51, 51, 51));
        manBg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/bgg.png"))); // NOI18N
        manBg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        manBg.setMaximumSize(new java.awt.Dimension(1430, 790));
        manBg.setMinimumSize(new java.awt.Dimension(1430, 790));
        manBg.setPreferredSize(new java.awt.Dimension(1430, 790));
        manPanel.add(manBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 740));

        MainPanel.add(manPanel, "managePanel");

        logPanel.setBackground(new java.awt.Color(255, 255, 255));
        logPanel.setBorder(null);
        logPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vioTableData1.setBorder(null);
        vioTableData1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Log ID", "Date", "Time", "Violation ID", "User ID", "Student ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vioTableData1.setRowHeight(20);
        jScrollPane3.setViewportView(vioTableData1);

        logPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1080, 490));

        sysViewRec.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        sysViewRec.setForeground(new java.awt.Color(255, 255, 255));
        sysViewRec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/button2.png"))); // NOI18N
        sysViewRec.setText("View System Logs");
        sysViewRec.setBorder(null);
        sysViewRec.setBorderPainted(false);
        sysViewRec.setContentAreaFilled(false);
        sysViewRec.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sysViewRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sysViewRecActionPerformed(evt);
            }
        });
        logPanel.add(sysViewRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, 50));

        logSvBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        logSvBtn.setForeground(new java.awt.Color(255, 255, 255));
        logSvBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/smol button.png"))); // NOI18N
        logSvBtn.setText("Save");
        logSvBtn.setBorder(null);
        logSvBtn.setBorderPainted(false);
        logSvBtn.setContentAreaFilled(false);
        logSvBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logSvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logSvBtnActionPerformed(evt);
            }
        });
        logPanel.add(logSvBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 160, -1));

        manBg1.setBackground(new java.awt.Color(255, 186, 8));
        manBg1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        manBg1.setForeground(new java.awt.Color(51, 51, 51));
        manBg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manBg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/bgg.png"))); // NOI18N
        manBg1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        manBg1.setMaximumSize(new java.awt.Dimension(1430, 790));
        manBg1.setMinimumSize(new java.awt.Dimension(1430, 790));
        manBg1.setPreferredSize(new java.awt.Dimension(1430, 790));
        logPanel.add(manBg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 740));

        MainPanel.add(logPanel, "managePanel");

        SplitPane.setRightComponent(MainPanel);

        CoorMain.add(SplitPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 50, 1420, 860));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CoorMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CoorMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        new Login().setVisible(true);
        new Login().pack();
        new Login().setLocationRelativeTo(null);
        new Login().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void MenuBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuBarMouseDragged
        int coorX = evt.getXOnScreen();
        int coorY = evt.getYOnScreen();

        this.setLocation(coorX - mousepX, coorY - mousepY);
    }//GEN-LAST:event_MenuBarMouseDragged

    private void MenuBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuBarMousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_MenuBarMousePressed

    private void minimizeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtnMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeBtnMouseClicked

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        System.exit(0);

    }//GEN-LAST:event_closeBtnMouseClicked

    private void manDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manDataActionPerformed
        cardLayout.show(MainPanel, "managePanel");
    }//GEN-LAST:event_manDataActionPerformed

    private void SyslogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SyslogActionPerformed
        cardLayout.show(MainPanel, "regPanel");
    }//GEN-LAST:event_SyslogActionPerformed

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        
    }//GEN-LAST:event_passwordMouseClicked

    private void password1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_password1MouseClicked

    private void vioTableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vioTableDataMouseClicked
        
        int sel = vioTableData.getSelectedRow();

//        txtFldDate.setText(vioTable.getValueAt(sel, 1).toString());
//        txtFldTime.setText(vioTable.getValueAt(sel, 2).toString());
//        vioCombo.setSelectedItem(vioTable.getValueAt(sel, 3).toString());
//        txtFldRem.setText(vioTable.getValueAt(sel, 4).toString());
//        txtFldCom.setText(vioTable.getValueAt(sel, 5).toString());
    }//GEN-LAST:event_vioTableDataMouseClicked

    private void sysViewRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sysViewRecActionPerformed
                  
    }//GEN-LAST:event_sysViewRecActionPerformed

    private void logSvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logSvBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logSvBtnActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CoorMain;
    private javax.swing.JComboBox LoginAs;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JButton Syslog;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JLabel generate;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel logPanel;
    private javax.swing.JButton logSvBtn;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel manBg;
    private javax.swing.JLabel manBg1;
    private javax.swing.JButton manData;
    private javax.swing.JTextField manFName;
    private javax.swing.JTextField manGrade;
    private javax.swing.JTextField manLName;
    private javax.swing.JTextField manMidName;
    private javax.swing.JPanel manPanel;
    private javax.swing.JLabel manPhoto;
    private javax.swing.JTextField manSNumber;
    private javax.swing.JLabel minimizeBtn;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField password1;
    private javax.swing.JPanel sidebar;
    private javax.swing.JButton sysViewRec;
    private javax.swing.JTable vioTableData;
    private javax.swing.JTable vioTableData1;
    // End of variables declaration//GEN-END:variables

}
