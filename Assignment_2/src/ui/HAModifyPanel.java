/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.CityDir;
import model.Community;
import model.CommunityDir;
import model.Hospital;
import model.HospitalDir;
import model.House;
import model.HouseDir;
import model.UserAuthDir;

/**
 *
 * @author hrish
 */
public class HAModifyPanel extends javax.swing.JPanel {

    private JSplitPane splitPane;
    private CityDir cityDir;
    private UserAuthDir userAuthDir;
    private String hospitalName;
    private int rating;
    private String hospitalType;
    
    /**
     * Creates new form SysAdminRUDPanel
     */
    public HAModifyPanel() {
        initComponents();
    }
    
    public HAModifyPanel(CityDir cityDir, UserAuthDir userAuthDir, JSplitPane splitPane) {
        initComponents();
        
        this.splitPane = splitPane;
        this.cityDir = cityDir;
        this.userAuthDir = userAuthDir;
        
        populateCitiesTable();
    }
    
    private void populateCitiesTable() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        // House Table        
        DefaultTableModel model = (DefaultTableModel) tblCities.getModel();
        model.setRowCount(0);
        
        if(cityDir.getCityDir() != null) {
        for(City c : cityDir.getCityDir()) {
            
            Object[] row = new Object[11];
            //row[0] = house;
            row[0] = c.getCityName();

            
            model.addRow(row);
        }
        }
    }
    
    private void populateCommunitiesTable(CommunityDir communityDir) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        DefaultTableModel model = (DefaultTableModel) tblCommunities.getModel();
        model.setRowCount(0);
        
        for(Community c : communityDir.getCommunityDir()) {
            
            Object[] row = new Object[11];
            //row[0] = house;
            row[0] = c.getCommunityName();

            
            model.addRow(row);
            
        }                
    }
    
    private void populateHospitalsHousesTable(HospitalDir hospitalDir, HouseDir houseDir) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        DefaultTableModel model = (DefaultTableModel) tblHospitals.getModel();
        model.setRowCount(0);
        
        for(Hospital c : hospitalDir.getHospitalDir()) {
            
            Object[] row = new Object[11];
            //row[0] = house;
            row[0] = c.getHospitalName();
            row[1] = c.getRating();
            row[2] = c.getHospitalType();

            
            model.addRow(row);
            
        } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        tblCities = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCommunities = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospitals = new javax.swing.JTable();
        btnDislayCom = new javax.swing.JButton();
        btnDisplayHosp = new javax.swing.JButton();
        btnDeleteHosp = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JTextField();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        radioCommunity = new javax.swing.JRadioButton();
        radioPrivate = new javax.swing.JRadioButton();
        btnUpdateHospital = new javax.swing.JButton();
        btnModifyDoc = new javax.swing.JButton();
        btnModifyPat = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));

        tblCities.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Cities"
            }
        ));
        jScrollPane4.setViewportView(tblCities);

        tblCommunities.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Communities"
            }
        ));
        jScrollPane3.setViewportView(tblCommunities);

        tblHospitals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Hospital Name", "Rating", "Type"
            }
        ));
        jScrollPane1.setViewportView(tblHospitals);

        btnDislayCom.setText("Display Communities");
        btnDislayCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDislayComActionPerformed(evt);
            }
        });

        btnDisplayHosp.setText("Display Hospitals");
        btnDisplayHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayHospActionPerformed(evt);
            }
        });

        btnDeleteHosp.setText("Delete Hospital");
        btnDeleteHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteHospActionPerformed(evt);
            }
        });

        jLabel6.setText("Hospital Name:");

        jLabel7.setText("Rating:");

        jLabel8.setText("Hospital Type:");

        radio1.setText("1");

        radio2.setText("2");

        radio3.setText("3");

        radioCommunity.setText("Community");
        radioCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCommunityActionPerformed(evt);
            }
        });

        radioPrivate.setText("Private");

        btnUpdateHospital.setText("Update Hospital");
        btnUpdateHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateHospitalActionPerformed(evt);
            }
        });

        btnModifyDoc.setText("Go To Modify Doctors");
        btnModifyDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyDocActionPerformed(evt);
            }
        });

        btnModifyPat.setText("Go To Modify Patients");
        btnModifyPat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyPatActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(0, 153, 102));
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel15.setText("                                       Modify Hospitals");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(btnDislayCom)
                        .addGap(144, 144, 144)
                        .addComponent(btnDisplayHosp)
                        .addGap(71, 71, 71)
                        .addComponent(btnDeleteHosp, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(421, 421, 421)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(298, 298, 298)
                                .addComponent(btnModifyDoc)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radio1)
                                        .addGap(18, 18, 18)
                                        .addComponent(radio2)
                                        .addGap(18, 18, 18)
                                        .addComponent(radio3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioCommunity)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioPrivate))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(btnModifyPat))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdateHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 1172, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDislayCom)
                    .addComponent(btnDisplayHosp)
                    .addComponent(btnDeleteHosp))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio1)
                    .addComponent(radio2)
                    .addComponent(radio3)
                    .addComponent(jLabel7))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(radioCommunity)
                    .addComponent(radioPrivate))
                .addGap(33, 33, 33)
                .addComponent(btnUpdateHospital)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModifyDoc)
                    .addComponent(btnModifyPat))
                .addContainerGap(124, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDislayComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDislayComActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblCities.getSelectedRow();
         
        if (selectedRowIndex < 0 ) {

            JOptionPane.showMessageDialog(this, "Please select a city.");
            return;
        }
        
        DefaultTableModel model;        
        model = (DefaultTableModel) tblCities.getModel();        
        String cityName = (String) model.getValueAt(selectedRowIndex, 0);        
        
        ArrayList<City> cDir = cityDir.getCityDir();
        
        for(City c: cDir) {            
            if(c.getCityName() == (cityName) && c.getCommunityDir() != null) {      
                populateCommunitiesTable(c.getCommunityDir());
            }            
        }
    }//GEN-LAST:event_btnDislayComActionPerformed

    private void btnDisplayHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayHospActionPerformed
        // TODO add your handling code here:
        int selectedRowIndexCity = tblCities.getSelectedRow();

        if (selectedRowIndexCity < 0 ) {

            JOptionPane.showMessageDialog(this, "Please select a row to city.");
            return;
        }

        DefaultTableModel model;
        model = (DefaultTableModel) tblCities.getModel();
        String cityName = (String) model.getValueAt(selectedRowIndexCity, 0);

        ArrayList<City> cDir = cityDir.getCityDir();

        for(City c: cDir) {
            if(c.getCityName() == (cityName)) {
                
                int selectedRowIndex = tblCommunities.getSelectedRow();

                if (selectedRowIndex < 0 ) {

                    JOptionPane.showMessageDialog(this, "Please select a community.");
                    return;
                }

                ///DefaultTableModel model;
                model = (DefaultTableModel) tblCommunities.getModel();
                String communityName = (String) model.getValueAt(selectedRowIndex, 0);
                
                
                CommunityDir communityDir = c.getCommunityDir(); // communityDir.getCommunityDir();
                
                ArrayList<Community> comDir = communityDir.getCommunityDir();
                
                for(Community com: comDir) {
                    if(com.getCommunityName().contains(communityName)) {
                        if(com.getHospitalDir() != null) {
                            populateHospitalsHousesTable(com.getHospitalDir(),com.getHouseDir());
                        }
                        else {
                            populateHospitalsHousesTable(new HospitalDir(), new HouseDir());
                        }
                    }
                }       
            }
        }
    }//GEN-LAST:event_btnDisplayHospActionPerformed

    private void btnDeleteHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteHospActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndexCity = tblCities.getSelectedRow();
        int flag = 0;
        
        if (selectedRowIndexCity < 0 ) {

            JOptionPane.showMessageDialog(this, "Please select a row to city.");
            return;
        }

        DefaultTableModel model;
        model = (DefaultTableModel) tblCities.getModel();
        String cityName = (String) model.getValueAt(selectedRowIndexCity, 0);

        ArrayList<City> cDir = cityDir.getCityDir();

        for(City c: cDir) {
            if(c.getCityName().equalsIgnoreCase(cityName)) {
               
                int selectedRowIndex = tblCommunities.getSelectedRow();

                if (selectedRowIndex < 0 ) {

                    JOptionPane.showMessageDialog(this, "Please select a community.");
                    return;
                }

                ///DefaultTableModel model;
                model = (DefaultTableModel) tblCommunities.getModel();
                String communityName = (String) model.getValueAt(selectedRowIndex, 0);
                
                
                CommunityDir communityDir = c.getCommunityDir(); // communityDir.getCommunityDir();
                
                ArrayList<Community> comDir = communityDir.getCommunityDir();
                
                for(Community com: comDir) {
                    if(com.getCommunityName().equalsIgnoreCase(communityName)) {
                                               
                        
                        selectedRowIndexCity = tblHospitals.getSelectedRow();

                        if (selectedRowIndexCity < 0 ) {

                        JOptionPane.showMessageDialog(this, "Please select a hospital.");
                        return;
                        }
                        
                        model = (DefaultTableModel) tblHospitals.getModel();
                        String hospitalName = (String) model.getValueAt(selectedRowIndex, 0);
                        
                        HospitalDir hospDir = com.getHospitalDir();
                        
                        ArrayList<Hospital> hDir = hospDir.getHospitalDir();
                        
                        for(Hospital h : hDir ) {
                            if(h.getHospitalName().equalsIgnoreCase(hospitalName)) {                                
                                
                                hospDir.deleteHospital(h);
                                
                                populateHospitalsHousesTable(com.getHospitalDir(),com.getHouseDir());
                                JOptionPane.showMessageDialog(this, "Hospital deleted!");
                                flag = 1;
                                break;
                                
                               
                                //Test
//                                ArrayList<Hospital> hDir2 = hospDir.getHospitalDir();
//                                
//                                for(Hospital h2: hDir2) {
//                                    System.out.println(h2.getHospitalName());
//                                }
                            }
                        }
                        
                        
                        
                        
                        
                    }
                    if(flag == 1)
                                                    break;
                }       
                
            }
            if(flag == 1)
                                                    break;
        }        
    }//GEN-LAST:event_btnDeleteHospActionPerformed

    private void radioCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioCommunityActionPerformed

    private void btnUpdateHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateHospitalActionPerformed
        // TODO add your handling code here:
        hospitalName = txtHospitalName.getText();
        
        if(!hospitalName.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Name should have only alphabets.");
            return;
        }
        
        if(hospitalName.length() == 0) {
            JOptionPane.showMessageDialog(this, "All fields are mandatory.");
            return;
        }

        //Radio buttons

        if(radio1.isSelected() == true) {
            rating = 1;
        }
        else if(radio2.isSelected() == true) {
            rating = 2;
        }
        else if(radio3.isSelected() == true){
            rating = 3;
        }
        else {
            JOptionPane.showMessageDialog(this, "Please select a rating.");
        }

        if(radioCommunity.isSelected() == true) {
            hospitalType = "Community Hospital";
        }
        else if(radioPrivate.isSelected() == true){
            hospitalType = "Private Hospital";
        }
        else {
                JOptionPane.showMessageDialog(this, "Please select hospital type.");
        }

        int selectedRowIndex = tblCities.getSelectedRow();

        if (selectedRowIndex < 0 ) {

            JOptionPane.showMessageDialog(this, "Please select a city.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblCities.getModel();
        String selectedCity = (String) model.getValueAt(selectedRowIndex, 0);

        selectedRowIndex = tblCommunities.getSelectedRow();

        if (selectedRowIndex < 0 ) {

            JOptionPane.showMessageDialog(this, "Please select a community.");
            return;
        }

        model = (DefaultTableModel) tblCommunities.getModel();
        String selectedCommunity = (String) model.getValueAt(selectedRowIndex, 0);
        
        
        selectedRowIndex = tblHospitals.getSelectedRow();

        if (selectedRowIndex < 0 ) {

            JOptionPane.showMessageDialog(this, "Please select a community.");
            return;
        }

        model = (DefaultTableModel) tblHospitals.getModel();
        String selectedHospital = (String) model.getValueAt(selectedRowIndex, 0);


        //Traversing city dir to get the right city object
        ArrayList<City> cDir = cityDir.getCityDir();

        for(City c: cDir) {
            if(c.getCityName() == (selectedCity)) {
                CommunityDir communityDir = c.getCommunityDir();

                //Traversing communities to find the selected community
                ArrayList<Community> comDir = communityDir.getCommunityDir();

                for(Community com: comDir) {
                    if(com.getCommunityName().equalsIgnoreCase(selectedCommunity)) {

                        if(com.getHospitalDir() != null) {
                            
                            

                            HospitalDir hospDir = com.getHospitalDir();
                            ArrayList<Hospital> hDir = hospDir.getHospitalDir();

                            
                            for(Hospital h: hDir) {
                                if(h.getHospitalName().equalsIgnoreCase(selectedHospital)) {
                                    
                                    h.setHospitalName(hospitalName);
                                    h.setRating(rating);
                                    h.setHospitalType(hospitalType);

//                                    Hospital updated_hospital = new Hospital();
//
//                                    updated_hospital.setHospitalName(hospitalName);
//                                    updated_hospital.setRating(rating);
//                                    updated_hospital.setHospitalType(hospitalType);
//                                    
//                                    hospDir.updateHospital(h,updated_hospital);
                                    
                                    populateHospitalsHousesTable(hospDir,com.getHouseDir());
                                    
                                    JOptionPane.showMessageDialog(this, "Hospital updated!");
                                    
                                }
                            }
                            
                            
                            
                        }

                        //                                //Test
                        //                                HospitalDir hospDir = com.getHospitalDir();
                        //                                ArrayList<Hospital> p_temp = hospDir.getHospitalDir();
                        //
                        //                                for(Hospital p : p_temp) {
                            //                                    System.out.println("hospital:"+p.getHospitalName());
                            //                               }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnUpdateHospitalActionPerformed

    private void btnModifyDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyDocActionPerformed
        // TODO add your handling code here:
        ModifyDoctorPanel s = new ModifyDoctorPanel(cityDir, userAuthDir, splitPane, "HospAdmin");//cityDir,uaDir);
                    
        splitPane.setRightComponent(s);        
    }//GEN-LAST:event_btnModifyDocActionPerformed

    private void btnModifyPatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyPatActionPerformed
        // TODO add your handling code here:
        ModifyPatientPanel s = new ModifyPatientPanel(cityDir, userAuthDir, splitPane,"HospAdmin");//cityDir,uaDir);
                    
        splitPane.setRightComponent(s);
        
    }//GEN-LAST:event_btnModifyPatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteHosp;
    private javax.swing.JButton btnDislayCom;
    private javax.swing.JButton btnDisplayHosp;
    private javax.swing.JButton btnModifyDoc;
    private javax.swing.JButton btnModifyPat;
    private javax.swing.JButton btnUpdateHospital;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    private javax.swing.JRadioButton radioCommunity;
    private javax.swing.JRadioButton radioPrivate;
    private javax.swing.JTable tblCities;
    private javax.swing.JTable tblCommunities;
    private javax.swing.JTable tblHospitals;
    private javax.swing.JTextField txtHospitalName;
    // End of variables declaration//GEN-END:variables
}
