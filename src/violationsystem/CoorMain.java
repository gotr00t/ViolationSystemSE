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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author _
 */
public class CoorMain extends javax.swing.JFrame {

    int mousepX;
    int mousepY;
    Connection conn = DBConnector.ConnectDB();
    String getID;
    
    
    public CoorMain() {

        initComponents();

    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EmpID = new javax.swing.JLabel();
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

        EmpID.setEnabled(false);
        EmpID.setFocusable(false);
        EmpID.setInheritsPopupMenu(false);
        EmpID.setRequestFocusEnabled(false);
        EmpID.setVerifyInputWhenFocusTarget(false);

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
        sidebar.setMinimumSize(new java.awt.Dimension(300, 860));
        sidebar.setPreferredSize(new java.awt.Dimension(300, 860));

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
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manage, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(sidebarLayout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(logo))
                        .addGroup(sidebarLayout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(searchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
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
                .addComponent(searchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manage, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout)
                    .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(330, Short.MAX_VALUE))
        );

        SplitPane.setLeftComponent(sidebar);

        MainPanel.setLayout(new java.awt.CardLayout());

        scanPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icon.png"))); // NOI18N
        icon.setText("jLabel5");
        scanPanel.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 170, 170));

        studentName.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        studentName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        studentName.setText("Enter your Student ID:");
        studentName.setBorder(null);
        studentName.setFocusable(false);
        studentName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        studentName.setRequestFocusEnabled(false);
        studentName.setVerifyInputWhenFocusTarget(false);
        scanPanel.add(studentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 520, 40));

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
        scanPanel.add(errorResponse, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 340, 20));

        studentNumberInp.setForeground(new java.awt.Color(102, 102, 102));
        studentNumberInp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        studentNumberInp.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Number", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(1, 1, 1))); // NOI18N
        studentNumberInp.setSelectedTextColor(new java.awt.Color(1, 1, 1));
        studentNumberInp.setSelectionColor(new java.awt.Color(255, 255, 255));
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

        MainPanel.add(scanPanel, "CardScan");

        AddVioPanel.setMinimumSize(new java.awt.Dimension(1120, 740));
        AddVioPanel.setPreferredSize(new java.awt.Dimension(1120, 740));
        AddVioPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/icon.png"))); // NOI18N
        icon1.setText("jLabel5");
        AddVioPanel.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 170, 170));

        Violation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Item 1", "Item 2", "Item 3" }));
        Violation.setBorder(null);
        Violation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViolationActionPerformed(evt);
            }
        });
        AddVioPanel.add(Violation, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 250, -1));

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
    AddVioPanel.add(DatePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 230, 160));

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
    AddVioPanel.add(errorResponseV, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 250, 30));

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

    MainPanel.add(AddVioPanel, "cardVio");

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
        String StudentNumber = studentNumberInp.getText();
        String SQLFind = "SELECT * FROM STUDENTINFO WHERE STUDENTID=?";

        if (conn != null) {
            if (!StudentNumber.trim().isEmpty()) {
                try {
                    PreparedStatement stmt = conn.prepareStatement(SQLFind);
                    stmt.setString(1, StudentNumber);
                    ResultSet records = stmt.executeQuery();
                    if (!records.next()) {
                        errorResponse.setText("Student not found");
                        //prompt of a student registration on the system
                        records.close();
                    } else {
                        String SFName = records.getString("SFIRSTNAME");
                        String SMName = records.getString("SMIDDLENAME");
                        String SLName = records.getString("SLASTNAME");
                        String SYear = records.getString("SYEAR");
                        String SSec = records.getString("SSEC");
                        String STrack = records.getString("STRACK");
                        studentName.setText(SFName + " " + SMName + " " + SLName);
                        studentSection.setText(SYear + " " + "Year" + " " + "-" + " " + SSec);
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

        if (!studentNumberInp.getText().trim().isEmpty()) {
            scanPanel.setVisible(false);
            AddVioPanel.setVisible(true);
        } else {
            errorResponse.setText("Please Enter a Student Number");
        }
    }//GEN-LAST:event_AddVioActionPerformed

    private void minimizeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtnMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeBtnMouseClicked

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        System.exit(0);

    }//GEN-LAST:event_closeBtnMouseClicked

    private void searchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStudentActionPerformed
        AddVioPanel.setVisible(false);
        scanPanel.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_searchStudentActionPerformed

    private void SaveVioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveVioActionPerformed
        Calendar datePnlSel = Calendar.getInstance();
        Date dateUtil = datePnlSel.getTime();
        SimpleDateFormat Format = new SimpleDateFormat("MM-dd-yyyy");
        String VioDate = Format.format(dateUtil);
        String VioComments = SComments.getText();
        String VioRemarks = CoorRemarks.getText();
        String StudentNumber = studentNumberInp.getText();
        
        
        
    }//GEN-LAST:event_SaveVioActionPerformed

    private void SCommentsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SCommentsKeyReleased
        CoorRemarks.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_SCommentsKeyReleased

    private void ViolationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViolationActionPerformed
        if (Violation.getSelectedIndex() > 0) {
            DatePanel.setVisible(true);
            SComments.setEnabled(true);
        } else {
            DatePanel.setVisible(false);
            SComments.setEnabled(false);
        }
    }//GEN-LAST:event_ViolationActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoorMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddVio;
    private javax.swing.JPanel AddVioPanel;
    private javax.swing.JPanel CoorMain;
    private javax.swing.JTextField CoorRemarks;
    private datechooser.beans.DateChooserPanel DatePanel;
    private javax.swing.JLabel EmpID;
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
    private javax.swing.JLabel errorResponseV;
    private javax.swing.JLabel generate;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logout;
    private javax.swing.JButton manage;
    private javax.swing.JLabel minimizeBtn;
    private javax.swing.JButton register;
    private javax.swing.JPanel scanPanel;
    private javax.swing.JButton searchStudent;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel studentName;
    private javax.swing.JTextField studentNumberInp;
    private javax.swing.JLabel studentSection;
    private javax.swing.JLabel studentSectionLbl;
    private javax.swing.JLabel studentTrack;
    private javax.swing.JLabel studentTrackLbl;
    // End of variables declaration//GEN-END:variables

}
