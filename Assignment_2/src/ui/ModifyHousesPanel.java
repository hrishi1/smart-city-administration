/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
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
public class ModifyHousesPanel extends javax.swing.JPanel {

    private JSplitPane splitPane;
    private CityDir cityDir;
    private UserAuthDir userAuthDir;
    private String houseID;
    private String houseNum;
    private String street;
    private String zipCode;

    /**
     * Creates new form ModifyHousesPanel
     */
    public ModifyHousesPanel() {
        initComponents();
    }
    
    public ModifyHousesPanel(CityDir cityDir, UserAuthDir userAuthDir, JSplitPane splitPane) {
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
    
    private void populateHospitalsHousesTable(HospitalDir hospitalDir, HouseDir houseDir) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        
        DefaultTableModel model = (DefaultTableModel) tblHouses.getModel();
        model.setRowCount(0);
        
        for(House c : houseDir.getHouseDir()) {
            
            Object[] row = new Object[11];
            //row[0] = house;
            row[0] = c.getHouseID();
            row[1] = c.getHouseNum();
            row[2] = c.getStreet();
            row[3] = c.getZipCode();

            
            model.addRow(row);
            
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDisplayHouses = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCities = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCommunities = new javax.swing.JTable();
        btnDeleteHouses = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHouses = new javax.swing.JTable();
        btnDislayCom = new javax.swing.JButton();
        btnModifyPanel = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtHouseNum = new javax.swing.JTextField();
        btnCreateHouse = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtHouseID = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));

        btnDisplayHouses.setText("Display Houses");
        btnDisplayHouses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayHousesActionPerformed(evt);
            }
        });

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

        btnDeleteHouses.setText("Delete Houses");
        btnDeleteHouses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteHousesActionPerformed(evt);
            }
        });

        tblHouses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "House ID", "House Number", "Street", "Zip Code"
            }
        ));
        jScrollPane1.setViewportView(tblHouses);

        btnDislayCom.setText("Display Communities");
        btnDislayCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDislayComActionPerformed(evt);
            }
        });

        btnModifyPanel.setText("Back to Modify Panel");
        btnModifyPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyPanelActionPerformed(evt);
            }
        });

        jLabel9.setText("House Number:");

        btnCreateHouse.setText("Update House");
        btnCreateHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateHouseActionPerformed(evt);
            }
        });

        jLabel12.setText("House ID:");

        jLabel14.setText("Zip code:");

        jLabel13.setText("Street:");

        jLabel15.setBackground(new java.awt.Color(0, 153, 102));
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel15.setText("                                System Admin: Modify Houses");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(436, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCreateHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(478, 478, 478))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel9))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHouseNum, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtHouseID)
                                .addComponent(txtStreet)
                                .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(436, 436, 436))))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
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
                        .addComponent(btnDisplayHouses)
                        .addGap(71, 71, 71)
                        .addComponent(btnDeleteHouses, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnModifyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(42, 42, 42)
                .addComponent(btnModifyPanel)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDislayCom)
                    .addComponent(btnDisplayHouses)
                    .addComponent(btnDeleteHouses))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtHouseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtHouseNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnCreateHouse)
                .addContainerGap(118, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDisplayHousesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayHousesActionPerformed
        // TODO add your handling code here:
        int selectedRowIndexCity = tblCities.getSelectedRow();

        if (selectedRowIndexCity < 0 ) {

            JOptionPane.showMessageDialog(this, "Please select a city.");
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
                        if(com.getHouseDir() != null) {
                            populateHospitalsHousesTable(com.getHospitalDir(),com.getHouseDir());
                        }
                        else {
                            populateHospitalsHousesTable(new HospitalDir(), new HouseDir());
                        }
                    }                    
                }
            }
        }
    }//GEN-LAST:event_btnDisplayHousesActionPerformed

    private void btnDeleteHousesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteHousesActionPerformed
        // TODO add your handling code here:

        int selectedRowIndexCity = tblCities.getSelectedRow();
        int flag =0 ;
        
        if (selectedRowIndexCity < 0 ) {

            JOptionPane.showMessageDialog(this, "Please select a city.");
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

                        selectedRowIndexCity = tblHouses.getSelectedRow();

                        if (selectedRowIndexCity < 0 ) {

                            JOptionPane.showMessageDialog(this, "Please select a house.");
                            return;
                        }

                        model = (DefaultTableModel) tblHouses.getModel();
                        String houseName = (String) model.getValueAt(selectedRowIndex, 0);

                        HouseDir houseDir = com.getHouseDir();                        

                        ArrayList<House> hDir = houseDir.getHouseDir();

                        for(House h : hDir ) {
                            if(h.getHouseID().equalsIgnoreCase(houseName)) {

                                houseDir.deleteHouse(h);

                                populateHospitalsHousesTable(com.getHospitalDir(),com.getHouseDir());
                                
                                JOptionPane.showMessageDialog(this, "House deleted!");
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
    }//GEN-LAST:event_btnDeleteHousesActionPerformed

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
            if(c.getCityName() == (cityName)) {
                if(c.getCommunityDir() != null) {
                    populateCommunitiesTable(c.getCommunityDir());
                }
                else {
                    populateCommunitiesTable(new CommunityDir());
                }
            }         
        }
    }//GEN-LAST:event_btnDislayComActionPerformed

    private void btnCreateHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateHouseActionPerformed
        // TODO add your handling code here:

        try {
        houseNum = txtHouseNum.getText();
        houseID = txtHouseID.getText();
        street = txtStreet.getText();
        zipCode = txtZip.getText();
        System.out.println(Long.parseLong(houseNum)+Long.parseLong(houseID)+Long.parseLong(zipCode));
        }
        catch(Exception e) {
        JOptionPane.showMessageDialog(this,"Number, ID and zip code should be numeric.");
        return;
    }
        
        if(!street.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Name should have only alphabets.");
            return;
        }       
        
        if(street.length() == 0) {
            JOptionPane.showMessageDialog(this, "All fields are mandatory.");
            return;
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
        
        selectedRowIndex = tblHouses.getSelectedRow();

        if (selectedRowIndex < 0 ) {

            JOptionPane.showMessageDialog(this, "Please select a house.");
            return;
        }

        model = (DefaultTableModel) tblHouses.getModel();
        String selectedHouse = (String) model.getValueAt(selectedRowIndex, 0);

        //Traversing city dir to get the right city object
        ArrayList<City> cDir = cityDir.getCityDir();

        for(City c: cDir) {
            if(c.getCityName() == (selectedCity)) {
                CommunityDir communityDir = c.getCommunityDir();

                //Traversing communities to find the selected community
                ArrayList<Community> comDir = communityDir.getCommunityDir();

                for(Community com: comDir) {
                    if(com.getCommunityName().equalsIgnoreCase(selectedCommunity)) {

                        if(com.getHouseDir() != null) {

                            HouseDir houseDir = com.getHouseDir();
                            ArrayList<House> hDir = houseDir.getHouseDir();
                            
                            for(House h : hDir) {
                                
                                if(h.getHouseID().equalsIgnoreCase(selectedHouse)) {
                                    
                                    h.setHouseID(houseID);
                                    h.setHouseNum(houseNum);
                                    h.setStreet(street);
                                    h.setZipCode(zipCode);
                                
//                                    House house = new House();
//
//                                    house.setHouseID(houseID);
//                                    house.setHouseNum(houseNum);
//                                    house.setStreet(street);
//                                    house.setZipCode(zipCode);
//                                    
//                                    houseDir.updateHouse(h, house);
                                    
                                    populateHospitalsHousesTable(com.getHospitalDir(),houseDir);
                                }
                                
                                JOptionPane.showMessageDialog(this, "House updated!");
                            }
                        }
//                        //Test
//                        HouseDir houseDir = com.getHouseDir();
//                        ArrayList<House> p_temp = houseDir.getHouseDir();
//
//                        for(House p : p_temp) {
//                            System.out.println("hospital:"+p.getHouseNum());
//                        }
                    }
                }
            }
        }

    }//GEN-LAST:event_btnCreateHouseActionPerformed

    private void btnModifyPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyPanelActionPerformed
        // TODO add your handling code here:
        
        SysAdminRUDPanel s = new SysAdminRUDPanel(cityDir, userAuthDir, splitPane);//cityDir,uaDir);
                    
        splitPane.setRightComponent(s);
    }//GEN-LAST:event_btnModifyPanelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateHouse;
    private javax.swing.JButton btnDeleteHouses;
    private javax.swing.JButton btnDislayCom;
    private javax.swing.JButton btnDisplayHouses;
    private javax.swing.JButton btnModifyPanel;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblCities;
    private javax.swing.JTable tblCommunities;
    private javax.swing.JTable tblHouses;
    private javax.swing.JTextField txtHouseID;
    private javax.swing.JTextField txtHouseNum;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}
