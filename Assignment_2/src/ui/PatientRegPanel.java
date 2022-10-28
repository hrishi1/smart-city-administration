/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import javafx.scene.control.RadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CityDir;
import model.CommunityDir;
import model.HouseDir;
import model.HospitalDir;
import model.PatientDir;
import model.PersonDir;
import model.PersonDir;
import model.UserAuthDir;

import model.House;
import model.Hospital;
import model.Community;
import model.City;
import model.Patient;
import model.Person;
import model.UserAuth;
/**
 *
 * @author hrish
 */
public class PatientRegPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientRegPanel
     */
    
    private CityDir cityDir;    
    private CommunityDir communityDir;
    private HospitalDir hospitalDir;
    private HouseDir houseDir;
    private PatientDir patientDir;
    private UserAuthDir userAuthDir;
    
    private String uName;
    private String fName;
    private String lName;
    private String password;
    private int age;
    private String gender;
    private String phone;
    private String email;
    private String insured;
    private String emergencyContact;
    
    private String cityName;
    
    public PatientRegPanel(CityDir cityDir,CommunityDir communityDir, HospitalDir hospitalDir, HouseDir houseDir, UserAuthDir userAuthDir) {
        initComponents();
        
        ButtonGroup g1 = new ButtonGroup();
        
        g1.add(radioMale);
        g1.add(radioFemale);
        
        ButtonGroup g2 = new ButtonGroup();
        
        g2.add(radioInsuredYes);
        g2.add(radioInsuredNo);
        
        
        
        this.cityDir = cityDir;
        this.communityDir = communityDir;
        this.houseDir = houseDir;
        this.hospitalDir = hospitalDir;
        this.userAuthDir = userAuthDir;
        
        populateCitiesTable();
    }
        
    private void populateCitiesTable() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        // House Table        
        DefaultTableModel model = (DefaultTableModel) tblCities.getModel();
        model.setRowCount(0);
        
        for(City c : cityDir.getCityDir()) {
            
            Object[] row = new Object[11];
            //row[0] = house;
            row[0] = c.getCityName();

            
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
        
    private void populateHospitalsHousesTable(HospitalDir hospitalDir, HouseDir hoseDir) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        DefaultTableModel model = (DefaultTableModel) tblHospitals.getModel();
        model.setRowCount(0);
        
        for(Hospital c : hospitalDir.getHospitalDir()) {
            
            Object[] row = new Object[11];
            //row[0] = house;
            row[0] = c.getHospitalName();

            
            model.addRow(row);
            
        } 
        
        model = (DefaultTableModel) tblHouses.getModel();
        model.setRowCount(0);
        
        for(House c : houseDir.getHouseDir()) {
            
            Object[] row = new Object[11];
            //row[0] = house;
            row[0] = c.getHouseID();

            
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

        jPanel1 = new javax.swing.JPanel();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtUname = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtEmergencyContact = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        radioInsuredYes = new javax.swing.JRadioButton();
        radioInsuredNo = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospitals = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHouses = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCommunities = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCities = new javax.swing.JTable();
        btnCreatePatient = new javax.swing.JButton();
        btnDispCommunities = new javax.swing.JButton();
        btnDispHospitalsHouses = new javax.swing.JButton();

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        radioMale.setText("Male");

        radioFemale.setText("Female");

        jLabel1.setText("First Name:");

        jLabel2.setText("Last Name:");

        jLabel3.setText("User Name:");

        jLabel4.setText("Password:");

        jLabel5.setText("Age:");

        jLabel6.setText("Phone Number:");

        jLabel7.setText("Email ID:");

        jLabel8.setText("Insured?");

        radioInsuredYes.setText("Yes");

        radioInsuredNo.setText("No");
        radioInsuredNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioInsuredNoActionPerformed(evt);
            }
        });

        jLabel9.setText("Emergency Contact:");

        jLabel10.setText("Gender:");

        tblHospitals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Hospital(s)"
            }
        ));
        jScrollPane1.setViewportView(tblHospitals);

        tblHouses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "House(s)"
            }
        ));
        jScrollPane2.setViewportView(tblHouses);

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

        btnCreatePatient.setText("Create Patient");
        btnCreatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePatientActionPerformed(evt);
            }
        });

        btnDispCommunities.setText("Display Communities");
        btnDispCommunities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDispCommunitiesActionPerformed(evt);
            }
        });

        btnDispHospitalsHouses.setText("Display Hospitals and Houses");
        btnDispHospitalsHouses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDispHospitalsHousesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtFname)
                        .addComponent(txtLname)
                        .addComponent(txtUname)
                        .addComponent(txtPass)
                        .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtEmergencyContact, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(radioMale)
                        .addGap(18, 18, 18)
                        .addComponent(radioFemale))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(radioInsuredYes)
                        .addGap(18, 18, 18)
                        .addComponent(radioInsuredNo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(94, 94, 94))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCreatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(349, 349, 349))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDispCommunities)
                        .addGap(181, 181, 181)
                        .addComponent(btnDispHospitalsHouses)
                        .addGap(153, 153, 153))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(29, 29, 29)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(radioInsuredYes)
                            .addComponent(radioInsuredNo))
                        .addGap(28, 28, 28)
                        .addComponent(txtEmergencyContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioMale)
                    .addComponent(radioFemale)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDispCommunities)
                    .addComponent(btnDispHospitalsHouses))
                .addGap(44, 44, 44)
                .addComponent(btnCreatePatient)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void radioInsuredNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioInsuredNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioInsuredNoActionPerformed

            
    private void btnCreatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePatientActionPerformed
        
        //Getting all the data from user input
        fName = txtFname.getText();
        lName = txtLname.getText();
        uName = txtUname.getText();
        password = txtPass.getText();
        age = Integer.parseInt(txtAge.getText());
        phone = txtPhone.getText();
        email = txtEmail.getText();
        emergencyContact = txtEmergencyContact.getText();
        
        
        int selectedRowIndex = tblHouses.getSelectedRow();

        if (selectedRowIndex < 0 ) {

            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }
        
        DefaultTableModel model;
        model = (DefaultTableModel) tblHouses.getModel();
        String selectedHouse = (String) model.getValueAt(selectedRowIndex, 0);
        
        
        selectedRowIndex = tblCities.getSelectedRow();

        if (selectedRowIndex < 0 ) {

            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }
        
        model = (DefaultTableModel) tblCities.getModel();
        String selectedCity = (String) model.getValueAt(selectedRowIndex, 0);
        
        
        selectedRowIndex = tblCommunities.getSelectedRow();

        if (selectedRowIndex < 0 ) {

            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }
        
        model = (DefaultTableModel) tblCommunities.getModel();
        String selectedCommunity = (String) model.getValueAt(selectedRowIndex, 0);
        
        
        selectedRowIndex = tblHospitals.getSelectedRow();

        if (selectedRowIndex < 0 ) {

            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }
        
        //Radio buttons
        
        if(radioInsuredYes.isSelected() == true) {
            insured = "Yes";
        }
        else {
            insured = "No";
        }
        
        if(radioMale.isSelected() == true) {
            gender = "Male";
        }
        else {
            gender = "Female";
        }
        
        model = (DefaultTableModel) tblHospitals.getModel();
        String selectedHospital = (String) model.getValueAt(selectedRowIndex, 0);
        
        //Creating UserAuth object
        UserAuth ua = userAuthDir.addNewUserAuth();
        
        ua.setUserName(uName);
        ua.setPassword(password);
        ua.setUserType("Patient");
        
        //Test
        //System.out.println("pass:"+ua.getPassword());
        
        
        //Creating Patient Object and adding to hospitalDir 
        
        //Traversing cities to find the selected city
        ArrayList<City> cDir = cityDir.getCityDir();
        
        for(City c: cDir) {
            if(c.getCityName() == selectedCity) {
                CommunityDir communityDir = c.getCommunityDir();
                
                //Traversing communities to find the selected community
                ArrayList<Community> comDir = communityDir.getCommunityDir();
                
                for(Community com: comDir) {
                    if(com.getCommunityName() == selectedCommunity) {
                        
                        
                        HospitalDir hospitalDir = com.getHospitalDir();
                        HouseDir houseDir = com.getHouseDir();
                        
                        //Traversing hospitals to find the selected hospital
                        ArrayList<Hospital> hDir = hospitalDir.getHospitalDir();
                        
                        for(Hospital h: hDir) {
                            if(h.getHospitalName() == selectedHospital)
                            {                
                                //If patientDir already present in the selected Hospital
                                if(h.getPatientDir() != null) {
                                    patientDir = h.getPatientDir();

                                    Patient patient = patientDir.addNewPatient(); 
                                    patient.setEmergencyContact(emergencyContact);
                                    patient.setInsured(insured); //****** Take input from radio here
                                }
                                else { //If patientDir not already created
                                    patientDir = new PatientDir();

                                    Patient patient = patientDir.addNewPatient(); 
                                    patient.setEmergencyContact(emergencyContact);
                                    patient.setInsured(insured);

                                    h.setPatientDir(patientDir);
                                }  

//                                //Test
//                                patientDir = h.getPatientDir();
//                                ArrayList<Patient> p_temp = patientDir.getPatientDir();
//
//                                for(Patient p : p_temp) {
//                                    System.out.println("patient:"+p.getEmergencyContact());
//                                }
                            }
                        }
                        
                        
                        
                        //Traversing houses to find the selected house
                        ArrayList<House> hoDir = houseDir.getHouseDir();
                        
                        for(House h: hoDir) {
                            if(h.getHouseID() == selectedHouse)
                            {                
                                //If personDir already present in the selected House
                                if(h.getPersonDir() != null) {
                                    PersonDir personDir = h.getPersonDir();

                                    Person person = personDir.addNewPerson();
                                    person.setAge(age);
                                    person.setEmail(email);
                                    person.setFname(fName);
                                    person.setGender(gender);
                                    person.setLname(lName);
                                    person.setPhoneNumber(phone);
                                }
                                else { //If personDir not already created
                                    PersonDir personDir = new PersonDir();

                                    Person person = personDir.addNewPerson();
                                    person.setAge(age);
                                    person.setEmail(email);
                                    person.setFname(fName);
                                    person.setGender(gender);
                                    person.setLname(lName);
                                    person.setPhoneNumber(phone);

                                    h.setPersonDir(personDir);
                                }  

                                //Test
//                                PersonDir personDir = h.getPersonDir();
//                                ArrayList<Person> p_temp = personDir.getPersonDir();
//
//                                for(Person p : p_temp) {
//                                    System.out.println("patient:"+p.getFname());
//                                }
                            }
                        }
                        
                    }
                    
                }
            }
        }
    }//GEN-LAST:event_btnCreatePatientActionPerformed

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
                populateCommunitiesTable(c.getCommunityDir());
            }            
        }
        
        
    }//GEN-LAST:event_btnDispCommunitiesActionPerformed

    private void btnDispHospitalsHousesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDispHospitalsHousesActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblCommunities.getSelectedRow();
         
        if (selectedRowIndex < 0 ) {

            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }
        
        DefaultTableModel model;        
        model = (DefaultTableModel) tblCommunities.getModel();        
        String communityName = (String) model.getValueAt(selectedRowIndex, 0);        
        
        ArrayList<Community> cDir = communityDir.getCommunityDir();
        
        for(Community c: cDir) {            
            if(c.getCommunityName().contains(communityName)) {      
                populateHospitalsHousesTable(c.getHospitalDir(),c.getHouseDir());
            }            
        }
        
    }//GEN-LAST:event_btnDispHospitalsHousesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreatePatient;
    private javax.swing.JButton btnDispCommunities;
    private javax.swing.JButton btnDispHospitalsHouses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioInsuredNo;
    private javax.swing.JRadioButton radioInsuredYes;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTable tblCities;
    private javax.swing.JTable tblCommunities;
    private javax.swing.JTable tblHospitals;
    private javax.swing.JTable tblHouses;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmergencyContact;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUname;
    // End of variables declaration//GEN-END:variables
}
