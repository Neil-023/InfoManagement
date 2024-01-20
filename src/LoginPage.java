
import java.awt.Color;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class LoginPage extends javax.swing.JFrame {
    
    private String placeholder = "Enter your password here";
    private String placeholder2 = "Enter your username here";

 
    public LoginPage() {
        initComponents();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        properties();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        txtpassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnlogin = new javax.swing.JButton();
        btnforgot = new javax.swing.JButton();
        txtusername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bluegradientbg = new javax.swing.JLabel();
        whitebg = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1200, 750));
        setResizable(false);

        jLayeredPane1.setMinimumSize(new java.awt.Dimension(1200, 750));
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(1200, 750));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtpassword.setText("jPasswordField1");
        jLayeredPane1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, 420, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to");
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 140, 70));

        jLabel8.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 204));
        jLabel8.setText("T-CELL");
        jLayeredPane1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 600, 80, -1));

        jLabel9.setFont(new java.awt.Font("Dubai", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 255));
        jLabel9.setText("Group");
        jLayeredPane1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 630, 30, 30));

        jLabel7.setFont(new java.awt.Font("Dubai", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 255));
        jLabel7.setText("Developed by:");
        jLayeredPane1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 580, 70, -1));

        btnlogin.setBackground(new java.awt.Color(51, 0, 255));
        btnlogin.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("Log In");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jLayeredPane1.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 450, 340, 50));

        btnforgot.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        btnforgot.setForeground(new java.awt.Color(51, 0, 204));
        btnforgot.setText("Forgot your password?");
        jLayeredPane1.add(btnforgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 510, -1, -1));
        jLayeredPane1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 420, 50));

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 80)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("E-DRS!");
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 280, -1));

        jLabel5.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Password");
        jLayeredPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Username");
        jLayeredPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dubai Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("<html>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor <br>\nincididunt ut labore et dolore magna aliqua. Lacinia quis vel eros donec ac. Facilisis <br>\n sed odio morbi quis commodo odio aenean. Dolor sit amet consectetur adipiscing  <br>\nelit duis tristique. Id volutpat lacus laoreet non curabitur gravida arcu ac. Lorem ipsum  <br>\ndolor sit amet consectetur adipiscing elit ut aliquam. Lorem ipsum dolor sit amet <br>\nconsectetur adipiscing. Volutpat sed cras ornare arcu dui vivamus arcu. Egestas <br>\ncongue quisque egestas diam in arcu cursus. Augue neque gravida in fermentum <br>\net sollicitudin ac orci. Magnis dis parturient montes nascetur ridiculus. </html>");
        jLayeredPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Let's log you in.");
        jLayeredPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 140, 220, -1));

        bluegradientbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gradientbluebg.png"))); // NOI18N
        bluegradientbg.setText("jLabel2");
        bluegradientbg.setMinimumSize(new java.awt.Dimension(650, 750));
        bluegradientbg.setPreferredSize(new java.awt.Dimension(650, 750));
        jLayeredPane1.add(bluegradientbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        whitebg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/whitebg.png"))); // NOI18N
        whitebg.setToolTipText("");
        whitebg.setMinimumSize(new java.awt.Dimension(1200, 750));
        whitebg.setPreferredSize(new java.awt.Dimension(1200, 750));
        jLayeredPane1.add(whitebg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, -1));

        jButton1.setText("jButton1");
        jLayeredPane1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 490, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        Card c = new Card();
        c.show();
        this.setVisible(false);
    }//GEN-LAST:event_btnloginActionPerformed

  
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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    public void properties(){
        
        Border bottomBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
        txtpassword.setEchoChar((char) 0);
        txtpassword.setForeground(Color.GRAY);
        txtpassword.setText(placeholder);

        txtusername.setText(placeholder2);
        txtusername.setForeground(Color.GRAY);
        
        btnforgot.setOpaque(false);
        btnforgot.setBackground(new Color(0,0,0,0));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bluegradientbg;
    private javax.swing.JButton btnforgot;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    private javax.swing.JLabel whitebg;
    // End of variables declaration//GEN-END:variables
}
