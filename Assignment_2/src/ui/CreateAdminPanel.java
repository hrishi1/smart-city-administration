/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.ButtonGroup;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        radioComAd = new javax.swing.JRadioButton();
        radioHosAd = new javax.swing.JRadioButton();
        btnCreate = new javax.swing.JButton();
        btnBackToSysAdmin = new javax.swing.JButton();

        jLabel1.setText("Create Admins");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBackToSysAdmin)
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUname, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(txtPassword)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioComAd)
                                .addGap(30, 30, 30)
                                .addComponent(radioHosAd)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 295, Short.MAX_VALUE)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(655, 655, 655))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnBackToSysAdmin))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioComAd)
                    .addComponent(radioHosAd))
                .addGap(50, 50, 50)
                .addComponent(btnCreate)
                .addContainerGap(371, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnameActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
        uname = txtUname.getText();
        password = txtPassword.getText();
        
        if(radioComAd.isSelected() == true) {
            userType = "Community Admin";
        }
        else if(radioHosAd.isSelected() == true) {
            userType = "Hospital Admin";
        }
        
        UserAuth ua = userAuthDir.addNewUserAuth();
        
        ua.setPassword(password);
        ua.setUserName(uname);
        ua.setUserType(userType);
        
        
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton radioComAd;
    private javax.swing.JRadioButton radioHosAd;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUname;
    // End of variables declaration//GEN-END:variables
}