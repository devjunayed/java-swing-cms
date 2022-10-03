/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package author;


import dashboard.AdminDashboard;
import admin.AdminLogin;
import homepage.HomePage;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Junayed
 */
public final class AuthorSetPassword extends javax.swing.JFrame {

    /**
     * Creates new form AdminRegister
     */
    
 
    public AuthorSetPassword() {
        initComponents();
        
       
        ImageIcon image = new javax.swing.ImageIcon(getClass().getResource("/images/author_login.png"));
        
        Image img1 = image.getImage();
        Image img2 = img1.getScaledInstance(500, 350, 40);
        ImageIcon image1 = new javax.swing.ImageIcon(img2);
        
         BackgroundImage.setIcon(image1); 
         
         
         
        ImageIcon closeImg = new javax.swing.ImageIcon(getClass().getResource("/images/close.png"));
        Image cli1 = closeImg.getImage();
        Image cli2 = cli1.getScaledInstance(25, 25, 40);
        ImageIcon closeImage = new javax.swing.ImageIcon(cli2);
        
         close.setIcon(closeImage); 
         
         
        ImageIcon backImg = new javax.swing.ImageIcon(getClass().getResource("/images/back.png"));
        Image bki1 = backImg.getImage();
        Image bki2 = bki1.getScaledInstance(25, 25, 0);
        ImageIcon backimg = new javax.swing.ImageIcon(bki2);
        
         back.setIcon(backimg); 
    }
        
        
  
    AuthorRecovery ar = new AuthorRecovery();
    String email= ar.emailAddress;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        HeadingText = new javax.swing.JLabel();
        BackgroundImage = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        back_to_login = new javax.swing.JLabel();
        copyright = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        inputs = new javax.swing.JPanel();
        password_txt = new javax.swing.JLabel();
        confirm_passw_txt = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        confirm_password = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));

        HeadingText.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        HeadingText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeadingText.setText("Hello author, Set your password!");
        HeadingText.setAlignmentY(0.0F);
        HeadingText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BackgroundImage.setBackground(new java.awt.Color(255, 51, 255));
        BackgroundImage.setForeground(new java.awt.Color(51, 255, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        back_to_login.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        back_to_login.setForeground(new java.awt.Color(102, 102, 255));
        back_to_login.setText("Back to login");
        back_to_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_to_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_to_loginMouseClicked(evt);
            }
        });

        copyright.setText("All rights reserved @TeamNewbie 2022 (Sonargaon University)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(copyright)
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(back_to_login)
                        .addGap(266, 266, 266))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(back_to_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(copyright))
        );

        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        back.setAlignmentY(0.0F);
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        inputs.setBackground(new java.awt.Color(255, 255, 255));

        password_txt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        password_txt.setText("Password");

        confirm_passw_txt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        confirm_passw_txt.setText("Confirm Password");

        reset.setBackground(new java.awt.Color(51, 51, 255));
        reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("Reset");
        reset.setActionCommand("submit");
        reset.setBorder(new javax.swing.border.MatteBorder(null));
        reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset.setPreferredSize(new java.awt.Dimension(90, 30));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        confirm_password.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        password.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout inputsLayout = new javax.swing.GroupLayout(inputs);
        inputs.setLayout(inputsLayout);
        inputsLayout.setHorizontalGroup(
            inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputsLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirm_password, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password_txt)
                    .addComponent(confirm_passw_txt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inputsLayout.setVerticalGroup(
            inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(password_txt)
                .addGap(18, 18, 18)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(confirm_passw_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirm_password, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close)
                .addGap(219, 219, 219))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(HeadingText, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(BackgroundImage, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)))
                .addGap(188, 188, 188))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back)
                    .addComponent(close))
                .addGap(23, 23, 23)
                .addComponent(HeadingText, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackgroundImage, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(329, Short.MAX_VALUE))
        );

        close.getAccessibleContext().setAccessibleName("closeBtn");
        back.getAccessibleContext().setAccessibleName("back");

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 870));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        this.dispose();
        HomePage i = new HomePage();
        i.setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void back_to_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_to_loginMouseClicked
        // TODO add your handling code here:
        this.dispose();
        AuthorLogin i = new AuthorLogin();
        i.setVisible(true);
    }//GEN-LAST:event_back_to_loginMouseClicked

    
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        
            String url = "jdbc:mariadb://127.0.0.1:3306/cms";
            String user = "root";
            String passw = "";
            
           
            String newPassword = new String(password.getPassword());
            String confirmPassword = new String( confirm_password.getPassword());
        
        
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, passw);
            
            String updatingDB = "update `cms`.`author` set password=? where email=? ";
           
            
            if("".equals(newPassword)){
                JOptionPane.showMessageDialog(this, "Please enter new password!");
            }else if("".equals(confirmPassword)){
                JOptionPane.showMessageDialog(this, "Please confirm new password!");
            }else{
                  if(newPassword.equals(confirmPassword)){
                       
                    PreparedStatement st = con.prepareStatement(updatingDB);

                    st.setString(1, newPassword);
                    st.setString(2, email);
                    

                    st.executeUpdate(); // record added. 
                    con.close();
                    JOptionPane.showMessageDialog(this, "Password reset successfully");

                    //Closing this window and setting new one
                    this.dispose();
                    AuthorLogin i = new AuthorLogin();
                    i.setVisible(true);
                  }else{
                       JOptionPane.showMessageDialog(this, "Password doesn't matched!");
                  }
            }
        }catch(Exception e){
             JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_resetActionPerformed

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
            java.util.logging.Logger.getLogger(AuthorSetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthorSetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthorSetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthorSetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AuthorSetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JLabel HeadingText;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel back;
    private javax.swing.JLabel back_to_login;
    private javax.swing.JLabel close;
    private javax.swing.JLabel confirm_passw_txt;
    private javax.swing.JPasswordField confirm_password;
    private javax.swing.JLabel copyright;
    private javax.swing.JPanel inputs;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel password_txt;
    public javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
