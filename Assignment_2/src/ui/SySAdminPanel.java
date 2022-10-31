/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.CityDir;
import model.Community;
import model.CommunityDir;
import model.Doctor;
import model.DoctorDir;
import model.Hospital;
import model.HospitalDir;
import model.House;
import model.HouseDir;
import model.PatientDir;
import model.Person;
import model.PersonDir;
import model.UserAuth;
import model.UserAuthDir;

/**
 *
 * @author hrish
 */
public class SySAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form SySAdminPanel
     */
    
    private CityDir cityDir;    
    private CommunityDir communityDir;
    private HospitalDir hospitalDir;
    private HouseDir houseDir;
    private DoctorDir doctorDir;
    private UserAuthDir userAuthDir;
    
    private String uName;
    private String fName;
    private String name;
    private String lName;
    private String password;
    private int age;
    private String gender;
    private String phone;
    private String email;
    private String qualification;
    private String specialization;
    
    JSplitPane splitPane;
    
    private String cityName;
    
    public SySAdminPanel() {
        initComponents();
    }
    
    public SySAdminPanel(CityDir cityDir, UserAuthDir userAuthDir, JSplitPane splitPane) {
        initComponents();
        
        this.splitPane = splitPane;
        
        ButtonGroup g1 = new ButtonGroup();
        
        g1.add(radioMale);
        g1.add(radioFemale);
       
        
        this.cityDir = cityDir;
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
        
    private void populateHospitalsHousesTable(HospitalDir hospitalDir, HouseDir houseDir) {
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
        jPanel2 = new javax.swing.JPanel();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtUname = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtQualification = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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
        btnCreateDoctor = new javax.swing.JButton();
        btnDispCommunities = new javax.swing.JButton();
        btnDispHospitalsHouses = new javax.swing.JButton();
        txtSpecialization = new javax.swing.JTextField();
        btnCreateAdmins = new javax.swing.JButton();
        btnCreateOther = new javax.swing.JButton();
        btnRUD = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

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

        jLabel8.setText("Specialization:");

        jLabel9.setText("Qualification:");

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
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblCities);

        btnCreateDoctor.setText("Create Doctor");
        btnCreateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDoctorActionPerformed(evt);
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

        btnCreateAdmins.setText("Go To Create Admins");
        btnCreateAdmins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAdminsActionPerformed(evt);
            }
        });

        btnCreateOther.setText("Go To Create Other Resources");
        btnCreateOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateOtherActionPerformed(evt);
            }
        });

        btnRUD.setText("Go To Modify Resources");
        btnRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRUDActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(0, 153, 102));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel12.setText("                                System Admin: Create Doctor");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btnDispCommunities)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDispHospitalsHouses)
                        .addGap(253, 253, 253))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFname)
                            .addComponent(txtLname)
                            .addComponent(txtUname)
                            .addComponent(txtPass)
                            .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                        .addGap(144, 144, 144)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtQualification, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSpecialization))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(radioMale)
                                .addGap(18, 18, 18)
                                .addComponent(radioFemale)))
                        .addGap(94, 94, 94))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCreateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(435, 435, 435))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(btnCreateAdmins)
                .addGap(48, 48, 48)
                .addComponent(btnCreateOther)
                .addGap(44, 44, 44)
                .addComponent(btnRUD)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(29, 29, 29)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(txtQualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioMale)
                    .addComponent(radioFemale)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDispCommunities)
                    .addComponent(btnDispHospitalsHouses))
                .addGap(18, 18, 18)
                .addComponent(btnCreateDoctor)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateAdmins)
                    .addComponent(btnCreateOther)
                    .addComponent(btnRUD))
                .addContainerGap(206, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void btnCreateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDoctorActionPerformed

        //Getting all the data from user input
        fName = txtFname.getText();
        name = txtFname.getText();
        lName = txtLname.getText();
        uName = txtUname.getText();
        password = txtPass.getText();
        age = Integer.parseInt(txtAge.getText());
        phone = txtPhone.getText();
        email = txtEmail.getText();
        qualification = txtQualification.getText();
        specialization = txtSpecialization.getText();

        int selectedRowIndex = tblHouses.getSelectedRow();

        if (selectedRowIndex < 0 ) {

            JOptionPane.showMessageDialog(this, "Please select a house.");
            return;
        }

        DefaultTableModel model;
        model = (DefaultTableModel) tblHouses.getModel();
        String selectedHouse = (String) model.getValueAt(selectedRowIndex, 0);

        selectedRowIndex = tblCities.getSelectedRow();

        if (selectedRowIndex < 0 ) {

            JOptionPane.showMessageDialog(this, "Please select a city.");
            return;
        }

        model = (DefaultTableModel) tblCities.getModel();
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

            JOptionPane.showMessageDialog(this, "Please select a hospital.");
            return;
        }

        //Radio buttons        

        if(radioMale.isSelected() == true) {
            gender = "Male";
        }
        else if(radioFemale.isSelected() == true){
            gender = "Female";
        }
        else {
            JOptionPane.showMessageDialog(this, "Please select a gender.");
            return;
        }

        model = (DefaultTableModel) tblHospitals.getModel();
        String selectedHospital = (String) model.getValueAt(selectedRowIndex, 0);

        //Creating UserAuth object
        UserAuth ua = userAuthDir.addNewUserAuth();

        ua.setUserName(uName);
        ua.setPassword(password);
        ua.setUserType("Doctor");

        //Test
        //System.out.println("pass:"+ua.getPassword());

        //Creating Patient Object and adding to hospitalDir

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

                        //Traversing hospitals to find the selected hospital
                        ArrayList<Hospital> hDir = hospitalDir.getHospitalDir();

                        for(Hospital h: hDir) {
                            if(h.getHospitalName().equalsIgnoreCase(selectedHospital))
                            {
                                //If patientDir already present in the selected Hospital
                                if(h.getDoctorDir() != null) {
                                    doctorDir = h.getDoctorDir();

                                    Doctor doctor = doctorDir.addNewDoctor();
                                    doctor.setQualification(qualification);
                                    doctor.setSpecialization(specialization);
                                    doctor.setName(name);
                                    doctor.setHouseID(selectedHouse);

                                }
                                else { //If patientDir not already created
                                    doctorDir = new DoctorDir();

                                    Doctor doctor = doctorDir.addNewDoctor();
                                    doctor.setQualification(qualification);
                                    doctor.setSpecialization(specialization);
                                    doctor.setName(name);
                                    doctor.setHouseID(selectedHouse);

                                    h.setDoctorDir(doctorDir);
                                }
                            //Test
//                                                                doctorDir = h.getDoctorDir();
//                                                                ArrayList<Doctor> p_temp = doctorDir.getDoctorDir();
//                                
//                                                                for(Doctor p : p_temp) {
//                                                                        System.out.println("doctor:"+p.getQualification());
//                                                                    }

                                                                
                            }
                        }

                        //Traversing houses to find the selected house
                        ArrayList<House> hoDir = houseDir.getHouseDir();

                        for(House h: hoDir) {
                            if(h.getHouseID().equalsIgnoreCase(selectedHouse))
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
//                                                                PersonDir personDir = h.getPersonDir();
//                                                                ArrayList<Person> p_temp = personDir.getPersonDir();
//                                
//                                                                for(Person p : p_temp) {
//                                                                        System.out.println("doctor:"+p.getFname());
//                                                                    }


                                    JOptionPane.showMessageDialog(this, "New Doctor created.");
                                    return;
                            }
                        }

                    }

                }
            }
        }
        
                                
    }//GEN-LAST:event_btnCreateDoctorActionPerformed

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
        
        int selectedRowIndexCity = tblCities.getSelectedRow();

        if (selectedRowIndexCity < 0 ) {

            JOptionPane.showMessageDialog(this, "Please select a row to update.");
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
                    if(com.getCommunityName().contains(communityName)) {
                        System.out.println(com.getHouseDir());
                        populateHospitalsHousesTable(com.getHospitalDir(),com.getHouseDir());
                    }
                }       
            }
        }
    }//GEN-LAST:event_btnDispHospitalsHousesActionPerformed

    private void btnRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRUDActionPerformed
        // TODO add your handling code here:
        SysAdminRUDPanel s = new SysAdminRUDPanel(cityDir, userAuthDir, splitPane);//cityDir,uaDir);
                    
        splitPane.setRightComponent(s);        
    }//GEN-LAST:event_btnRUDActionPerformed

    private void btnCreateAdminsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAdminsActionPerformed
        // TODO add your handling code here:
        CreateAdminPanel s = new CreateAdminPanel(cityDir, userAuthDir,splitPane);//cityDir,uaDir);
                    
        splitPane.setRightComponent(s);
        
    }//GEN-LAST:event_btnCreateAdminsActionPerformed

    private void btnCreateOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateOtherActionPerformed
        // TODO add your handling code here:

        CreateResourcesPanel s = new CreateResourcesPanel(cityDir, userAuthDir,splitPane);//cityDir,uaDir);

        splitPane.setRightComponent(s);

    }//GEN-LAST:event_btnCreateOtherActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAdmins;
    private javax.swing.JButton btnCreateDoctor;
    private javax.swing.JButton btnCreateOther;
    private javax.swing.JButton btnDispCommunities;
    private javax.swing.JButton btnDispHospitalsHouses;
    private javax.swing.JButton btnRUD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTable tblCities;
    private javax.swing.JTable tblCommunities;
    private javax.swing.JTable tblHospitals;
    private javax.swing.JTable tblHouses;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtQualification;
    private javax.swing.JTextField txtSpecialization;
    private javax.swing.JTextField txtUname;
    // End of variables declaration//GEN-END:variables
}
