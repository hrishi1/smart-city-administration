/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import model.CityDir;
import model.CommunityDir;
import model.HouseDir;
import model.HospitalDir;
import model.PersonDir;
import model.DoctorDir;
import model.PatientDir;
import model.EncounterHistory;
import model.UserAuthDir;
import model.SystemAdmin;

import model.Hospital;
import model.Community;
import model.City;
import model.Doctor;
import model.House;
import model.Patient;
import model.UserAuth;


/**
 *
 * @author hrish
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    private CityDir cityDir;
    private CommunityDir communityDir;
    private HouseDir houseDir;
    private HospitalDir hospitalDir;
    private PersonDir personDir;
    private DoctorDir doctorDir;
    private PatientDir patientDir;
    private EncounterHistory encounterHistory;
    private UserAuthDir userAuthDir;
    private SystemAdmin systemAdmin;
    private UserAuth userAuth;

            
    public MainJFrame() {
        initComponents();
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);       
        
        cityDir = new CityDir();
        communityDir = new CommunityDir();
        houseDir = new HouseDir();
        hospitalDir = new HospitalDir();
        personDir = new PersonDir();
        doctorDir = new DoctorDir();
        patientDir = new PatientDir();
        encounterHistory = new EncounterHistory();
        userAuthDir = new UserAuthDir();
        systemAdmin = new SystemAdmin("admin","admin");
        
        // Adding System Admin in UserAuth
        userAuth = userAuthDir.addNewUserAuth();
        userAuth.setPassword("admin");
        userAuth.setUserName("admin");
        userAuth.setUserType("System Admin");
        
        //Default Hospital
        Hospital h = hospitalDir.addNewHospital();
        
        h.setHospitalName("Hospital 1");
        h.setHospitalType("Community Hospital");        
        h.setRating(3);
        
        //Default House
        House house = houseDir.addNewHouse();
        
        house.setHouseID("House 1");
        house.setHouseNum("1");
        house.setStreet("Boylston Street");
        house.setZipCode("02120");
        
        // Default Community
        Community c = communityDir.addNewCommunity();
        
        c.setCommunityName("Community 1");
        c.setCommunityType("Urban Community");
        c.setMajorityReligion("Christianity");
        c.setHospitalDir(hospitalDir);
        c.setHouseDir(houseDir);
        
        //Default City
        City city = cityDir.addNewCity();
        
        city.setCityName("Boston");
        city.setState("MA");
        city.setCommunityDir(communityDir);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        workArea = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblDetails = new javax.swing.JLabel();
        lblDetails2 = new javax.swing.JLabel();
        controlPanel = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnPatientRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPane.setPreferredSize(new java.awt.Dimension(2043, 1000));

        workArea.setBackground(new java.awt.Color(255, 255, 255));
        workArea.setMinimumSize(new java.awt.Dimension(200, 200));
        workArea.setPreferredSize(new java.awt.Dimension(1200, 700));

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitle.setText("AED Assignment 2");

        lblDetails.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDetails.setText("Hrishikesh S. Pawar");

        lblDetails2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDetails2.setText("NU ID: 002707307");

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDetails)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDetails2))
                .addContainerGap(703, Short.MAX_VALUE))
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDetails2)
                .addContainerGap(577, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(workArea);

        controlPanel.setBackground(new java.awt.Color(255, 255, 255));
        controlPanel.setMinimumSize(new java.awt.Dimension(200, 200));
        controlPanel.setPreferredSize(new java.awt.Dimension(1018, 700));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnPatientRegister.setText("Patient Register");
        btnPatientRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPatientRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(btnLogin)
                .addGap(61, 61, 61)
                .addComponent(btnPatientRegister)
                .addContainerGap(527, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(controlPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1290, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPatientRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientRegisterActionPerformed
        // TODO add your handling code here:
        PatientRegPanel p = new PatientRegPanel(cityDir, communityDir, hospitalDir , houseDir, userAuthDir);
        splitPane.setRightComponent(p);
    }//GEN-LAST:event_btnPatientRegisterActionPerformed

//    public void setPanel(JPanel panel) {
//        splitPane.setRightComponent(panel);
//    }
        
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
            
        LoginPanel l = new LoginPanel(cityDir,userAuthDir,splitPane);
            splitPane.setRightComponent(l);
            
//            System.out.println(TempPanel.getLayout().getClass());
//            
//            CardLayout card = (CardLayout) TempPanel.getLayout();
//            //splitPane.setRightComponent(TempPanel);
//            card.show(TempPanel, "panelOne");
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainJFrame jFrame = new MainJFrame();
                jFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnPatientRegister;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel lblDetails;
    private javax.swing.JLabel lblDetails2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}
