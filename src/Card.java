
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JViewport;

public class Card extends javax.swing.JFrame {

    CardLayout cardLayout;
    private String placeholder1 = "Student ID";
    private String placeholder2 = "Date and Time";
    private String placeholder3 = "Course & Section";
    private String placeholder4 = "Description";
    
    public Card() {
        
        initComponents();
        setLocationRelativeTo(null);
        split.setDividerLocation(200);
        split.setDividerSize(0);
        properties();
        card();
    }

    public void properties(){
        txtstudentid.setForeground(Color.gray);
        txtstudentid.setText(placeholder1);
        txtdate.setForeground(Color.gray);
        txtdate.setText(placeholder2);
        txtcourse.setForeground(Color.gray);
        txtcourse.setText(placeholder3);
        txtdescription.setForeground(Color.gray);
        txtdescription.setText(placeholder4);
        
    }
    
    public void card(){
        
        cardLayout = (CardLayout)(mainpage.getLayout());
        cardLayout.addLayoutComponent(homepage, "homepage");
        cardLayout.addLayoutComponent(settingspage, "settingspage");
        cardLayout.addLayoutComponent(aboutpage, "aboutpage");
        cardLayout.addLayoutComponent(addpage, "addpage");
        cardLayout.addLayoutComponent(viewpage, "viewpage");
        cardLayout.addLayoutComponent(logpage, "logpage");
        cardLayout.addLayoutComponent(profilepage, "profilepage");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        split = new javax.swing.JSplitPane();
        navpanel = new javax.swing.JPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        logo = new javax.swing.JLabel();
        homebtn = new javax.swing.JButton();
        settingsbtn = new javax.swing.JButton();
        aboutbtn = new javax.swing.JButton();
        graybg = new javax.swing.JLabel();
        mainpage = new javax.swing.JPanel();
        homepage = new javax.swing.JPanel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        welcome = new javax.swing.JLabel();
        addbtn = new javax.swing.JButton();
        historybtn = new javax.swing.JButton();
        viewbtn = new javax.swing.JButton();
        bg = new javax.swing.JLabel();
        settingspage = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        btnlogout = new javax.swing.JButton();
        btnprofile = new javax.swing.JButton();
        settingsbg = new javax.swing.JLabel();
        aboutpage = new javax.swing.JPanel();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        aboutbg = new javax.swing.JLabel();
        addpage = new javax.swing.JPanel();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        addbackbtn = new javax.swing.JButton();
        txtcourse = new javax.swing.JTextField();
        txtstudentid = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        txtdescription = new javax.swing.JTextField();
        cmboffenselist = new javax.swing.JComboBox<>();
        cmboffensetype = new javax.swing.JComboBox<>();
        btnadd = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        adddescription = new javax.swing.JLabel();
        addbg = new javax.swing.JLabel();
        viewpage = new javax.swing.JPanel();
        jLayeredPane6 = new javax.swing.JLayeredPane();
        viewbackbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        viewbg = new javax.swing.JLabel();
        logpage = new javax.swing.JPanel();
        jLayeredPane7 = new javax.swing.JLayeredPane();
        logbackbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        logbg = new javax.swing.JLabel();
        profilepage = new javax.swing.JPanel();
        jLayeredPane8 = new javax.swing.JLayeredPane();
        btnprofileback = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        profilebg = new javax.swing.JLabel();
        whitebg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        split.setDividerLocation(200);
        split.setDividerSize(0);
        split.setPreferredSize(new java.awt.Dimension(1200, 750));

        jLayeredPane2.setPreferredSize(new java.awt.Dimension(200, 750));
        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo.png"))); // NOI18N
        jLayeredPane2.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 120, 120));

        homebtn.setText("Home");
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });
        jLayeredPane2.add(homebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 170, 40));

        settingsbtn.setText("Settings");
        settingsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsbtnActionPerformed(evt);
            }
        });
        jLayeredPane2.add(settingsbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 160, 40));

        aboutbtn.setText("About");
        aboutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutbtnActionPerformed(evt);
            }
        });
        jLayeredPane2.add(aboutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 160, 40));

        graybg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/whitebg.png"))); // NOI18N
        graybg.setPreferredSize(new java.awt.Dimension(200, 750));
        jLayeredPane2.add(graybg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout navpanelLayout = new javax.swing.GroupLayout(navpanel);
        navpanel.setLayout(navpanelLayout);
        navpanelLayout.setHorizontalGroup(
            navpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navpanelLayout.createSequentialGroup()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        navpanelLayout.setVerticalGroup(
            navpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navpanelLayout.createSequentialGroup()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        split.setLeftComponent(navpanel);

        mainpage.setLayout(new java.awt.CardLayout());

        homepage.setMinimumSize(new java.awt.Dimension(1200, 750));

        jLayeredPane3.setPreferredSize(new java.awt.Dimension(1200, 750));
        jLayeredPane3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcome.setFont(new java.awt.Font("Dubai", 1, 36)); // NOI18N
        welcome.setText("Welcome, User");
        jLayeredPane3.add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 280, 50));

        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        jLayeredPane3.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 140, 180));

        historybtn.setText("View");
        historybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historybtnActionPerformed(evt);
            }
        });
        jLayeredPane3.add(historybtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 250, 280));

        viewbtn.setText("Log History");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });
        jLayeredPane3.add(viewbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, 160, 230));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/lightgraybg.png"))); // NOI18N
        bg.setMinimumSize(new java.awt.Dimension(1200, 750));
        bg.setPreferredSize(new java.awt.Dimension(1200, 750));
        jLayeredPane3.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout homepageLayout = new javax.swing.GroupLayout(homepage);
        homepage.setLayout(homepageLayout);
        homepageLayout.setHorizontalGroup(
            homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homepageLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        homepageLayout.setVerticalGroup(
            homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(homepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homepageLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        mainpage.add(homepage, "card3");

        settingspage.setPreferredSize(new java.awt.Dimension(999, 748));

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(999, 748));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlogout.setText("Logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 440, 120));

        btnprofile.setText("View Profile");
        btnprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprofileActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 450, 90));

        settingsbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/lightgraybg.png"))); // NOI18N
        settingsbg.setPreferredSize(new java.awt.Dimension(999, 748));
        jLayeredPane1.add(settingsbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout settingspageLayout = new javax.swing.GroupLayout(settingspage);
        settingspage.setLayout(settingspageLayout);
        settingspageLayout.setHorizontalGroup(
            settingspageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingspageLayout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        settingspageLayout.setVerticalGroup(
            settingspageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingspageLayout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainpage.add(settingspage, "card3");

        aboutpage.setPreferredSize(new java.awt.Dimension(999, 748));

        jLayeredPane4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("About");
        jLayeredPane4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 300, 140));

        aboutbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/lightgraybg.png"))); // NOI18N
        aboutbg.setPreferredSize(new java.awt.Dimension(999, 748));
        jLayeredPane4.add(aboutbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout aboutpageLayout = new javax.swing.GroupLayout(aboutpage);
        aboutpage.setLayout(aboutpageLayout);
        aboutpageLayout.setHorizontalGroup(
            aboutpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutpageLayout.createSequentialGroup()
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        aboutpageLayout.setVerticalGroup(
            aboutpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutpageLayout.createSequentialGroup()
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainpage.add(aboutpage, "card3");

        addpage.setPreferredSize(new java.awt.Dimension(999, 748));

        jLayeredPane5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addbackbtn.setText("Back");
        addbackbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbackbtnActionPerformed(evt);
            }
        });
        jLayeredPane5.add(addbackbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 50));

        txtcourse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcourseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcourseFocusLost(evt);
            }
        });
        jLayeredPane5.add(txtcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 350, 60));

        txtstudentid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtstudentidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtstudentidFocusLost(evt);
            }
        });
        jLayeredPane5.add(txtstudentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 350, 60));

        txtdate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtdateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdateFocusLost(evt);
            }
        });
        jLayeredPane5.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 350, 60));

        txtdescription.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtdescriptionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdescriptionFocusLost(evt);
            }
        });
        jLayeredPane5.add(txtdescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 350, 90));

        cmboffenselist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "List Of Offense", " ", " " }));
        jLayeredPane5.add(cmboffenselist, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 330, 60));

        cmboffensetype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Type of Offense", "Minor Offense", "Major Offense", " " }));
        jLayeredPane5.add(cmboffensetype, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 330, 60));

        btnadd.setText("Add");
        jLayeredPane5.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, 140, 40));

        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jLayeredPane5.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 140, 40));

        adddescription.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        adddescription.setForeground(new java.awt.Color(0, 0, 0));
        adddescription.setText("Add Violations");
        jLayeredPane5.add(adddescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 420, 70));

        addbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/lightgraybg.png"))); // NOI18N
        addbg.setPreferredSize(new java.awt.Dimension(999, 748));
        jLayeredPane5.add(addbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout addpageLayout = new javax.swing.GroupLayout(addpage);
        addpage.setLayout(addpageLayout);
        addpageLayout.setHorizontalGroup(
            addpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addpageLayout.createSequentialGroup()
                .addComponent(jLayeredPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        addpageLayout.setVerticalGroup(
            addpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addpageLayout.createSequentialGroup()
                .addComponent(jLayeredPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainpage.add(addpage, "card3");

        viewpage.setPreferredSize(new java.awt.Dimension(999, 748));

        jLayeredPane6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewbackbtn.setText("BAck");
        viewbackbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbackbtnActionPerformed(evt);
            }
        });
        jLayeredPane6.add(viewbackbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 330, 70));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("View");
        jLayeredPane6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 300, 140));

        viewbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/lightgraybg.png"))); // NOI18N
        viewbg.setPreferredSize(new java.awt.Dimension(999, 748));
        jLayeredPane6.add(viewbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout viewpageLayout = new javax.swing.GroupLayout(viewpage);
        viewpage.setLayout(viewpageLayout);
        viewpageLayout.setHorizontalGroup(
            viewpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewpageLayout.createSequentialGroup()
                .addComponent(jLayeredPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        viewpageLayout.setVerticalGroup(
            viewpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewpageLayout.createSequentialGroup()
                .addComponent(jLayeredPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainpage.add(viewpage, "card3");

        logpage.setPreferredSize(new java.awt.Dimension(999, 748));

        jLayeredPane7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logbackbtn.setText("Back");
        logbackbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logbackbtnActionPerformed(evt);
            }
        });
        jLayeredPane7.add(logbackbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 340, 70));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Log History");
        jLayeredPane7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 300, 140));

        logbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/lightgraybg.png"))); // NOI18N
        logbg.setPreferredSize(new java.awt.Dimension(999, 748));
        jLayeredPane7.add(logbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout logpageLayout = new javax.swing.GroupLayout(logpage);
        logpage.setLayout(logpageLayout);
        logpageLayout.setHorizontalGroup(
            logpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logpageLayout.createSequentialGroup()
                .addComponent(jLayeredPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        logpageLayout.setVerticalGroup(
            logpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logpageLayout.createSequentialGroup()
                .addComponent(jLayeredPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainpage.add(logpage, "card3");

        profilepage.setPreferredSize(new java.awt.Dimension(999, 748));

        jLayeredPane8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnprofileback.setText("Back");
        btnprofileback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprofilebackActionPerformed(evt);
            }
        });
        jLayeredPane8.add(btnprofileback, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 220, 60));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Profile");
        jLayeredPane8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 300, 140));

        profilebg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/lightgraybg.png"))); // NOI18N
        profilebg.setPreferredSize(new java.awt.Dimension(999, 748));
        jLayeredPane8.add(profilebg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout profilepageLayout = new javax.swing.GroupLayout(profilepage);
        profilepage.setLayout(profilepageLayout);
        profilepageLayout.setHorizontalGroup(
            profilepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilepageLayout.createSequentialGroup()
                .addComponent(jLayeredPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        profilepageLayout.setVerticalGroup(
            profilepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilepageLayout.createSequentialGroup()
                .addComponent(jLayeredPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainpage.add(profilepage, "card3");

        split.setRightComponent(mainpage);

        getContentPane().add(split, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        whitebg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/whitebg.png"))); // NOI18N
        getContentPane().add(whitebg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void settingsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsbtnActionPerformed
        cardLayout.show(mainpage, "settingspage");
    }//GEN-LAST:event_settingsbtnActionPerformed

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        cardLayout.show(mainpage, "homepage");
    }//GEN-LAST:event_homebtnActionPerformed

    private void aboutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutbtnActionPerformed
        cardLayout.show(mainpage, "aboutpage");
    }//GEN-LAST:event_aboutbtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        cardLayout.show(mainpage, "addpage");
    }//GEN-LAST:event_addbtnActionPerformed

    private void historybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historybtnActionPerformed
        cardLayout.show(mainpage, "viewpage");
    }//GEN-LAST:event_historybtnActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
        cardLayout.show(mainpage, "logpage");
    }//GEN-LAST:event_viewbtnActionPerformed

    private void addbackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbackbtnActionPerformed
        cardLayout.show(mainpage, "homepage");
    }//GEN-LAST:event_addbackbtnActionPerformed

    private void viewbackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbackbtnActionPerformed
        cardLayout.show(mainpage, "homepage");
    }//GEN-LAST:event_viewbackbtnActionPerformed

    private void logbackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logbackbtnActionPerformed
        cardLayout.show(mainpage, "homepage");
    }//GEN-LAST:event_logbackbtnActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        txtstudentid.setText(placeholder1);
        txtstudentid.setForeground(Color.gray);
        txtdate.setText(placeholder2);
        txtdate.setForeground(Color.gray);
        txtcourse.setText(placeholder3);
        txtcourse.setForeground(Color.gray);
        txtdescription.setText(placeholder4);
        txtdescription.setForeground(Color.gray);
    }//GEN-LAST:event_btncancelActionPerformed

    private void txtstudentidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtstudentidFocusGained
        if(txtstudentid.getText().equals(placeholder1)){
            txtstudentid.setText("");
            txtstudentid.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtstudentidFocusGained

    private void txtstudentidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtstudentidFocusLost
        if(txtstudentid.getText().isEmpty()){
            txtstudentid.setText(placeholder1);
            txtstudentid.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtstudentidFocusLost

    private void txtdateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdateFocusGained
        if(txtdate.getText().equals(placeholder2)){
            txtdate.setText("");
            txtdate.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtdateFocusGained

    private void txtdateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdateFocusLost
        if(txtdate.getText().isEmpty()){
            txtdate.setText(placeholder2);
            txtdate.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtdateFocusLost

    private void txtcourseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcourseFocusGained
        if(txtcourse.getText().equals(placeholder3)){
            txtcourse.setText("");
            txtcourse.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtcourseFocusGained

    private void txtcourseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcourseFocusLost
        if(txtcourse.getText().isEmpty()){
            txtcourse.setText(placeholder3);
            txtcourse.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtcourseFocusLost

    private void txtdescriptionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdescriptionFocusGained
        if(txtdescription.getText().equals(placeholder4)){
            txtdescription.setText("");
            txtdescription.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtdescriptionFocusGained

    private void txtdescriptionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdescriptionFocusLost
        if(txtdescription.getText().isEmpty()){
            txtdescription.setText(placeholder4);
            txtdescription.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtdescriptionFocusLost

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        int result = JOptionPane.showConfirmDialog(null, 
        "Are you sure you want to log out?", 
        "Confirmation", 
        JOptionPane.YES_NO_OPTION);
        
        if(result == JOptionPane.YES_OPTION){
            LoginPage lp = new LoginPage();
            Card c = new Card();
            lp.show();
            c.setVisible(false);
        }
        else {
            JOptionPane.getRootFrame().dispose();
        }
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprofileActionPerformed
        cardLayout.show(mainpage, "profilepage");
    }//GEN-LAST:event_btnprofileActionPerformed

    private void btnprofilebackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprofilebackActionPerformed
       cardLayout.show(mainpage,"settingspage");
    }//GEN-LAST:event_btnprofilebackActionPerformed

    
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
            java.util.logging.Logger.getLogger(Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Card().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutbg;
    private javax.swing.JButton aboutbtn;
    private javax.swing.JPanel aboutpage;
    private javax.swing.JButton addbackbtn;
    private javax.swing.JLabel addbg;
    private javax.swing.JButton addbtn;
    private javax.swing.JLabel adddescription;
    private javax.swing.JPanel addpage;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnprofile;
    private javax.swing.JButton btnprofileback;
    private javax.swing.JComboBox<String> cmboffenselist;
    private javax.swing.JComboBox<String> cmboffensetype;
    private javax.swing.JLabel graybg;
    private javax.swing.JButton historybtn;
    private javax.swing.JButton homebtn;
    private javax.swing.JPanel homepage;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JLayeredPane jLayeredPane7;
    private javax.swing.JLayeredPane jLayeredPane8;
    private javax.swing.JButton logbackbtn;
    private javax.swing.JLabel logbg;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel logpage;
    private javax.swing.JPanel mainpage;
    private javax.swing.JPanel navpanel;
    private javax.swing.JLabel profilebg;
    private javax.swing.JPanel profilepage;
    private javax.swing.JLabel settingsbg;
    private javax.swing.JButton settingsbtn;
    private javax.swing.JPanel settingspage;
    private javax.swing.JSplitPane split;
    private javax.swing.JTextField txtcourse;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtdescription;
    private javax.swing.JTextField txtstudentid;
    private javax.swing.JButton viewbackbtn;
    private javax.swing.JLabel viewbg;
    private javax.swing.JButton viewbtn;
    private javax.swing.JPanel viewpage;
    private javax.swing.JLabel welcome;
    private javax.swing.JLabel whitebg;
    // End of variables declaration//GEN-END:variables
}
