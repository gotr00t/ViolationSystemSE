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
import java.util.logging.Level;
import java.util.logging.Logger;
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
        manKey = new javax.swing.JTextField();
        manCPass = new javax.swing.JPasswordField();
        manPass = new javax.swing.JPasswordField();
        manRole = new javax.swing.JComboBox();
        manPhoto = new javax.swing.JLabel();
        manUser = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        userRecData = new javax.swing.JTable();
        manViewRec = new javax.swing.JButton();
        manSvBtn = new javax.swing.JButton();
        manEID = new javax.swing.JTextField();
        errorResponse = new javax.swing.JLabel();
        manBg = new javax.swing.JLabel();
        logPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        LogData = new javax.swing.JTable();
        sysViewRec = new javax.swing.JButton();
        SysDel = new javax.swing.JButton();
        sysLogBg = new javax.swing.JLabel();

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
                .addGap(33, 33, 33)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Syslog, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manData, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidebarLayout.createSequentialGroup()
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
                .addContainerGap(263, Short.MAX_VALUE))
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
        manFName.setEnabled(false);
        manFName.setPreferredSize(new java.awt.Dimension(265, 60));
        manFName.setSelectionColor(new java.awt.Color(255, 255, 255));
        manFName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                manFNameKeyReleased(evt);
            }
        });
        manPanel.add(manFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 265, 45));

        manMidName.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        manMidName.setForeground(new java.awt.Color(102, 102, 102));
        manMidName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        manMidName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Middle Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        manMidName.setEnabled(false);
        manMidName.setPreferredSize(new java.awt.Dimension(265, 60));
        manMidName.setSelectionColor(new java.awt.Color(255, 255, 255));
        manMidName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                manMidNameKeyReleased(evt);
            }
        });
        manPanel.add(manMidName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 265, 45));

        manLName.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        manLName.setForeground(new java.awt.Color(102, 102, 102));
        manLName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        manLName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        manLName.setEnabled(false);
        manLName.setPreferredSize(new java.awt.Dimension(265, 60));
        manLName.setSelectionColor(new java.awt.Color(255, 255, 255));
        manLName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                manLNameKeyReleased(evt);
            }
        });
        manPanel.add(manLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 265, 45));

        manKey.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        manKey.setForeground(new java.awt.Color(102, 102, 102));
        manKey.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        manKey.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seccret Key", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        manKey.setEnabled(false);
        manKey.setPreferredSize(new java.awt.Dimension(265, 60));
        manKey.setSelectionColor(new java.awt.Color(255, 255, 255));
        manKey.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                manKeyKeyReleased(evt);
            }
        });
        manPanel.add(manKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 265, 45));

        manCPass.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        manCPass.setForeground(new java.awt.Color(102, 102, 102));
        manCPass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        manCPass.setToolTipText("");
        manCPass.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Confirm Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        manCPass.setCaretColor(new java.awt.Color(102, 102, 102));
        manCPass.setEnabled(false);
        manCPass.setName(""); // NOI18N
        manCPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manCPassMouseClicked(evt);
            }
        });
        manCPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                manCPassKeyReleased(evt);
            }
        });
        manPanel.add(manCPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 265, 45));

        manPass.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        manPass.setForeground(new java.awt.Color(102, 102, 102));
        manPass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        manPass.setToolTipText("");
        manPass.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        manPass.setCaretColor(new java.awt.Color(102, 102, 102));
        manPass.setEnabled(false);
        manPass.setName(""); // NOI18N
        manPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manPassMouseClicked(evt);
            }
        });
        manPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                manPassKeyReleased(evt);
            }
        });
        manPanel.add(manPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 265, 45));

        manRole.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        manRole.setForeground(new java.awt.Color(102, 102, 102));
        manRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Administrator", "Coordinator" }));
        manRole.setBorder(javax.swing.BorderFactory.createTitledBorder("Choose a role"));
        manRole.setEnabled(false);
        manRole.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                manRoleItemStateChanged(evt);
            }
        });
        manPanel.add(manRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 265, 50));

        manPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icon.png"))); // NOI18N
        manPhoto.setBorder(null);
        manPhoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        manPanel.add(manPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 185, 160));

        manUser.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        manUser.setForeground(new java.awt.Color(102, 102, 102));
        manUser.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        manUser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        manUser.setEnabled(false);
        manUser.setPreferredSize(new java.awt.Dimension(265, 60));
        manUser.setSelectionColor(new java.awt.Color(255, 255, 255));
        manUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                manUserKeyReleased(evt);
            }
        });
        manPanel.add(manUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 265, 45));

        userRecData.setBorder(null);
        userRecData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "First Name", "Middle Name", "Last Name", "Username", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userRecData.setRowHeight(20);
        jScrollPane2.setViewportView(userRecData);

        manPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 750, 710));

        manViewRec.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        manViewRec.setForeground(new java.awt.Color(255, 255, 255));
        manViewRec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/smol button.png"))); // NOI18N
        manViewRec.setText("View Users");
        manViewRec.setBorder(null);
        manViewRec.setBorderPainted(false);
        manViewRec.setContentAreaFilled(false);
        manViewRec.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        manViewRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manViewRecActionPerformed(evt);
            }
        });
        manPanel.add(manViewRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 690, 160, 50));

        manSvBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        manSvBtn.setForeground(new java.awt.Color(255, 255, 255));
        manSvBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/smol button.png"))); // NOI18N
        manSvBtn.setText("Save");
        manSvBtn.setBorder(null);
        manSvBtn.setBorderPainted(false);
        manSvBtn.setContentAreaFilled(false);
        manSvBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        manSvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manSvBtnActionPerformed(evt);
            }
        });
        manPanel.add(manSvBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 690, 160, 50));

        manEID.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        manEID.setForeground(new java.awt.Color(102, 102, 102));
        manEID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        manEID.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        manEID.setPreferredSize(new java.awt.Dimension(265, 60));
        manEID.setSelectionColor(new java.awt.Color(255, 255, 255));
        manEID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                manEIDKeyReleased(evt);
            }
        });
        manPanel.add(manEID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 265, 50));

        errorResponse.setForeground(new java.awt.Color(253, 104, 0));
        errorResponse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorResponse.setBorder(null);
        errorResponse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        manPanel.add(errorResponse, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 265, 30));

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

        MainPanel.add(manPanel, "manPanel");

        logPanel.setBackground(new java.awt.Color(255, 255, 255));
        logPanel.setBorder(null);
        logPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogData.setBorder(null);
        LogData.setModel(new javax.swing.table.DefaultTableModel(
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
        LogData.setRowHeight(20);
        jScrollPane3.setViewportView(LogData);

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

        SysDel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        SysDel.setForeground(new java.awt.Color(255, 255, 255));
        SysDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/smol button.png"))); // NOI18N
        SysDel.setText("Delete");
        SysDel.setBorder(null);
        SysDel.setBorderPainted(false);
        SysDel.setContentAreaFilled(false);
        SysDel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SysDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SysDelActionPerformed(evt);
            }
        });
        logPanel.add(SysDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 160, -1));

        sysLogBg.setBackground(new java.awt.Color(255, 186, 8));
        sysLogBg.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        sysLogBg.setForeground(new java.awt.Color(51, 51, 51));
        sysLogBg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sysLogBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/bgg.png"))); // NOI18N
        sysLogBg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        sysLogBg.setMaximumSize(new java.awt.Dimension(1430, 790));
        sysLogBg.setMinimumSize(new java.awt.Dimension(1430, 790));
        sysLogBg.setPreferredSize(new java.awt.Dimension(1430, 790));
        logPanel.add(sysLogBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 740));

        MainPanel.add(logPanel, "logPanel");

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
        cardLayout.show(MainPanel, "manPanel");
    }//GEN-LAST:event_manDataActionPerformed

    private void SyslogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SyslogActionPerformed
        cardLayout.show(MainPanel, "logPanel");
    }//GEN-LAST:event_SyslogActionPerformed

    private void sysViewRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sysViewRecActionPerformed

        String SQLrecords = "SELECT * FROM SYSTEMLOG";
        DefaultTableModel RecordTable = (DefaultTableModel) LogData.getModel();
        Object[] addData = new Object[7];

        if (conn != null) {
            try {
                PreparedStatement StateLogs = conn.prepareStatement(SQLrecords);
                ResultSet records = StateLogs.executeQuery();
                records.next();

                if (records == null) {
                    JOptionPane.showMessageDialog(null, "Records is empty");
                    records.close();
                } else {

                    RecordTable.setRowCount(0);
                    while (records.getRow() > 0) {
                        String LogID = records.getString("LOGID");
                        String Date = records.getString("DATE");
                        String Time = records.getString("TIME");
                        String VID = records.getString("STUDENTID");
                        String UID = records.getString("USERID");
                        String SID = records.getString("VIOLATIONID");

                        addData[0] = LogID;
                        addData[1] = Date;
                        addData[2] = Time;
                        addData[3] = SID;
                        addData[4] = UID;
                        addData[5] = VID;
                        RecordTable.addRow(addData);
                        records.next();

                    }

                    records.close();

                }
            } catch (SQLException ex) {
                Logger.getLogger(CoorMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_sysViewRecActionPerformed

    private void SysDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SysDelActionPerformed
        JOptionPane.showMessageDialog(null, "This will wipe the records on System Log, Please proceed with caution");
        String EmpID = JOptionPane.showInputDialog(null, "Please enter your Employee ID for confirmation");
        String lDate = LocalDate.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        String lTime = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        int EID = Integer.parseInt(EmpID);

        if (!EmpID.trim().isEmpty()) {
            try {
                String SQLFind = "SELECT * FROM USERDATA WHERE EID=?";
                PreparedStatement StateFind = conn.prepareStatement(SQLFind);
                StateFind.setInt(1,EID);
                ResultSet records = StateFind.executeQuery();
                records.next();
                String LocID = records.getString("EID");
                
                if (LocID.equals(UID)) {
                    try {
                        String SQLDelete = "DELETE FROM SYSTEMLOG";
                        PreparedStatement StateDelete = conn.prepareStatement(SQLDelete);
                        StateDelete.executeUpdate();
                        StateDelete.close();
                        
                        String SQLTrack = "INSERT INTO SYSTEMLOG VALUES (DEFAULT,?,?,NULL,?,NULL)";
                        PreparedStatement StateTrack = conn.prepareStatement(SQLTrack);
                        StateTrack.setString(1, lDate);
                        StateTrack.setString(2, lTime);
                        StateTrack.setInt(3, EID);
                        StateTrack.executeUpdate();
                        StateTrack.close();
                        
                        JOptionPane.showMessageDialog(null, "Records has been succesfully wiped");
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(AdminMain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else {
                    JOptionPane.showMessageDialog(null, "Invalid Employee ID Confirmation");
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdminMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_SysDelActionPerformed

    private void manViewRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manViewRecActionPerformed
        String SQLrecords = "SELECT * FROM USERDATA LEFT OUTER JOIN USERCRED ON USERDATA.EID = USERCRED.EID";
        DefaultTableModel RecordTable = (DefaultTableModel) userRecData.getModel();
        Object[] addData = new Object[7];

        if (conn != null) {
            try {
                PreparedStatement StateRecords = conn.prepareStatement(SQLrecords);
                ResultSet records = StateRecords.executeQuery();
                records.next();

                if (records == null) {
                    JOptionPane.showMessageDialog(null, "Records is empty");
                    records.close();
                } else {

                    RecordTable.setRowCount(0);
                    while (records.getRow() > 0) {
                        String EID = records.getString("EID");
                        String fName = records.getString("ENAME");
                        String mName = records.getString("EMNAME");
                        String lName = records.getString("ELNAME");
                        String username = records.getString("USERNAME");
                        String role = records.getString("ROLE");

                        addData[0] = EID;
                        addData[1] = fName;
                        addData[2] = mName;
                        addData[3] = lName;
                        addData[4] = username;
                        addData[5] = role;
                        RecordTable.addRow(addData);
                        records.next();

                    }

                    records.close();

                }
            } catch (SQLException ex) {
                Logger.getLogger(CoorMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_manViewRecActionPerformed

    private void manFNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manFNameKeyReleased
        if (!manFName.getText().trim().isEmpty()) {
            manMidName.setEnabled(true);
        } else {
            manMidName.setEnabled(false);
        }

    }//GEN-LAST:event_manFNameKeyReleased

    private void manMidNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manMidNameKeyReleased
        if (!manMidName.getText().trim().isEmpty()) {
            manLName.setEnabled(true);
        } else {
            manLName.setEnabled(false);
        }
    }//GEN-LAST:event_manMidNameKeyReleased

    private void manLNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manLNameKeyReleased
        if (!manLName.getText().trim().isEmpty()) {
            manRole.setEnabled(true);
        } else {
            manRole.setEnabled(false);
        }
    }//GEN-LAST:event_manLNameKeyReleased

    private void manUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manUserKeyReleased
        if (!manUser.getText().trim().isEmpty()) {
            manPass.setEnabled(true);
        } else {
            manPass.setEnabled(false);
        }
    }//GEN-LAST:event_manUserKeyReleased

    private void manPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manPassKeyReleased
        if (!manPass.getText().trim().isEmpty()) {
            manCPass.setEnabled(true);
        } else {
            manCPass.setEnabled(false);
        }
    }//GEN-LAST:event_manPassKeyReleased

    private void manCPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manCPassKeyReleased
        if (!manCPass.getText().trim().isEmpty()) {
            manKey.setEnabled(true);
        } else {
            manKey.setEnabled(false);
        }
    }//GEN-LAST:event_manCPassKeyReleased

    private void manKeyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manKeyKeyReleased
        if (!manCPass.getText().trim().isEmpty()) {
            if (manPass.getText().equals(manCPass.getText())) {
                manKey.setEnabled(true);
            } else {
                errorResponse.setText("Password Mismatch");
            }
        } else {
            manKey.setEnabled(false);
        }
    }//GEN-LAST:event_manKeyKeyReleased

    private void manRoleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_manRoleItemStateChanged
        manUser.setEnabled(true);
    }//GEN-LAST:event_manRoleItemStateChanged

    private void manPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manPassMouseClicked
        errorResponse.setText("");
    }//GEN-LAST:event_manPassMouseClicked

    private void manCPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manCPassMouseClicked
        errorResponse.setText("");
    }//GEN-LAST:event_manCPassMouseClicked

    private void manSvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manSvBtnActionPerformed

        if (conn != null) {
            try {
                String ID = manEID.getText();
                int empID = Integer.parseInt(ID);
                String SQLFind = "SELECT * FROM USERCRED WHERE EID=?";
                PreparedStatement StateFind = conn.prepareStatement(SQLFind);
                StateFind.setInt(1, empID);
                ResultSet records = StateFind.executeQuery();

                if (!records.next()) {

                    records.close();
                    String SQLInsert = "INSERT INTO USERDATA VALUES (?,?,?,?)";
                    String SQLInsert1 = "INSERT INTO USERCRED VALUES (?,?,?,?,?)";

                    String regFname = manFName.getText();
                    String regMname = manMidName.getText();
                    String regLname = manLName.getText();
                    String regKey = manKey.getText();
                    String encryptedKey = Security.encrypt(regKey);
                    String regUser = manUser.getText();
                    String regRole = (String) manRole.getSelectedItem();
                    String regPass = manPass.getText();
                    String encryptedPass = Security.encrypt(regPass);

                    try {
                        PreparedStatement StateInsert = conn.prepareStatement(SQLInsert);
                        StateInsert.setInt(1, empID);
                        StateInsert.setString(2, regFname);
                        StateInsert.setString(3, regMname);
                        StateInsert.setString(4, regLname);
                        StateInsert.executeUpdate();
                        StateInsert.close();

                        PreparedStatement StateInsert2 = conn.prepareStatement(SQLInsert1);
                        StateInsert2.setString(1, regUser);
                        StateInsert2.setString(2, encryptedPass);
                        StateInsert2.setString(3, regRole);
                        StateInsert2.setInt(4, empID);
                        StateInsert2.setString(5, encryptedKey);
                        StateInsert2.executeUpdate();
                        StateInsert2.close();

                        JOptionPane.showMessageDialog(null, "Records added successfully");

                        manEID.setText("");
                        manFName.setText("");
                        manMidName.setText("");
                        manLName.setText("");
                        manKey.setText("");
                        manUser.setText("");
                        manRole.setSelectedItem("");
                        manPass.setText("");
                        manCPass.setText("");

                    } catch (SQLException ex) {
                        Logger.getLogger(CoorMain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    errorResponse.setText("Employee already registered");
                }
            } catch (SQLException ex) {
                Logger.getLogger(CoorMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NumberFormatException e) {
                errorResponse.setText("Invalid Employee ID");
            }
        }
    }//GEN-LAST:event_manSvBtnActionPerformed

    private void manEIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_manEIDKeyReleased
        if (!manEID.getText().trim().isEmpty()) {
            manFName.setEnabled(true);
        } else {
            manFName.setEnabled(false);
        }
    }//GEN-LAST:event_manEIDKeyReleased

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
    private javax.swing.JTable LogData;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JButton SysDel;
    private javax.swing.JButton Syslog;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JLabel errorResponse;
    private javax.swing.JLabel generate;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel logPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel manBg;
    private javax.swing.JPasswordField manCPass;
    private javax.swing.JButton manData;
    private javax.swing.JTextField manEID;
    private javax.swing.JTextField manFName;
    private javax.swing.JTextField manKey;
    private javax.swing.JTextField manLName;
    private javax.swing.JTextField manMidName;
    private javax.swing.JPanel manPanel;
    private javax.swing.JPasswordField manPass;
    private javax.swing.JLabel manPhoto;
    private javax.swing.JComboBox manRole;
    private javax.swing.JButton manSvBtn;
    private javax.swing.JTextField manUser;
    private javax.swing.JButton manViewRec;
    private javax.swing.JLabel minimizeBtn;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel sysLogBg;
    private javax.swing.JButton sysViewRec;
    private javax.swing.JTable userRecData;
    // End of variables declaration//GEN-END:variables

}
