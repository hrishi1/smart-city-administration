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
import model.Doctor;
import model.DoctorDir;
import model.Hospital;
import model.HospitalDir;
import model.HouseDir;
import model.Patient;
import model.PatientDir;
import model.UserAuth;
import model.UserAuthDir;

/**
 *
 * @author hrish
 */
public class DocPatLoginPanel extends javax.swing.JPanel {

    private JSplitPane splitPane;
    private CityDir cityDir;
    private UserAuthDir userAuthDir;
    private CommunityDir communityDir;
    private String uname;
    private String password;
    private String userType;

    /**
     * Creates new form DocPatLoginPanel
     */
    public DocPatLoginPanel() {
        initComponents();
    }
    
    public DocPatLoginPanel(CityDir cityDir, UserAuthDir userAuthDir, JSplitPane splitPane) {
        initComponents();
        
        this.splitPane = splitPane;
        this.cityDir = cityDir;
        this.userAuthDir = userAuthDir;
        
        populateCitiesTable();
    }
    
    private void populatePatients(PatientDir patDir) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        DefaultTableModel model = (DefaultTableModel) tblPatients.getModel();
        model.setRowCount(0);
        
        for(Patient c : patDir.getPatientDir()) {
            
            Object[] row = new Object[11];
            row[0] = c.getName();
            row[1] = c.getInsured();
            
            model.addRow(row);
            
        } 
    }
    
    private void populatePatientsTable(String patientName) {
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

                selectedRowIndex = tblHospitals.getSelectedRow();

                if (selectedRowIndex < 0 ) {

                    JOptionPane.showMessageDialog(this, "Please select a Hospital.");
                    return;
                }

                ///DefaultTableModel model;
                model = (DefaultTableModel) tblHospitals.getModel();
                String hospitalName = (String) model.getValueAt(selectedRowIndex, 0);

                communityDir = c.getCommunityDir(); // communityDir.getCommunityDir();

                ArrayList<Community> comDir = communityDir.getCommunityDir();

                for(Community com: comDir) {
                    if(com.getCommunityName().equalsIgnoreCase(communityName)) {

                        HospitalDir hospitalDir = com.getHospitalDir();
                        ArrayList<Hospital> hospDir = hospitalDir.getHospitalDir();

                        for(Hospital h: hospDir) {
                            if(h.getHospitalName().equalsIgnoreCase(hospitalName)) {

                                if (h.getPatientDir() != null) {
                                    populatePatients(h.getPatientDir());
                                }
                                else {
                                    JOptionPane.showMessageDialog(this, "No Patients available.");
                                    return;
                                }
                            }
                        }
                    }
                }
            }
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
            
//        model = (DefaultTableModel) tblHouses.getModel();
//        model.setRowCount(0);
//        
//        for(House h : houseDir.getHouseDir()) {
//            
//            row = new Object[11];
//            //row[0] = house;
//            row[0] = h.getHouseID();
//
//            
//            model.addRow(row);
            
//        } 
            
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
    
    private void populateDoctors(DoctorDir doctorDir) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        DefaultTableModel model = (DefaultTableModel) tblDoctors.getModel();
        model.setRowCount(0);
        
        for(Doctor c : doctorDir.getDoctorDir()) {
            
            Object[] row = new Object[11];
            row[0] = c.getName();
            row[1] = c.getQualification();
            row[2] = c.getSpecialization();
            
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
            row[1] = c.getState();

            
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

        jScrollPane4 = new javax.swing.JScrollPane();
        tblCities = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCommunities = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospitals = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDoctors = new javax.swing.JTable();
        btnDispCommunities = new javax.swing.JButton();
        btnDispHospitalsHouses = new javax.swing.JButton();
        btnDispDoctors = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();
        btnDisplayPatients = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        radioDoctor = new javax.swing.JRadioButton();
        radioPatient = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

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

        tblDoctors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Doctor Name"
            }
        ));
        jScrollPane2.setViewportView(tblDoctors);

        btnDispCommunities.setText("Display Communities");
        btnDispCommunities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDispCommunitiesActionPerformed(evt);
            }
        });

        btnDispHospitalsHouses.setText("Display Hospitals");
        btnDispHospitalsHouses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDispHospitalsHousesActionPerformed(evt);
            }
        });

        btnDispDoctors.setText("Display Doctors");
        btnDispDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDispDoctorsActionPerformed(evt);
            }
        });

        tblPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Patient Name"
            }
        ));
        jScrollPane5.setViewportView(tblPatients);

        btnDisplayPatients.setText("Display Patients");
        btnDisplayPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayPatientsActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        radioDoctor.setText("Doctor");
        radioDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDoctorActionPerformed(evt);
            }
        });

        radioPatient.setText("Patient");

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        txtUname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnameActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel12.setText("                                     Doctor/Patient Login");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnDispCommunities)
                                .addGap(33, 33, 33)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDispHospitalsHouses)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDispDoctors))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(btnDisplayPatients, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUname)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(radioDoctor)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(radioPatient))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(76, 76, 76)
                                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(379, Short.MAX_VALUE))
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDispCommunities)
                    .addComponent(btnDispHospitalsHouses)
                    .addComponent(btnDispDoctors)
                    .addComponent(btnDisplayPatients))
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioDoctor)
                    .addComponent(radioPatient))
                .addGap(57, 57, 57)
                .addComponent(btnLogin)
                .addContainerGap(289, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDispCommunitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDispCommunitiesActionPerformed
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
            if(c.getCityName().equalsIgnoreCase(cityName)) {
                if(c.getCommunityDir() != null) {
                    populateCommunitiesTable(c.getCommunityDir());
                }
                else {
                    populateCommunitiesTable(new CommunityDir());
                }
            }
        }
    }//GEN-LAST:event_btnDispCommunitiesActionPerformed

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
                        if(com.getHospitalDir() != null) {
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

    private void btnDispDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDispDoctorsActionPerformed
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

                selectedRowIndex = tblHospitals.getSelectedRow();

                if (selectedRowIndex < 0 ) {

                    JOptionPane.showMessageDialog(this, "Please select a community.");
                    return;
                }

                ///DefaultTableModel model;
                model = (DefaultTableModel) tblHospitals.getModel();
                String hospitalName = (String) model.getValueAt(selectedRowIndex, 0);

                communityDir = c.getCommunityDir(); // communityDir.getCommunityDir();

                ArrayList<Community> comDir = communityDir.getCommunityDir();

                for(Community com: comDir) {
                    if(com.getCommunityName().equalsIgnoreCase(communityName)) {

                        HospitalDir hospitalDir = com.getHospitalDir();
                        ArrayList<Hospital> hospDir = hospitalDir.getHospitalDir();

                        for(Hospital h: hospDir) {
                            if(h.getHospitalName().equalsIgnoreCase(hospitalName)) {

                                if (h.getDoctorDir() != null) {
                                    populateDoctors(h.getDoctorDir());
                                }
                                else {
                                    populateDoctors(new DoctorDir());
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnDispDoctorsActionPerformed

    private void btnDisplayPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayPatientsActionPerformed
        // TODO add your handling code here:
        
                                                       
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

                selectedRowIndex = tblHospitals.getSelectedRow();

                if (selectedRowIndex < 0 ) {

                    JOptionPane.showMessageDialog(this, "Please select a community.");
                    return;
                }

                ///DefaultTableModel model;
                model = (DefaultTableModel) tblHospitals.getModel();
                String hospitalName = (String) model.getValueAt(selectedRowIndex, 0);

                communityDir = c.getCommunityDir(); // communityDir.getCommunityDir();

                ArrayList<Community> comDir = communityDir.getCommunityDir();

                for(Community com: comDir) {
                    if(com.getCommunityName().equalsIgnoreCase(communityName)) {

                        HospitalDir hospitalDir = com.getHospitalDir();
                        ArrayList<Hospital> hospDir = hospitalDir.getHospitalDir();

                        for(Hospital h: hospDir) {
                            if(h.getHospitalName().equalsIgnoreCase(hospitalName)) {
                                
                                if (h.getPatientDir() != null) {
                                    populatePatients(h.getPatientDir());
                                } 
                                else {
                                    populatePatients(new PatientDir());
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnDisplayPatientsActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblCities.getSelectedRow();

        if (selectedRowIndex < 0 ) {

            JOptionPane.showMessageDialog(this, "Please select a city.");
            return;
        }

        DefaultTableModel model;
        model = (DefaultTableModel) tblCities.getModel();
        String cityName = (String) model.getValueAt(selectedRowIndex, 0);
        
        
        selectedRowIndex = tblCommunities.getSelectedRow();

        if (selectedRowIndex < 0 ) {

            JOptionPane.showMessageDialog(this, "Please select a community.");
            return;
        }

        model = (DefaultTableModel) tblCommunities.getModel();
        String commName = (String) model.getValueAt(selectedRowIndex, 0);
        
        selectedRowIndex = tblHospitals.getSelectedRow();

        if (selectedRowIndex < 0 ) {

            JOptionPane.showMessageDialog(this, "Please select a hospital.");
            return;
        }

        model = (DefaultTableModel) tblHospitals.getModel();
        String hospName = (String) model.getValueAt(selectedRowIndex, 0);
        
//        selectedRowIndex = tblDoctors.getSelectedRow();
//
//        if (selectedRowIndex < 0 ) {
//
//            JOptionPane.showMessageDialog(this, "Please select a doctor.");
//            return;
//        }
//
//        model = (DefaultTableModel) tblDoctors.getModel();
//        String docName = (String) model.getValueAt(selectedRowIndex, 0);
//        
//        
//        selectedRowIndex = tblPatients.getSelectedRow();
//
//        if (selectedRowIndex < 0 ) {
//
//            JOptionPane.showMessageDialog(this, "Please select a patient.");
//            return;
//        }
//
//        model = (DefaultTableModel) tblPatients.getModel();
//        String patName = (String) model.getValueAt(selectedRowIndex, 0);
  
        uname = txtUname.getText();
        password = txtPassword.getText();        
        
        if(uname.length() == 0 ||  password.length() == 0) {
            JOptionPane.showMessageDialog(this, "All fields are mandatory.");
            return;
        }
        
        //Radio buttons


                if(radioPatient.isSelected() == true) {
                        userType = "Patient";
                    }
                else if(radioDoctor.isSelected() == true) {
                        userType = "Doctor";
                    }
                else {
                    JOptionPane.showMessageDialog(this, "Please select user type.");
                    return;
                }

        ArrayList<UserAuth> uDir = userAuthDir.getUserAuthDir();


        boolean authFlag = false;

        for(UserAuth u : uDir) {

            // Test
            //            System.out.println("Uname: "+u.getUserName());
            //            System.out.println("pass: "+u.getPassword());
            //            System.out.println("type: "+u.getUserType());
            //
            //            System.out.println("Uname: "+uname);
            //            System.out.println("pass: "+password);
            //            System.out.println("type: "+userType);
            //
            //            System.out.println(u.getUserType() == userType);
            //            System.out.println(u.getUserName().equalsIgnoreCase(uname));
            //            System.out.println(u.getPassword().equalsIgnoreCase(password));

            if(u.getUserType().equalsIgnoreCase(userType) && u.getUserName().equalsIgnoreCase(uname) && u.getPassword().equalsIgnoreCase(password)) {

                authFlag = true;

                if (userType.equalsIgnoreCase("Doctor")) {
                    
                    selectedRowIndex = tblDoctors.getSelectedRow();

                    if (selectedRowIndex < 0 ) {

                        JOptionPane.showMessageDialog(this, "Please select a doctor.");
                        return;
                    }

                    model = (DefaultTableModel) tblDoctors.getModel();
                    String docName = (String) model.getValueAt(selectedRowIndex, 0);
                    
                    DoctorPanel s = new DoctorPanel(cityDir, userAuthDir, splitPane, cityName, commName, hospName, docName);//cityDir,uaDir);

                    splitPane.setRightComponent(s);

                }
                
                else if (userType.equalsIgnoreCase("Patient")) {
                    
                    selectedRowIndex = tblPatients.getSelectedRow();

                    if (selectedRowIndex < 0 ) {

                        JOptionPane.showMessageDialog(this, "Please select a patient.");
                        return;
                    }

                    model = (DefaultTableModel) tblPatients.getModel();
                    String patName = (String) model.getValueAt(selectedRowIndex, 0);                    
                    
                    PatientPanel s = new PatientPanel(cityDir, userAuthDir, splitPane, cityName, commName, hospName, patName);//cityDir,uaDir);

                    splitPane.setRightComponent(s);
                }
            }

        }

        if(authFlag == false) {
            JOptionPane.showMessageDialog(this, "Authentication failed.");
        }

    }//GEN-LAST:event_btnLoginActionPerformed

    private void radioDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioDoctorActionPerformed

    private void txtUnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDispCommunities;
    private javax.swing.JButton btnDispDoctors;
    private javax.swing.JButton btnDispHospitalsHouses;
    private javax.swing.JButton btnDisplayPatients;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JRadioButton radioDoctor;
    private javax.swing.JRadioButton radioPatient;
    private javax.swing.JTable tblCities;
    private javax.swing.JTable tblCommunities;
    private javax.swing.JTable tblDoctors;
    private javax.swing.JTable tblHospitals;
    private javax.swing.JTable tblPatients;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUname;
    // End of variables declaration//GEN-END:variables
}
