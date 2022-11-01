/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import model.CityDir;
import model.CommunityDir;
import model.DoctorDir;
import model.HospitalDir;
import model.HouseDir;
import model.UserAuth;
import model.UserAuthDir;

/**
 *
 * @author hrish
 */
public class CreateAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateAdminPanel
     */
    
    JSplitPane splitPane;
    private CityDir cityDir;    
    private CommunityDir communityDir;
    private HospitalDir hospitalDir;
    private HouseDir houseDir;
    private DoctorDir doctorDir;
    private UserAuthDir userAuthDir;
    
    private String uname;
    private String password;
    private String userType;
    
    public CreateAdminPanel() {
        initComponents();
    }
    
    public CreateAdminPanel(CityDir cityDir, UserAuthDir userAuthDir, JSplitPane splitPane) {
        initComponents();
        
        this.splitPane = splitPane;
        this.userAuthDir = userAuthDir;
        this.cityDir = cityDir;
        
        ButtonGroup g1 = new ButtonGroup();
        
        g1.add(radioComAd);
        g1.add(radioHosAd);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtUname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        radioComAd = new javax.swing.JRadioButton();
        radioHosAd = new javax.swing.JRadioButton();
        btnCreate = new javax.swing.JButton();
        btnBackToSysAdmin = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setText("Username:");

        txtUname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnameActionPerformed(evt);
            }
        });

        jLabel3.setText("Password:");

        radioComAd.setText("Community Admin");

        radioHosAd.setText("Hospital Admin");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnBackToSysAdmin.setText("Back to System Admin Panel");
        btnBackToSysAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToSysAdminActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(0, 153, 102));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel12.setText("                                System Admin: Create Admins");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 1128, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBackToSysAdmin)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUname)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioComAd)
                                .addGap(30, 30, 30)
                                .addComponent(radioHosAd)))
                        .addGap(362, 362, 362))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(436, 436, 436))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(43, 43, 43)
                .addComponent(btnBackToSysAdmin)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioComAd)
                    .addComponent(radioHosAd))
                .addGap(36, 36, 36)
                .addComponent(btnCreate)
                .addContainerGap(293, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnameActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
        uname = txtUname.getText();
        password = txtPassword.getText();
        
        if(uname.length() == 0 ||  password.length() == 0) {
            JOptionPane.showMessageDialog(this, "All fields are mandatory.");
            return;
        }
        
        if(radioComAd.isSelected() == true) {
            userType = "Community Admin";
        }
        else if(radioHosAd.isSelected() == true) {
            userType = "Hospital Admin";
        }
        else {
            JOptionPane.showMessageDialog(this, "Please select admin type.");
        }
        
        //Checking for duplicate username
        for(UserAuth ua: userAuthDir.getUserAuthDir()) {
            if(ua.getUserName().equalsIgnoreCase(uname) && ua.getUserType().equalsIgnoreCase(userType)) {
                JOptionPane.showMessageDialog(this, "Username already exists!");
                return;
            }
        }
        
        UserAuth ua = userAuthDir.addNewUserAuth();
        
        ua.setPassword(password);
        ua.setUserName(uname);
        ua.setUserType(userType);
        
        JOptionPane.showMessageDialog(this, "Admin created!");

        
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackToSysAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToSysAdminActionPerformed
        // TODO add your handling code here:
        SySAdminPanel s = new SySAdminPanel(cityDir, userAuthDir, splitPane);//cityDir,uaDir);

        //                    setPanel(s);
        //
        splitPane.setRightComponent(s);
    }//GEN-LAST:event_btnBackToSysAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackToSysAdmin;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton radioComAd;
    private javax.swing.JRadioButton radioHosAd;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUname;
    // End of variables declaration//GEN-END:variables
}
