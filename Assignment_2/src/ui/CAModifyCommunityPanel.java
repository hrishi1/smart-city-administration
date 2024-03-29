/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import java.util.regex.Matcher;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.CityDir;
import model.Community;
import model.CommunityDir;
import model.UserAuthDir;
import static ui.SySAdminPanel.VALID_EMAIL_ADDRESS_REGEX;

/**
 *
 * @author hrish
 */
public class CAModifyCommunityPanel extends javax.swing.JPanel {

    private JSplitPane splitPane;
    private CityDir cityDir;
    private UserAuthDir userAuthDir;
    private String communityName;
    private String religion;
    private String communityType;
    private String cityName;
    private String state;
    private String caller;

    /**
     * Creates new form ModifyCommunityPanel
     */
    public CAModifyCommunityPanel() {
        initComponents();
    }
    
    public CAModifyCommunityPanel(CityDir cityDir, UserAuthDir userAuthDir, JSplitPane splitPane, String caller) {
        initComponents();
        
        this.splitPane = splitPane;
        this.cityDir = cityDir;
        this.userAuthDir = userAuthDir;
        this.caller = caller;
        
        ButtonGroup g1 = new ButtonGroup();
        
        g1.add(radioUrban);
        g1.add(radioRural);
        
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
            row[1] = c.getState();
            
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
            row[1] = c.getMajorityReligion();
            row[2] = c.getCommunityType();

            
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

        btnModifyPanel = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCities = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCommunities = new javax.swing.JTable();
        btnDislayCom = new javax.swing.JButton();
        btnDeleteCommunities = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCommunityName = new javax.swing.JTextField();
        txtReligion = new javax.swing.JTextField();
        btnUpdateComm = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        radioUrban = new javax.swing.JRadioButton();
        radioRural = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));

        btnModifyPanel.setText("Back to Modify Panel");
        btnModifyPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyPanelActionPerformed(evt);
            }
        });

        tblCities.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Citiy Name", "State"
            }
        ));
        jScrollPane4.setViewportView(tblCities);

        tblCommunities.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Community Name", "Majority Religion", "Commmunity Type"
            }
        ));
        jScrollPane1.setViewportView(tblCommunities);

        btnDislayCom.setText("Display Communities");
        btnDislayCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDislayComActionPerformed(evt);
            }
        });

        btnDeleteCommunities.setText("Delete Community");
        btnDeleteCommunities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCommunitiesActionPerformed(evt);
            }
        });

        jLabel3.setText("Community Name:");

        jLabel4.setText("Majority Religion:");

        btnUpdateComm.setText("Update Community");
        btnUpdateComm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCommActionPerformed(evt);
            }
        });

        jLabel5.setText("Community Type:");

        radioUrban.setText("Urban");
        radioUrban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioUrbanActionPerformed(evt);
            }
        });

        radioRural.setText("Rural");

        jLabel15.setBackground(new java.awt.Color(0, 153, 102));
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel15.setText("                                Modify Communities");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btnModifyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(487, 487, 487)
                                .addComponent(btnDislayCom)
                                .addGap(54, 54, 54)
                                .addComponent(btnDeleteCommunities, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUpdateComm, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtReligion, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioUrban)
                                .addGap(18, 18, 18)
                                .addComponent(radioRural)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(28, 28, 28)
                .addComponent(btnModifyPanel)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDislayCom)
                    .addComponent(btnDeleteCommunities))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtReligion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(radioUrban)
                    .addComponent(radioRural))
                .addGap(22, 22, 22)
                .addComponent(btnUpdateComm)
                .addContainerGap(143, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyPanelActionPerformed
        // TODO add your handling code here:
        
        if(caller == "SysAdmin") {
        
            SysAdminRUDPanel s = new SysAdminRUDPanel(cityDir, userAuthDir, splitPane);//cityDir,uaDir);

            splitPane.setRightComponent(s);
        }
        else if(caller == "CommAdmin") {
            
            CAModifyHousesPanel s = new CAModifyHousesPanel(cityDir, userAuthDir, splitPane);//cityDir,uaDir);
                                        
            splitPane.setRightComponent(s);
        }
        
    }//GEN-LAST:event_btnModifyPanelActionPerformed

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

    private void btnDeleteCommunitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCommunitiesActionPerformed
        // TODO add your handling code here:

        int flag = 0;
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
                        
                        
                        communityDir.deleteCommunity(com);
                        populateCommunitiesTable(communityDir);
                        
                        JOptionPane.showMessageDialog(this, "Community deleted!");
                        flag = 1;
                        break;
                    }
                }
            }
            if(flag == 1)
                                                    break;
        }
    }//GEN-LAST:event_btnDeleteCommunitiesActionPerformed

    private void btnUpdateCommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCommActionPerformed
        // TODO add your handling code here:

        communityName = txtCommunityName.getText();
        religion = txtReligion.getText();
        
        if(!communityName.matches("[a-zA-Z]+") || !religion.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Name should have only alphabets.");
            return;
        }
        

        
        if(communityName.length() == 0 ||  religion.length() == 0) {
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

        
        //Radio buttons

        if(radioUrban.isSelected() == true) {
            communityType = "Urban Community";
        }
        else if(radioRural.isSelected() == true){
            communityType = "Rural Community";
        }
        else {
            JOptionPane.showMessageDialog(this, "Please select a community.");
        }

        //Traversing city dir to get the right city object
        ArrayList<City> cDir = cityDir.getCityDir();

        for(City c: cDir) {
            if(c.getCityName().equalsIgnoreCase(selectedCity)) {                               

                if(c.getCommunityDir() != null) {

                    CommunityDir comDir = c.getCommunityDir();
                    
                    ArrayList<Community> cDir2 = comDir.getCommunityDir();
                    
                    for(Community com : cDir2) {                                                
                                
                        if(com.getCommunityName().equalsIgnoreCase(selectedCommunity)) {                           
                            
                            com.setCommunityName(communityName);
                            com.setCommunityType(communityType);
                            com.setMajorityReligion(religion);
                                    
//                            Community updated_com = new Community();
//                            
//                            updated_com.setCommunityName(communityName);
//                            updated_com.setCommunityType(communityType);
//                            updated_com.setMajorityReligion(religion);
//
//                            comDir.updateCommunity(com, updated_com);
                            
                            populateCommunitiesTable(comDir);  
                            
                            JOptionPane.showMessageDialog(this, "Community updated!");
                        }                        
                    }   
                }
            }
        }

    }//GEN-LAST:event_btnUpdateCommActionPerformed

    private void radioUrbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioUrbanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioUrbanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteCommunities;
    private javax.swing.JButton btnDislayCom;
    private javax.swing.JButton btnModifyPanel;
    private javax.swing.JButton btnUpdateComm;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JRadioButton radioRural;
    private javax.swing.JRadioButton radioUrban;
    private javax.swing.JTable tblCities;
    private javax.swing.JTable tblCommunities;
    private javax.swing.JTextField txtCommunityName;
    private javax.swing.JTextField txtReligion;
    // End of variables declaration//GEN-END:variables
}
