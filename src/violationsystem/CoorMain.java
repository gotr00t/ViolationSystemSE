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
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author _
 */
public class CoorMain extends javax.swing.JFrame {

    int mousepX;
    int mousepY;
    Connection conn = DBConnector.ConnectDB();
    String UID = null;
    CardLayout cardLayout;

    public CoorMain(String DBID) {

        UID = DBID;
        initComponents();

        //set Field Limits for Text Areas
        cardLayout = (CardLayout) (MainPanel.getLayout());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sEmail = new javax.swing.JLabel();
        CoorMain = new javax.swing.JPanel();
        MenuBar = new javax.swing.JPanel();
        minimizeBtn = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        SplitPane = new javax.swing.JSplitPane();
        sidebar = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        searchStudent = new javax.swing.JButton();
        manage = new javax.swing.JButton();
        register = new javax.swing.JButton();
        logout = new javax.swing.JLabel();
        generate = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        scanPanel = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        studentName = new javax.swing.JLabel();
        studentTrack = new javax.swing.JLabel();
        studentTrackLbl = new javax.swing.JLabel();
        studentSection = new javax.swing.JLabel();
        studentSectionLbl = new javax.swing.JLabel();
        errorResponse = new javax.swing.JLabel();
        studentNumberInp = new javax.swing.JTextField();
        ViewInfo = new javax.swing.JButton();
        AddVio = new javax.swing.JButton();
        bgScan = new javax.swing.JLabel();
        AddVioPanel = new javax.swing.JPanel();
        icon1 = new javax.swing.JLabel();
        Violation = new javax.swing.JComboBox();
        SComments = new javax.swing.JTextArea();
        CoorRemarks = new javax.swing.JTextField();
        DatePanel = new datechooser.beans.DateChooserPanel();
        SaveVio = new javax.swing.JButton();
        SName = new javax.swing.JLabel();
        errorResponseV = new javax.swing.JLabel();
        bgVio = new javax.swing.JLabel();
        managePanel = new javax.swing.JPanel();
        manFName = new javax.swing.JTextField();
        manMidName = new javax.swing.JTextField();
        manLName = new javax.swing.JTextField();
        manSNumber = new javax.swing.JTextField();
        manStrand = new javax.swing.JTextField();
        manEmail = new javax.swing.JTextField();
        manSec = new javax.swing.JTextField();
        manAdv = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        vioTableData = new javax.swing.JTable();
        manSave = new javax.swing.JButton();
        manPhoto = new javax.swing.JLabel();
        manPicUpl = new javax.swing.JButton();
        manSearch = new javax.swing.JButton();
        manEdit = new javax.swing.JButton();
        manGrade = new javax.swing.JTextField();
        errorResponseMan = new javax.swing.JLabel();
        manBg = new javax.swing.JLabel();
        regStudent = new javax.swing.JPanel();
        regFName = new javax.swing.JTextField();
        regMidName = new javax.swing.JTextField();
        regLName = new javax.swing.JTextField();
        regSNumber = new javax.swing.JTextField();
        regStrand = new javax.swing.JTextField();
        regEmail = new javax.swing.JTextField();
        regGrade = new javax.swing.JTextField();
        regAdv = new javax.swing.JTextField();
        regSave = new javax.swing.JButton();
        regPhoto = new javax.swing.JLabel();
        regPicUpl = new javax.swing.JButton();
        AddViolation = new javax.swing.JButton();
        regSec = new javax.swing.JTextField();
        errorResponseReg = new javax.swing.JLabel();
        regBg = new javax.swing.JLabel();

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

        searchStudent.setBackground(new java.awt.Color(255, 255, 255));
        searchStudent.setFont(new java.awt.Font("Corbel", 1, 22)); // NOI18N
        searchStudent.setForeground(new java.awt.Color(255, 255, 255));
        searchStudent.setText("Search Student");
        searchStudent.setAlignmentY(0.0F);
        searchStudent.setBorder(null);
        searchStudent.setBorderPainted(false);
        searchStudent.setContentAreaFilled(false);
        searchStudent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchStudent.setIconTextGap(0);
        searchStudent.setMargin(null);
        searchStudent.setPreferredSize(new java.awt.Dimension(147, 51));
        searchStudent.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        searchStudent.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        searchStudent.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        searchStudent.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        searchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStudentActionPerformed(evt);
            }
        });

        manage.setBackground(new java.awt.Color(255, 255, 255));
        manage.setFont(new java.awt.Font("Corbel", 1, 22)); // NOI18N
        manage.setForeground(new java.awt.Color(255, 255, 255));
        manage.setText("Manage Data");
        manage.setAlignmentY(0.0F);
        manage.setBorder(null);
        manage.setContentAreaFilled(false);
        manage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        manage.setIconTextGap(0);
        manage.setMargin(null);
        manage.setPreferredSize(new java.awt.Dimension(147, 51));
        manage.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        manage.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        manage.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        manage.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        manage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageActionPerformed(evt);
            }
        });

        register.setFont(new java.awt.Font("Corbel", 1, 22)); // NOI18N
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setText("Register");
        register.setAlignmentY(0.0F);
        register.setBorder(null);
        register.setContentAreaFilled(false);
        register.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        register.setIconTextGap(0);
        register.setMargin(null);
        register.setPreferredSize(new java.awt.Dimension(147, 51));
        register.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        register.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        register.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        register.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/tab.png"))); // NOI18N
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
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
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manage, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(sidebarLayout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(logo))
                        .addGroup(sidebarLayout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(searchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(logout)
                .addGap(51, 51, 51))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(logo)
                .addGap(18, 18, 18)
                .addComponent(searchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manage, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout)
                    .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(333, Short.MAX_VALUE))
        );

        SplitPane.setLeftComponent(sidebar);

        MainPanel.setLayout(new java.awt.CardLayout());

        scanPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icon.png"))); // NOI18N
        icon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        scanPanel.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 240, 180));

        studentName.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        studentName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentName.setText("Enter your Student ID:");
        studentName.setBorder(null);
        studentName.setFocusable(false);
        studentName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        studentName.setRequestFocusEnabled(false);
        studentName.setVerifyInputWhenFocusTarget(false);
        scanPanel.add(studentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 520, 60));

        studentTrack.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 20)); // NOI18N
        studentTrack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentTrack.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        scanPanel.add(studentTrack, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 340, 30));

        studentTrackLbl.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 13)); // NOI18N
        studentTrackLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentTrackLbl.setText("TRACK");
        studentTrackLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        scanPanel.add(studentTrackLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 340, -1));

        studentSection.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 20)); // NOI18N
        studentSection.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentSection.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        scanPanel.add(studentSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 340, 30));

        studentSectionLbl.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 13)); // NOI18N
        studentSectionLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentSectionLbl.setText("SECTION");
        studentSectionLbl.setBorder(null);
        studentSectionLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        scanPanel.add(studentSectionLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 340, -1));

        errorResponse.setBackground(new java.awt.Color(255, 255, 255));
        errorResponse.setForeground(new java.awt.Color(255, 153, 0));
        errorResponse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorResponse.setBorder(null);
        errorResponse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        scanPanel.add(errorResponse, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 450, 50));

        studentNumberInp.setForeground(new java.awt.Color(102, 102, 102));
        studentNumberInp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        studentNumberInp.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Number", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(1, 1, 1))); // NOI18N
        studentNumberInp.setSelectedTextColor(new java.awt.Color(1, 1, 1));
        studentNumberInp.setSelectionColor(new java.awt.Color(255, 255, 255));
        studentNumberInp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                studentNumberInpKeyReleased(evt);
            }
        });
        scanPanel.add(studentNumberInp, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 340, 60));

        ViewInfo.setBackground(new java.awt.Color(255, 255, 255));
        ViewInfo.setForeground(new java.awt.Color(255, 255, 255));
        ViewInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/button2.png"))); // NOI18N
        ViewInfo.setText("View Information");
        ViewInfo.setBorder(null);
        ViewInfo.setBorderPainted(false);
        ViewInfo.setContentAreaFilled(false);
        ViewInfo.setFocusPainted(false);
        ViewInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ViewInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewInfoActionPerformed(evt);
            }
        });
        scanPanel.add(ViewInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, 200, 50));

        AddVio.setBackground(new java.awt.Color(255, 255, 255));
        AddVio.setForeground(new java.awt.Color(255, 255, 255));
        AddVio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/button2.png"))); // NOI18N
        AddVio.setText("Add Violation");
        AddVio.setBorder(null);
        AddVio.setBorderPainted(false);
        AddVio.setContentAreaFilled(false);
        AddVio.setEnabled(false);
        AddVio.setFocusPainted(false);
        AddVio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddVio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddVioActionPerformed(evt);
            }
        });
        scanPanel.add(AddVio, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 570, 200, 50));

        bgScan.setBackground(new java.awt.Color(255, 186, 8));
        bgScan.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        bgScan.setForeground(new java.awt.Color(51, 51, 51));
        bgScan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bgScan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/bgg.png"))); // NOI18N
        bgScan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        bgScan.setMaximumSize(new java.awt.Dimension(1430, 790));
        bgScan.setMinimumSize(new java.awt.Dimension(1430, 790));
        bgScan.setPreferredSize(new java.awt.Dimension(1430, 790));
        scanPanel.add(bgScan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 740));

        MainPanel.add(scanPanel, "scanPanel");

        AddVioPanel.setMinimumSize(new java.awt.Dimension(1120, 740));
        AddVioPanel.setPreferredSize(new java.awt.Dimension(1120, 740));
        AddVioPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icon.png"))); // NOI18N
        icon1.setText("jLabel5");
        AddVioPanel.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 170, 170));

        Violation.setBackground(new java.awt.Color(255, 255, 255));
        Violation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Proselytizing", "Public display of affection ", "Uttering vulgar words or bad words", "Expounding or proclaiming doctrines contrary to law and morals and/or to the Mission and Vision of the University", "Unruly behavior inside the classroom, or while within the University premises", "Unless otherwise authorized for legitimate purpose, bringing gambling paraphernalia inside the campus premises", "Smoking cigarettes, cigar, electronic cigar or cigarettes, within the campus or other areas declared as prohibited zone", "Smoke-belching vehicles, or leaving the car engine on while parked inside the University premises", "Playing of car stereo with the use of bass amplifiers, boosters at high volume", "Violation of the University traffic policy", "Littering and violation of waste disposal policy", "Unauthorized use of the University logo and name", "Repeated failure to wear valid University identification card", "Repeated failure to wear the prescribed uniform, or to comply with the University’s policy on good grooming", "Simple disobedience to lawful orders of school authorities and/or their representatives", "Violation of the rules of conduct on diligence and good grooming", "Violation of the rules and regulations on the use of organization rooms", "Posting on bulletin boards, display of posters, streamers and signboards within the University premises without the approval of the Principal/Dean/Director/Regent/Secretary-General or their authorized representatives", "Other offenses analogous to the foregoing." }));
        Violation.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Choose a Violation Category", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        Violation.setOpaque(false);
        Violation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViolationActionPerformed(evt);
            }
        });
        AddVioPanel.add(Violation, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 540, 50));

        SComments.setColumns(20);
        SComments.setRows(5);
        SComments.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comments", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        SComments.setEnabled(false);
        SComments.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SCommentsKeyReleased(evt);
            }
        });
        AddVioPanel.add(SComments, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 740, 240));

        CoorRemarks.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Remarks", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        CoorRemarks.setEnabled(false);
        AddVioPanel.add(CoorRemarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 600, 740, 50));

        DatePanel.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Cantarell", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(46, 52, 54),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Cantarell", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(46, 52, 54),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Cantarell", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Cantarell", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Cantarell", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(46, 52, 54),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Cantarell", java.awt.Font.PLAIN, 15),
                    new java.awt.Color(46, 52, 54),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    DatePanel.setBorder(null);
    DatePanel.setCalendarPreferredSize(new java.awt.Dimension(200, 180));
    DatePanel.setNavigateFont(new java.awt.Font("Source Code Pro Light", java.awt.Font.PLAIN, 15));
    DatePanel.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_PERIOD);
    DatePanel.setVisible(false);
    AddVioPanel.add(DatePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 230, 160));

    SaveVio.setForeground(new java.awt.Color(246, 245, 244));
    SaveVio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/smol button.png"))); // NOI18N
    SaveVio.setText("Save");
    SaveVio.setBorder(null);
    SaveVio.setBorderPainted(false);
    SaveVio.setContentAreaFilled(false);
    SaveVio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    SaveVio.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            SaveVioActionPerformed(evt);
        }
    });
    AddVioPanel.add(SaveVio, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 660, 150, 50));
    AddVioPanel.add(SName, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 220, 30));

    errorResponseV.setForeground(new java.awt.Color(255, 104, 0));
    AddVioPanel.add(errorResponseV, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 250, 30));

    bgVio.setBackground(new java.awt.Color(255, 186, 8));
    bgVio.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
    bgVio.setForeground(new java.awt.Color(51, 51, 51));
    bgVio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    bgVio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/bgg.png"))); // NOI18N
    bgVio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
    bgVio.setMaximumSize(new java.awt.Dimension(1430, 790));
    bgVio.setMinimumSize(new java.awt.Dimension(1430, 790));
    bgVio.setPreferredSize(new java.awt.Dimension(1430, 790));
    AddVioPanel.add(bgVio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 740));

    MainPanel.add(AddVioPanel, "addVioPanel");

    managePanel.setBackground(new java.awt.Color(255, 255, 255));
    managePanel.setBorder(null);
    managePanel.setMinimumSize(new java.awt.Dimension(1120, 740));
    managePanel.setPreferredSize(new java.awt.Dimension(1120, 740));
    managePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    manFName.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
    manFName.setForeground(new java.awt.Color(102, 102, 102));
    manFName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    manFName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
    manFName.setEnabled(false);
    manFName.setPreferredSize(new java.awt.Dimension(265, 60));
    manFName.setSelectionColor(new java.awt.Color(255, 255, 255));
    managePanel.add(manFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 265, 60));

    manMidName.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
    manMidName.setForeground(new java.awt.Color(102, 102, 102));
    manMidName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    manMidName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Middle Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
    manMidName.setEnabled(false);
    manMidName.setPreferredSize(new java.awt.Dimension(265, 60));
    manMidName.setSelectionColor(new java.awt.Color(255, 255, 255));
    managePanel.add(manMidName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 265, 60));

    manLName.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
    manLName.setForeground(new java.awt.Color(102, 102, 102));
    manLName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    manLName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
    manLName.setEnabled(false);
    manLName.setPreferredSize(new java.awt.Dimension(265, 60));
    manLName.setSelectionColor(new java.awt.Color(255, 255, 255));
    managePanel.add(manLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 265, 60));

    manSNumber.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
    manSNumber.setForeground(new java.awt.Color(102, 102, 102));
    manSNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    manSNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
    manSNumber.setEnabled(false);
    manSNumber.setPreferredSize(new java.awt.Dimension(265, 60));
    manSNumber.setSelectionColor(new java.awt.Color(255, 255, 255));
    managePanel.add(manSNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 265, 60));

    manStrand.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
    manStrand.setForeground(new java.awt.Color(102, 102, 102));
    manStrand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    manStrand.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Strand", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
    manStrand.setEnabled(false);
    manStrand.setPreferredSize(new java.awt.Dimension(265, 60));
    manStrand.setSelectionColor(new java.awt.Color(255, 255, 255));
    managePanel.add(manStrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 265, 60));

    manEmail.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
    manEmail.setForeground(new java.awt.Color(102, 102, 102));
    manEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    manEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E-mail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
    manEmail.setEnabled(false);
    manEmail.setPreferredSize(new java.awt.Dimension(265, 60));
    manEmail.setSelectionColor(new java.awt.Color(255, 255, 255));
    managePanel.add(manEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 265, 60));

    manSec.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
    manSec.setForeground(new java.awt.Color(102, 102, 102));
    manSec.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    manSec.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Section", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
    manSec.setEnabled(false);
    manSec.setPreferredSize(new java.awt.Dimension(265, 60));
    manSec.setSelectionColor(new java.awt.Color(255, 255, 255));
    managePanel.add(manSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 265, 60));

    manAdv.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
    manAdv.setForeground(new java.awt.Color(102, 102, 102));
    manAdv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    manAdv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adviser", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
    manAdv.setEnabled(false);
    manAdv.setPreferredSize(new java.awt.Dimension(265, 60));
    manAdv.setSelectionColor(new java.awt.Color(255, 255, 255));
    managePanel.add(manAdv, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 265, 60));

    vioTableData.setBorder(null);
    vioTableData.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "Date", "Violation", "Remarks", "Comments"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    vioTableData.setEnabled(false);
    vioTableData.setFocusable(false);
    vioTableData.setRowHeight(20);
    jScrollPane2.setViewportView(vioTableData);

    managePanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 1078, 420));

    manSave.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
    manSave.setForeground(new java.awt.Color(255, 255, 255));
    manSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/smol button.png"))); // NOI18N
    manSave.setText("Save");
    manSave.setBorder(null);
    manSave.setBorderPainted(false);
    manSave.setContentAreaFilled(false);
    manSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    manSave.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            manSaveActionPerformed(evt);
        }
    });
    managePanel.add(manSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 670, 170, 70));

    manPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icon.png"))); // NOI18N
    manPhoto.setBorder(null);
    manPhoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    managePanel.add(manPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, -1, 159));

    manPicUpl.setText("Upload");
    managePanel.add(manPicUpl, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 180, 90, -1));

    manSearch.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
    manSearch.setForeground(new java.awt.Color(255, 255, 255));
    manSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/smol button.png"))); // NOI18N
    manSearch.setText("Search");
    manSearch.setBorder(null);
    manSearch.setBorderPainted(false);
    manSearch.setContentAreaFilled(false);
    manSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    manSearch.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            manSearchActionPerformed(evt);
        }
    });
    managePanel.add(manSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 670, 170, 70));

    manEdit.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
    manEdit.setForeground(new java.awt.Color(255, 255, 255));
    manEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/smol button.png"))); // NOI18N
    manEdit.setText("Edit");
    manEdit.setBorder(null);
    manEdit.setBorderPainted(false);
    manEdit.setContentAreaFilled(false);
    manEdit.setEnabled(false);
    manEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    manEdit.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            manEditActionPerformed(evt);
        }
    });
    managePanel.add(manEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 670, 170, 70));

    manGrade.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
    manGrade.setForeground(new java.awt.Color(102, 102, 102));
    manGrade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    manGrade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Grade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
    manGrade.setEnabled(false);
    manGrade.setPreferredSize(new java.awt.Dimension(265, 60));
    manGrade.setSelectionColor(new java.awt.Color(255, 255, 255));
    managePanel.add(manGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 265, 60));

    errorResponseMan.setForeground(new java.awt.Color(253, 104, 0));
    errorResponseMan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    errorResponseMan.setBorder(null);
    errorResponseMan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    managePanel.add(errorResponseMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 265, 30));

    manBg.setBackground(new java.awt.Color(255, 186, 8));
    manBg.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
    manBg.setForeground(new java.awt.Color(51, 51, 51));
    manBg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    manBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/bgg.png"))); // NOI18N
    manBg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
    manBg.setMaximumSize(new java.awt.Dimension(1430, 790));
    manBg.setMinimumSize(new java.awt.Dimension(1430, 790));
    manBg.setPreferredSize(new java.awt.Dimension(1430, 790));
    managePanel.add(manBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 740));

    MainPanel.add(managePanel, "managePanel");

    regStudent.setBackground(new java.awt.Color(255, 255, 255));
    regStudent.setBorder(null);
    regStudent.setMinimumSize(new java.awt.Dimension(1120, 740));
    regStudent.setPreferredSize(new java.awt.Dimension(1120, 740));
    regStudent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    regFName.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
    regFName.setForeground(new java.awt.Color(102, 102, 102));
    regFName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    regFName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
    regFName.setMinimumSize(new java.awt.Dimension(265, 60));
    regFName.setPreferredSize(new java.awt.Dimension(265, 60));
    regStudent.add(regFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 265, 60));

    regMidName.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
    regMidName.setForeground(new java.awt.Color(102, 102, 102));
    regMidName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    regMidName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Middle Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
    regMidName.setMinimumSize(new java.awt.Dimension(265, 60));
    regMidName.setPreferredSize(new java.awt.Dimension(265, 60));
    regStudent.add(regMidName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 265, 60));

    regLName.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
    regLName.setForeground(new java.awt.Color(102, 102, 102));
    regLName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    regLName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
    regLName.setMinimumSize(new java.awt.Dimension(265, 60));
    regLName.setPreferredSize(new java.awt.Dimension(265, 60));
    regStudent.add(regLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 265, 60));

    regSNumber.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
    regSNumber.setForeground(new java.awt.Color(102, 102, 102));
    regSNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    regSNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
    regSNumber.setMinimumSize(new java.awt.Dimension(265, 60));
    regSNumber.setPreferredSize(new java.awt.Dimension(265, 60));
    regSNumber.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            regSNumberMouseClicked(evt);
        }
    });
    regStudent.add(regSNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 265, 60));

    regStrand.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
    regStrand.setForeground(new java.awt.Color(102, 102, 102));
    regStrand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    regStrand.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Strand", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
    regStrand.setMinimumSize(new java.awt.Dimension(265, 60));
    regStrand.setPreferredSize(new java.awt.Dimension(265, 60));
    regStudent.add(regStrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 265, 60));

    regEmail.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
    regEmail.setForeground(new java.awt.Color(102, 102, 102));
    regEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    regEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E-mail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
    regEmail.setMinimumSize(new java.awt.Dimension(265, 60));
    regEmail.setPreferredSize(new java.awt.Dimension(265, 60));
    regStudent.add(regEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 265, 60));

    regGrade.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
    regGrade.setForeground(new java.awt.Color(102, 102, 102));
    regGrade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    regGrade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Grade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
    regGrade.setMinimumSize(new java.awt.Dimension(265, 60));
    regGrade.setPreferredSize(new java.awt.Dimension(265, 60));
    regStudent.add(regGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, 265, 60));

    regAdv.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
    regAdv.setForeground(new java.awt.Color(102, 102, 102));
    regAdv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    regAdv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adviser", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
    regAdv.setMinimumSize(new java.awt.Dimension(265, 60));
    regAdv.setPreferredSize(new java.awt.Dimension(265, 60));
    regStudent.add(regAdv, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, 265, 60));

    regSave.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
    regSave.setForeground(new java.awt.Color(255, 255, 255));
    regSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/smol button.png"))); // NOI18N
    regSave.setText("Save");
    regSave.setBorder(null);
    regSave.setBorderPainted(false);
    regSave.setContentAreaFilled(false);
    regSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    regSave.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            regSaveActionPerformed(evt);
        }
    });
    regStudent.add(regSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, -1, -1));

    regPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icon.png"))); // NOI18N
    regPhoto.setBorder(null);
    regPhoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    regStudent.add(regPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 170, 159));

    regPicUpl.setText("Upload Photo");
    regStudent.add(regPicUpl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 130, -1));

    AddViolation.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
    AddViolation.setForeground(new java.awt.Color(255, 255, 255));
    AddViolation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/smol button.png"))); // NOI18N
    AddViolation.setText("Add Violation");
    AddViolation.setBorder(null);
    AddViolation.setBorderPainted(false);
    AddViolation.setContentAreaFilled(false);
    AddViolation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    AddViolation.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            AddViolationActionPerformed(evt);
        }
    });
    regStudent.add(AddViolation, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, -1, -1));

    regSec.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
    regSec.setForeground(new java.awt.Color(102, 102, 102));
    regSec.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    regSec.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Section", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
    regSec.setMinimumSize(new java.awt.Dimension(265, 60));
    regSec.setPreferredSize(new java.awt.Dimension(265, 60));
    regStudent.add(regSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 265, 60));

    errorResponseReg.setForeground(new java.awt.Color(253, 140, 0));
    errorResponseReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    regStudent.add(errorResponseReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 300, 30));

    regBg.setBackground(new java.awt.Color(255, 186, 8));
    regBg.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
    regBg.setForeground(new java.awt.Color(51, 51, 51));
    regBg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    regBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/bgg.png"))); // NOI18N
    regBg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
    regBg.setMaximumSize(new java.awt.Dimension(1430, 790));
    regBg.setMinimumSize(new java.awt.Dimension(1430, 790));
    regBg.setPreferredSize(new java.awt.Dimension(1430, 790));
    regStudent.add(regBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 740));

    MainPanel.add(regStudent, "regPanel");

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

    private void ViewInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewInfoActionPerformed

        if (conn != null) {
            String StudentNumber = studentNumberInp.getText();
            String SQLFind = "SELECT * FROM STUDENTDATA WHERE STUDENTID=?";

            if (!StudentNumber.trim().isEmpty()) {
                try {
                    PreparedStatement stmt = conn.prepareStatement(SQLFind);
                    stmt.setString(1, StudentNumber);
                    ResultSet records = stmt.executeQuery();
                    if (!records.next()) {
                        errorResponse.setText("<html> Student ID not found on records <br/> &nbsp;&nbsp;&nbsp; Please proceed to register<html>");
                        records.close();
                    } else {
                        String SFName = records.getString("SFIRSTNAME");
                        String SMName = records.getString("SMIDNAME");
                        String SLName = records.getString("SLASTNAME");
                        String Sgrade = records.getString("SGRADE");
                        String SSec = records.getString("SSEC");
                        String STrack = records.getString("STRACK");
                        sEmail.setText(records.getString("SEMAIL"));
                        studentName.setText(SFName + " " + SMName + " " + SLName);
                        studentSection.setText("GRADE" + " " + Sgrade + "-" + STrack + "-" + SSec);
                        studentTrack.setText(STrack);
                        records.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(CoorMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                errorResponse.setText("Student Number Field is Empty");
            }
        }

    }//GEN-LAST:event_ViewInfoActionPerformed

    private void AddVioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddVioActionPerformed

        try {
            String SQLFind = "SELECT * FROM STUDENTDATA WHERE STUDENTID=?";
            PreparedStatement stmt = conn.prepareStatement(SQLFind);
            stmt.setString(1, studentNumberInp.getText());
            ResultSet records = stmt.executeQuery();
            //restrict non character symbols or integer

            if (!studentNumberInp.getText().trim().isEmpty()) {
                if (records.next()) {
                    cardLayout.show(MainPanel, "addVioPanel");
                } else {
                    errorResponse.setText("Invalid Student Number");
                    records.close();
                }
            } else {
                errorResponse.setText("Please enter a valid student number");
                records.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CoorMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddVioActionPerformed

    private void minimizeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtnMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeBtnMouseClicked

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        System.exit(0);

    }//GEN-LAST:event_closeBtnMouseClicked

    private void searchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStudentActionPerformed
        cardLayout.show(MainPanel, "scanPanel");
    }//GEN-LAST:event_searchStudentActionPerformed

    private void SaveVioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveVioActionPerformed
        Calendar datePnlSel = Calendar.getInstance();
        Date dateUtil = datePnlSel.getTime();
        SimpleDateFormat Format = new SimpleDateFormat("MM-dd-yyyy");
        String vDate = Format.format(dateUtil);
        String vTime = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        String vCat = (String) Violation.getSelectedItem();
        String vCom = SComments.getText();
        String vRem = CoorRemarks.getText();
        String sNumber = studentNumberInp.getText();
        String stEmail = sEmail.getText();

        if (!vCat.trim().isEmpty() && !vCom.trim().isEmpty() & !vRem.trim().isEmpty()) {

            try {

                String InsQry = "INSERT INTO VIOLATIONINFO VALUES (default,?,?,?,?,?,?,?,?)";
                PreparedStatement stmt = conn.prepareStatement(InsQry);
                stmt.setString(1, vCat);
                stmt.setString(2, vDate);
                stmt.setString(3, vTime);
                stmt.setString(4, vCom);
                stmt.setString(5, vRem);
                stmt.setString(6, sNumber);
                stmt.setString(7, UID);
                stmt.setString(8, stEmail);
                stmt.executeUpdate();
                stmt.close();
                errorResponseV.setText("Records has been update");

            } catch (SQLException ex) {
                Logger.getLogger(CoorMain.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            errorResponseV.setText("Please complete all fields");
        }

    }//GEN-LAST:event_SaveVioActionPerformed

    private void SCommentsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SCommentsKeyReleased
        CoorRemarks.setEnabled(true);
    }//GEN-LAST:event_SCommentsKeyReleased

    private void ViolationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViolationActionPerformed
        if (Violation.getSelectedIndex() > 0) {
            DatePanel.setVisible(true);
            SComments.setEnabled(true);
        } else {
            DatePanel.setVisible(false);
            SComments.setEnabled(false);
            CoorRemarks.setEnabled(false);
        }
    }//GEN-LAST:event_ViolationActionPerformed

    private void manageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageActionPerformed
        cardLayout.show(MainPanel, "managePanel");
    }//GEN-LAST:event_manageActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        cardLayout.show(MainPanel, "regPanel");
    }//GEN-LAST:event_registerActionPerformed

    private void manSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manSearchActionPerformed

        String searchStn = JOptionPane.showInputDialog("Please input a student number: ");

        if (conn != null) {

            String SQLrecords = "SELECT * FROM STUDENTDATA LEFT OUTER JOIN VIOLATIONINFO ON STUDENTDATA.STUDENTID = VIOLATIONINFO.SIDENT WHERE STUDENTID=?";
            DefaultTableModel vioTable = (DefaultTableModel) vioTableData.getModel();
            Object[] addData = new Object[4];
            vioTable.setRowCount(0);

            if (!searchStn.trim().isEmpty()) {
                try {
                    PreparedStatement stmt3 = conn.prepareStatement(SQLrecords);
                    stmt3.setString(1, searchStn);
                    ResultSet records = stmt3.executeQuery();
                    //add restriction to charater input
                    if (records == null) {
                        JOptionPane.showMessageDialog(null, "Student not on records");
                        records.close();
                    } else {
                        records.next();
                        String SFName = records.getString("SFIRSTNAME");
                        String SMName = records.getString("SMIDNAME");
                        String SLName = records.getString("SLASTNAME");
                        String SNum = records.getString("STUDENTID");
                        String sGrade = records.getString("SGRADE");
                        String sSec = records.getString("SSEC");
                        String sTrack = records.getString("STRACK");
                        String sEmail = records.getString("SEMAIL");
                        String sAdv = records.getString("SADVISER");

                        manSNumber.setText(SNum);
                        manFName.setText(SFName);
                        manMidName.setText(SMName);
                        manLName.setText(SLName);
                        manGrade.setText(sGrade);
                        manSec.setText(sSec);
                        manStrand.setText(sTrack);
                        manEmail.setText(sEmail);
                        manAdv.setText(sAdv);

                        while (records.getRow() > 0) {
                            String vDate = records.getString("VDATE");
                            String violation = records.getString("VIOLATION");
                            String vComments = records.getString("VCOMMENT");
                            String vRemarks = records.getString("VREMARKS");

                            addData[0] = vDate;
                            addData[1] = violation;
                            addData[2] = vComments;
                            addData[3] = vRemarks;
                            vioTable.addRow(addData);
                            records.next();

                        }

                        searchStn = "";
                        manEdit.setEnabled(true);
                        records.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(CoorMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Search input is empty");
            }
        }
    }//GEN-LAST:event_manSearchActionPerformed

    private void AddViolationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddViolationActionPerformed

        try {
            String StudNum = regSNumber.getText();
            int SNumber = Integer.parseInt(StudNum);
            String SQLFind = "SELECT * FROM STUDENTDATA WHERE STUDENTID=?";
            PreparedStatement stmt1 = conn.prepareStatement(SQLFind);
            stmt1.setInt(1, SNumber);
            ResultSet records = stmt1.executeQuery();

            if (!regSNumber.getText().trim().isEmpty()) {

                if (records.next()) {
                    cardLayout.show(MainPanel, "addVioPanel");
                    records.close();
                }
            } else {
                errorResponseReg.setText("Student number not found");
                records.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(CoorMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException | NumberFormatException e) {
            errorResponseReg.setText("Invalid Student Number");
        }

    }//GEN-LAST:event_AddViolationActionPerformed

    private void regSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regSaveActionPerformed

        if (conn != null) {
            try {
                String StudNum = regSNumber.getText();
                int SNumber = Integer.parseInt(StudNum);
                String SQLFind = "SELECT * FROM STUDENTDATA WHERE STUDENTID=?";
                PreparedStatement stmt1 = conn.prepareStatement(SQLFind);
                stmt1.setInt(1, SNumber);
                ResultSet records = stmt1.executeQuery();

                if (!records.next()) {

                    records.close();
                    String SQLupdate = "INSERT INTO STUDENTDATA VALUES (?,?,?,?,?,?,?,?,?)";
                    String RegSnum = regSNumber.getText();
                    String RegFname = regFName.getText();
                    String RegMname = regMidName.getText();
                    String RegLname = regLName.getText();
                    String RegGrade = regGrade.getText();
                    String SSec = regSec.getText();
                    String STrack = regStrand.getText();
                    String SEmail = regEmail.getText();
                    String SAdv = regAdv.getText();

                    try {
                        PreparedStatement stmt = conn.prepareStatement(SQLupdate);
                        stmt.setString(1, RegSnum);
                        stmt.setString(2, RegFname);
                        stmt.setString(3, RegMname);
                        stmt.setString(4, RegLname);
                        stmt.setString(5, RegGrade);
                        stmt.setString(6, SSec);
                        stmt.setString(7, STrack);
                        stmt.setString(8, SEmail);
                        stmt.setString(9, SAdv);
                        stmt.executeUpdate();
                        stmt.close();

                    } catch (SQLException ex) {
                        Logger.getLogger(CoorMain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    errorResponseReg.setText("Student already registered");
                }
            } catch (SQLException ex) {
                Logger.getLogger(CoorMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NumberFormatException e) {
                errorResponseReg.setText("Invalid Student Number");
            }
        }

    }//GEN-LAST:event_regSaveActionPerformed

    private void studentNumberInpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studentNumberInpKeyReleased
        if (!studentNumberInp.getText().trim().isEmpty()) {
            AddVio.setEnabled(true);
        } else {
            AddVio.setEnabled(false);
        }
    }//GEN-LAST:event_studentNumberInpKeyReleased

    private void regSNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regSNumberMouseClicked
        errorResponseReg.setText("");
    }//GEN-LAST:event_regSNumberMouseClicked

    private void manEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manEditActionPerformed

        manSNumber.setEnabled(true);
        manFName.setEnabled(true);
        manMidName.setEnabled(true);
        manLName.setEnabled(true);
        manGrade.setEnabled(true);
        manSec.setEnabled(true);
        manStrand.setEnabled(true);
        manEmail.setEnabled(true);
        manAdv.setEnabled(true);

    }//GEN-LAST:event_manEditActionPerformed

    private void manSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manSaveActionPerformed

        if (conn != null) {

            if (!manSNumber.getText().trim().isEmpty()) {
                try {
                    String SQLUpdate = "UPDATE STUDENTDATA SET STUDENTID = ?, SFIRSTNAME=?, SMIDNAME=?, SLASTNAME=?, SGRADE=?, SSEC=?, STRACK=?, SEMAIL=?, SADVISER=? WHERE STUDENTID=?";
                    String SQLUpdate2 = "UPDATE VIOLATIONINFO SET ,,,,";
                    String StudNum = manSNumber.getText();
                    int SNumber = Integer.parseInt(StudNum);

                    PreparedStatement stmt2 = conn.prepareStatement(SQLUpdate);
                    stmt2.setInt(1, SNumber);
                    stmt2.setString(2, manFName.getText());
                    stmt2.setString(3, manMidName.getText());
                    stmt2.setString(4, manLName.getText());
                    stmt2.setString(5, manGrade.getText());
                    stmt2.setString(6, manSec.getText());
                    stmt2.setString(7, manStrand.getText());
                    stmt2.setString(8, manEmail.getText());
                    stmt2.setString(9, manAdv.getText());
                    stmt2.setInt(10, SNumber);
                    stmt2.executeUpdate();
                    stmt2.close();

                    try {
                        String lDate = LocalDate.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
                        String lTime = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

                        String SQLTrack = "INSERT INTO DATACHANGELOGGER VALUES (?,?,?,null,?,?)";
                        PreparedStatement stmt4 = conn.prepareStatement(SQLTrack);
                        stmt4.setInt(1,SNumber);
                        stmt4.setString(3, UID);
                        stmt4.setString(5, lDate);
                        stmt4.setString(6, lTime);
                        stmt4.executeUpdate();
                        stmt4.close();
                        
                    }catch (SQLException e){
                        Logger.getLogger(CoorMain.class.getName()).log(Level.SEVERE, null, e);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(CoorMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                errorResponseMan.setText("Records is empty");
            }
        }
    }//GEN-LAST:event_manSaveActionPerformed

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
    private javax.swing.JButton AddVio;
    private javax.swing.JPanel AddVioPanel;
    private javax.swing.JButton AddViolation;
    private javax.swing.JPanel CoorMain;
    private javax.swing.JTextField CoorRemarks;
    private datechooser.beans.DateChooserPanel DatePanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JTextArea SComments;
    private javax.swing.JLabel SName;
    private javax.swing.JButton SaveVio;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JButton ViewInfo;
    private javax.swing.JComboBox Violation;
    private javax.swing.JLabel bgScan;
    private javax.swing.JLabel bgVio;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JLabel errorResponse;
    private javax.swing.JLabel errorResponseMan;
    private javax.swing.JLabel errorResponseReg;
    private javax.swing.JLabel errorResponseV;
    private javax.swing.JLabel generate;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logout;
    private javax.swing.JTextField manAdv;
    private javax.swing.JLabel manBg;
    private javax.swing.JButton manEdit;
    private javax.swing.JTextField manEmail;
    private javax.swing.JTextField manFName;
    private javax.swing.JTextField manGrade;
    private javax.swing.JTextField manLName;
    private javax.swing.JTextField manMidName;
    private javax.swing.JLabel manPhoto;
    private javax.swing.JButton manPicUpl;
    private javax.swing.JTextField manSNumber;
    private javax.swing.JButton manSave;
    private javax.swing.JButton manSearch;
    private javax.swing.JTextField manSec;
    private javax.swing.JTextField manStrand;
    private javax.swing.JButton manage;
    private javax.swing.JPanel managePanel;
    private javax.swing.JLabel minimizeBtn;
    private javax.swing.JTextField regAdv;
    private javax.swing.JLabel regBg;
    private javax.swing.JTextField regEmail;
    private javax.swing.JTextField regFName;
    private javax.swing.JTextField regGrade;
    private javax.swing.JTextField regLName;
    private javax.swing.JTextField regMidName;
    private javax.swing.JLabel regPhoto;
    private javax.swing.JButton regPicUpl;
    private javax.swing.JTextField regSNumber;
    private javax.swing.JButton regSave;
    private javax.swing.JTextField regSec;
    private javax.swing.JTextField regStrand;
    private javax.swing.JPanel regStudent;
    private javax.swing.JButton register;
    private javax.swing.JLabel sEmail;
    private javax.swing.JPanel scanPanel;
    private javax.swing.JButton searchStudent;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel studentName;
    private javax.swing.JTextField studentNumberInp;
    private javax.swing.JLabel studentSection;
    private javax.swing.JLabel studentSectionLbl;
    private javax.swing.JLabel studentTrack;
    private javax.swing.JLabel studentTrackLbl;
    private javax.swing.JTable vioTableData;
    // End of variables declaration//GEN-END:variables

}
