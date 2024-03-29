/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
import model.Patient;
import model.PatientDir;
import model.Person;
import model.PersonDir;
import model.UserAuthDir;
import static ui.PatientRegPanel.VALID_EMAIL_ADDRESS_REGEX;

/**
 *
 * @author hrish
 */
public class ModifyPerson extends javax.swing.JPanel {

    private JSplitPane splitPane;
    private CityDir cityDir;
    private UserAuthDir userAuthDir;
    private String caller;
    private CommunityDir communityDir;
    
    private String uName;
    private String fName;
    private String lName;
    private int age;
    private String gender;
    private String phone;
    private String email;
    private String name;
    
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    /**
     * Creates new form ModifyPerson
     */
    public ModifyPerson() {
        initComponents();
    }
    
    public ModifyPerson(CityDir cityDir, UserAuthDir userAuthDir, JSplitPane splitPane, String caller) {
        initComponents();
        
        this.splitPane = splitPane;
        this.cityDir = cityDir;
        this.userAuthDir = userAuthDir;
        this.caller = caller;
        
        ButtonGroup g1 = new ButtonGroup();
        
        g1.add(radioMale2);
        g1.add(radioFemale2);
        
        populateCitiesTable();
    }
    
    private void populatePersons(PersonDir patDir) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        DefaultTableModel model = (DefaultTableModel) tblPersons.getModel();
        model.setRowCount(0);
        
        for(Person c : patDir.getPersonDir()) {
            
            Object[] row = new Object[11];
            row[0] = c.getFname();
            row[1] = c.getLname();
            row[2] = c.getAge();
            row[3] = c.getGender();
            row[4] = c.getPhoneNumber();
            row[5] = c.getEmail();
            
            model.addRow(row);            
        } 
    }
    
    private void populateHospitalsHousesTable(HospitalDir hospitalDir, HouseDir houseDir) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
//        DefaultTableModel model = (DefaultTableModel) tblHouses.getModel();
//        model.setRowCount(0);
//        
//        for(Hospital c : hospitalDir.getHospitalDir()) {
//            
//            Object[] row = new Object[11];
//            //row[0] = house;
//            row[0] = c.getHospitalName();
//            row[1] = c.getRating();
//            row[2] = c.getHospitalType();
//
//            
//            model.addRow(row);
            
        DefaultTableModel model = (DefaultTableModel) tblHouses.getModel();
        model.setRowCount(0);
        
        for(House h : houseDir.getHouseDir()) {
            
            Object[]row = new Object[11];
            //row[0] = house;
            row[0] = h.getHouseID();

            
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
            row[1] = c.getMajorityReligion();
            row[2] = c.getCommunityType();

            
            model.addRow(row);
        }                
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHouses = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCommunities = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCities = new javax.swing.JTable();
        btnUpdatePerson = new javax.swing.JButton();
        btnDispCommunities = new javax.swing.JButton();
        btnDispHospitalsHouses = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPersons = new javax.swing.JTable();
        btnDispPersons = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtLname2 = new javax.swing.JTextField();
        txtFname = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtPhone2 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtEmail2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtAge2 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        radioMale2 = new javax.swing.JRadioButton();
        radioFemale2 = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        tblHouses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Houses"
            }
        ));
        jScrollPane1.setViewportView(tblHouses);

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

        btnUpdatePerson.setText("Update Person");
        btnUpdatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePersonActionPerformed(evt);
            }
        });

        btnDispCommunities.setText("Display Communities");
        btnDispCommunities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDispCommunitiesActionPerformed(evt);
            }
        });

        btnDispHospitalsHouses.setText("Display Houses");
        btnDispHospitalsHouses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDispHospitalsHousesActionPerformed(evt);
            }
        });

        tblPersons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Age", "Gender", "Phone", "Email"
            }
        ));
        jScrollPane2.setViewportView(tblPersons);

        btnDispPersons.setText("Display Persons");
        btnDispPersons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDispPersonsActionPerformed(evt);
            }
        });

        btnBack.setText("Back to Modify");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setText("First Name:");

        jLabel24.setText("Last Name:");

        jLabel25.setText("Phone Number:");

        jLabel26.setText("Email ID:");

        jLabel27.setText("Age:");

        txtAge2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAge2ActionPerformed(evt);
            }
        });

        jLabel28.setText("Gender:");

        radioMale2.setText("Male");

        radioFemale2.setText("Female");

        jLabel15.setBackground(new java.awt.Color(0, 153, 102));
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel15.setText("                                Modify Persons");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnDispCommunities)
                                .addGap(88, 88, 88)
                                .addComponent(btnDispHospitalsHouses))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(btnDispPersons))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel24))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLname2)
                                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAge2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(106, 106, 106)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel28))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(radioMale2)
                                .addGap(18, 18, 18)
                                .addComponent(radioFemale2))
                            .addComponent(txtEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(btnUpdatePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(54, 54, 54)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDispPersons)
                            .addComponent(btnDispCommunities)
                            .addComponent(btnDispHospitalsHouses))
                        .addGap(58, 58, 58)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel25)
                                    .addComponent(txtPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26)
                                    .addComponent(txtEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel24))
                        .addGap(4, 4, 4)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(radioMale2)
                            .addComponent(radioFemale2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAge2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))))
                .addGap(33, 33, 33)
                .addComponent(btnUpdatePerson)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        if(caller == "SysAdmin") {
            SysAdminRUDPanel s = new SysAdminRUDPanel(cityDir, userAuthDir, splitPane);//cityDir,uaDir);

        splitPane.setRightComponent(s);
        }
        else if(caller == "HospAdmin") {
            HAModifyPanel s = new HAModifyPanel(cityDir, userAuthDir, splitPane);//cityDir,uaDir);

        splitPane.setRightComponent(s);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDispPersonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDispPersonsActionPerformed
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
            if(c.getCityName().equalsIgnoreCase(cityName)) {

                int selectedRowIndex = tblCommunities.getSelectedRow();

                if (selectedRowIndex < 0 ) {

                    JOptionPane.showMessageDialog(this, "Please select a community.");
                    return;
                }

                ///DefaultTableModel model;
                model = (DefaultTableModel) tblCommunities.getModel();
                String communityName = (String) model.getValueAt(selectedRowIndex, 0);

                selectedRowIndex = tblHouses.getSelectedRow();

                if (selectedRowIndex < 0 ) {

                    JOptionPane.showMessageDialog(this, "Please select a House.");
                    return;
                }

                ///DefaultTableModel model;
                model = (DefaultTableModel) tblHouses.getModel();
                String houseName = (String) model.getValueAt(selectedRowIndex, 0);

                communityDir = c.getCommunityDir(); // communityDir.getCommunityDir();

                ArrayList<Community> comDir = communityDir.getCommunityDir();

                for(Community com: comDir) {
                    if(com.getCommunityName().equalsIgnoreCase(communityName)) {

                        HouseDir houseDir = com.getHouseDir();
                        ArrayList<House> hDir = houseDir.getHouseDir();

                        for(House h: hDir) {
                            if(h.getHouseID().equalsIgnoreCase(houseName)) {

                                if (h.getPersonDir() != null) {
                                    populatePersons(h.getPersonDir());
                                }
                                else {
                                    populatePersons(new PersonDir());
                                }
                            }
                        }

                    }
                }
            }
        }
    }//GEN-LAST:event_btnDispPersonsActionPerformed

    private void btnDispHospitalsHousesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDispHospitalsHousesActionPerformed
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

                communityDir = c.getCommunityDir(); // communityDir.getCommunityDir();

                ArrayList<Community> comDir = communityDir.getCommunityDir();

                for(Community com: comDir) {
                    if(com.getCommunityName().contains(communityName) ) {
                        if(com.getHouseDir() != null) {
                            populateHospitalsHousesTable(com.getHospitalDir(),com.getHouseDir());
                        }
                        else {
                            populateHospitalsHousesTable(new HospitalDir(),new HouseDir());
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnDispHospitalsHousesActionPerformed

    private void btnDispCommunitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDispCommunitiesActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblCities.getSelectedRow();

        if (selectedRowIndex < 0 ) {

            JOptionPane.showMessageDialog(this, "Please select a row to update.");
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
    }//GEN-LAST:event_btnDispCommunitiesActionPerformed

    private void btnUpdatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePersonActionPerformed

        //Getting all the data from user input
        try {
        fName = txtFname.getText();	
	lName = txtLname2.getText();
	age = Integer.parseInt(txtAge2.getText());
	phone = txtPhone2.getText();
	email = txtEmail2.getText();
        System.out.println(Long.parseLong(phone));
        }
        catch(Exception e) {
        JOptionPane.showMessageDialog(this,"Age and Phone Number should be number.");
        return;
    }
        
        if(!fName.matches("[a-zA-Z]+") || !lName.matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Name should have only alphabets.");
            return;
        }
        
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        if(!matcher.find()) {
            JOptionPane.showMessageDialog(this, "Invalid email.");
            return;
        }
        
        if(fName.length() == 0 ||  lName.length() == 0 || uName.length() == 0 || email.length() == 0) {
            JOptionPane.showMessageDialog(this, "All fields are mandatory.");
            return;
        }
        
        if(phone.length() != 10) {
            JOptionPane.showMessageDialog(this,"Phone number should be 10 digit long.");
            return;
        }
        
        //Radio buttons

        if(radioMale2.isSelected() == true) {
            gender = "Male";
        }
        else if(radioFemale2.isSelected() == true){
            gender = "Female";
        }
        else {
            JOptionPane.showMessageDialog(this, "Please select a gender.");
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

            JOptionPane.showMessageDialog(this, "Please select a hospital.");
            return;
        }

        model = (DefaultTableModel) tblHouses.getModel();
        String selectedHouse = (String) model.getValueAt(selectedRowIndex, 0);

        //        selectedRowIndex = tblHouses.getSelectedRow();
        //
        //        if (selectedRowIndex < 0 ) {
            //
            //            JOptionPane.showMessageDialog(this, "Please select a hospital.");
            //            return;
            //        }
        //
        //
        //        model = (DefaultTableModel) tblHouses.getModel();
        //        String selectedHouse = (String) model.getValueAt(selectedRowIndex, 0);
        //

        selectedRowIndex = tblPersons.getSelectedRow();

        if (selectedRowIndex < 0 ) {

            JOptionPane.showMessageDialog(this, "Please select a person.");
            return;
        }

        model = (DefaultTableModel) tblPersons.getModel();
        String personName = (String) model.getValueAt(selectedRowIndex, 0);

        //Traversing cities to find the selected city
        ArrayList<City> cDir = cityDir.getCityDir();

        for(City c: cDir) {
            if(c.getCityName().equalsIgnoreCase(selectedCity)) {
                CommunityDir communityDir = c.getCommunityDir();

                //Traversing communities to find the selected community
                ArrayList<Community> comDir = communityDir.getCommunityDir();

                for(Community com: comDir) {
                    if(com.getCommunityName().equalsIgnoreCase(selectedCommunity)) {

                        HospitalDir hospitalDir = com.getHospitalDir();
                        HouseDir houseDir = com.getHouseDir();
                        
                        //Traversing houses to find the selected house
                                            ArrayList<House> hoDir = houseDir.getHouseDir();

                                            for(House hs: hoDir) {
                                                if(hs.getHouseID().equalsIgnoreCase(selectedHouse))
                                                {

                                                    //If personDir already present in the selected House
                                                    if(hs.getPersonDir() != null) {

                                                        PersonDir personDir = hs.getPersonDir();

                                                        ArrayList<Person> pDir = personDir.getPersonDir();

                                                        for(Person person: pDir) {

                                                            if(person.getFname().equalsIgnoreCase(personName)) {

                                                                //Person person = new Person();

                                                                person.setFname(fName);
                                                                person.setAge(age);
                                                                person.setEmail(email);
                                                                person.setGender(gender);
                                                                person.setLname(lName);
                                                                person.setPhoneNumber(phone);

                                                                //personDir.updatePerson(p, person);
                                                                
                                                                populatePersons(personDir);
                                                                
                                                                JOptionPane.showMessageDialog(this, "Person details updated!");
                                                                break;
                                                            }
                                                        }

                                                    }

                                                    //Test
                                                    //                                                    PersonDir personDir = hs.getPersonDir();
                                                    //                                                    ArrayList<Person> p_temp = personDir.getPersonDir();
                                                    //
                                                    //                                                    for(Person p : p_temp) {
                                                        //                                                        System.out.println("person:"+p.getFname());
                                                        //                                                    }
                                                }
                                            }

                                            break;

                    }

                }
            }
        }
    }//GEN-LAST:event_btnUpdatePersonActionPerformed

    private void txtAge2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAge2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAge2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDispCommunities;
    private javax.swing.JButton btnDispHospitalsHouses;
    private javax.swing.JButton btnDispPersons;
    private javax.swing.JButton btnUpdatePerson;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton radioFemale2;
    private javax.swing.JRadioButton radioMale2;
    private javax.swing.JTable tblCities;
    private javax.swing.JTable tblCommunities;
    private javax.swing.JTable tblHouses;
    private javax.swing.JTable tblPersons;
    private javax.swing.JTextField txtAge2;
    private javax.swing.JTextField txtEmail2;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname2;
    private javax.swing.JTextField txtPhone2;
    // End of variables declaration//GEN-END:variables
}
