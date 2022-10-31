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
import model.Appointment;
import model.AppointmentDir;
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
import model.UserAuthDir;

/**
 *
 * @author hrish
 */
public class PatientPanel extends javax.swing.JPanel {

    private JSplitPane splitPane;
    private CityDir cityDir;
    private UserAuthDir userAuthDir;
    private CommunityDir communityDir;
    private String cityName;
    private String commName;
    private String hospName;
    private String docName;
    private String patName;

    /**
     * Creates new form PatientPanel
     */
    public PatientPanel() {
        initComponents();
    }
    
    public PatientPanel(CityDir cityDir, UserAuthDir userAuthDir, JSplitPane splitPane, String cityName, String commName, String hospName, String patName) {
        initComponents();
        
        this.splitPane = splitPane;
        this.cityDir = cityDir;
        this.userAuthDir = userAuthDir;
        this.cityName = cityName;
        this.commName = commName;
        this.hospName = hospName;
        this.docName = docName;
        this.patName = patName;
        
        populatePatientTable();
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
    
    private void populatePatientTable() {                                                   
        // TODO add your handling code here:
        
                                                       
        // TODO add your handling code here:

        ArrayList<City> cDir = cityDir.getCityDir();

        for(City c: cDir) {
            if(c.getCityName().equalsIgnoreCase(cityName)) {
                communityDir = c.getCommunityDir(); // communityDir.getCommunityDir();

                ArrayList<Community> comDir = communityDir.getCommunityDir();

                for(Community com: comDir) {
                    if(com.getCommunityName().equalsIgnoreCase(commName)) {
                        
                        HospitalDir hospitalDir = com.getHospitalDir();
                        ArrayList<Hospital> hospDir = hospitalDir.getHospitalDir();

                        for(Hospital h: hospDir) {
                            if(h.getHospitalName().equalsIgnoreCase(hospName)) {                               
                                
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
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospitals = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDoctors = new javax.swing.JTable();
        btnDispHospitalsHouses = new javax.swing.JButton();
        btnDispDoctors = new javax.swing.JButton();
        btnBookApp = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblDoctors1 = new javax.swing.JTable();

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
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Encounter", "Qualification", "Specialization"
            }
        ));
        jScrollPane2.setViewportView(tblDoctors);

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

        btnBookApp.setText("Book Appointment");
        btnBookApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAppActionPerformed(evt);
            }
        });

        tblPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Patient Name", "Insured"
            }
        ));
        jScrollPane5.setViewportView(tblPatients);

        tblDoctors1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "First Name", "Qualification", "Specialization"
            }
        ));
        jScrollPane6.setViewportView(tblDoctors1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnDispHospitalsHouses)
                        .addGap(148, 148, 148)
                        .addComponent(btnDispDoctors)
                        .addGap(71, 71, 71)
                        .addComponent(btnBookApp)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDispDoctors)
                    .addComponent(btnBookApp)
                    .addComponent(btnDispHospitalsHouses))
                .addGap(446, 446, 446))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDispHospitalsHousesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDispHospitalsHousesActionPerformed
        // TODO add your handling code here:

        ArrayList<City> cDir = cityDir.getCityDir();

        for(City c: cDir) {
            if(c.getCityName() == (cityName)) {

                

                communityDir = c.getCommunityDir(); // communityDir.getCommunityDir();

                ArrayList<Community> comDir = communityDir.getCommunityDir();

                for(Community com: comDir) {
                    if(com.getCommunityName().contains(commName)) {
                        populateHospitalsHousesTable(com.getHospitalDir(),com.getHouseDir());
                    }
                }
            }
        }
    }//GEN-LAST:event_btnDispHospitalsHousesActionPerformed

    private void btnDispDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDispDoctorsActionPerformed
        // TODO add your handling code here:

        
        ArrayList<City> cDir = cityDir.getCityDir();

        for(City c: cDir) {
            if(c.getCityName().equalsIgnoreCase(cityName)) {

                int selectedRowIndex = tblHospitals.getSelectedRow();

                if (selectedRowIndex < 0 ) {

                    JOptionPane.showMessageDialog(this, "Please select a hospital.");
                    return;
                }
                
                DefaultTableModel model = (DefaultTableModel) tblHospitals.getModel();
                String hospitalName = (String) model.getValueAt(selectedRowIndex, 0);

                communityDir = c.getCommunityDir(); // communityDir.getCommunityDir();

                ArrayList<Community> comDir = communityDir.getCommunityDir();

                for(Community com: comDir) {
                    if(com.getCommunityName().equalsIgnoreCase(commName)) {

                        HospitalDir hospitalDir = com.getHospitalDir();
                        ArrayList<Hospital> hospDir = hospitalDir.getHospitalDir();

                        for(Hospital h: hospDir) {
                            if(h.getHospitalName().equalsIgnoreCase(hospitalName)) {

                                if (h.getDoctorDir() != null) {
                                    populateDoctors(h.getDoctorDir());
                                }
                                else {
                                    JOptionPane.showMessageDialog(this, "No Doctors available.");
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }

    }//GEN-LAST:event_btnDispDoctorsActionPerformed

    private void btnBookAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAppActionPerformed
        // TODO add your handling code here:
        
        ArrayList<City> cDir = cityDir.getCityDir();

        for(City c: cDir) {
            if(c.getCityName().equalsIgnoreCase(cityName)) {

                int selectedRowIndex = tblHospitals.getSelectedRow();

                if (selectedRowIndex < 0 ) {

                    JOptionPane.showMessageDialog(this, "Please select a hospital.");
                    return;
                }
                
                DefaultTableModel model = (DefaultTableModel) tblHospitals.getModel();
                String hospitalName = (String) model.getValueAt(selectedRowIndex, 0);
                
                selectedRowIndex = tblDoctors.getSelectedRow();

                if (selectedRowIndex < 0 ) {

                    JOptionPane.showMessageDialog(this, "Please select a doctor.");
                    return;
                }
                
                model = (DefaultTableModel) tblDoctors.getModel();
                String doctorName = (String) model.getValueAt(selectedRowIndex, 0);

                communityDir = c.getCommunityDir(); // communityDir.getCommunityDir();

                ArrayList<Community> comDir = communityDir.getCommunityDir();

                for(Community com: comDir) {
                    if(com.getCommunityName().equalsIgnoreCase(commName)) {

                        HospitalDir hospitalDir = com.getHospitalDir();
                        ArrayList<Hospital> hospDir = hospitalDir.getHospitalDir();

                        for(Hospital h: hospDir) {
                            if(h.getHospitalName().equalsIgnoreCase(hospitalName)) {

                                if (h.getDoctorDir() != null) {
                                    
                                    DoctorDir doctorDir = h.getDoctorDir();
                                    ArrayList<Doctor> docDir = doctorDir.getDoctorDir();
                                    
                                    for(Doctor d: docDir) {
                                        
                                        if(d.getName() == doctorName) {
                                            
                                            if(d.getAppDir() != null) {
                                                
                                                AppointmentDir appDir = d.getAppDir();
                                                
                                                Appointment app = appDir.addNewAppointment();
                                                
                                                app.setDoctorName(doctorName);
                                                app.setHospitalName(hospitalName);
                                                app.setPatientName(patName);
                                            }
                                            else {
                                                
                                                AppointmentDir appDir = new AppointmentDir();
                                                
                                                Appointment app = appDir.addNewAppointment();
                                                app.setDoctorName(doctorName);
                                                app.setHospitalName(hospitalName);
                                                app.setPatientName(patName);
                                                
                                                d.setAppDir(appDir);
                                            }
                                        }   
                                    }
                                }
                                else {
                                    JOptionPane.showMessageDialog(this, "No Doctors available.");
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnBookAppActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookApp;
    private javax.swing.JButton btnDispDoctors;
    private javax.swing.JButton btnDispHospitalsHouses;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tblDoctors;
    private javax.swing.JTable tblDoctors1;
    private javax.swing.JTable tblHospitals;
    private javax.swing.JTable tblPatients;
    // End of variables declaration//GEN-END:variables
}
