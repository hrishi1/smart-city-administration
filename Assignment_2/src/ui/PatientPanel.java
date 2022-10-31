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
import model.Encounter;
import model.EncounterHistory;
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
        populateEncountersTable();
    }
    
    private void populateEncounters(EncounterHistory encHist) {
        
        DefaultTableModel model = (DefaultTableModel) tblEncounters.getModel();
        model.setRowCount(0);
        
        ArrayList<Encounter> aDir = encHist.getEncounterHistory();
        
        for(Encounter a: aDir) {
            Object[] row = new Object[11];
            row[0] = a.getDoctorName();
            row[1] = a.getEncounterType();
            row[2] = a.getDisease();
            row[3] = a.getV().getBodyTemperature();
            row[4] = a.getV().getPulseRate();
            row[5] = a.getV().getBloodPressure();
            
            
            model.addRow(row);
        }   
    }
    
    private void populateEncountersTable() {
    
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
                                    
                                    //populateDoctors(h.getDoctorDir());
                                    PatientDir docDir = h.getPatientDir();
                                    ArrayList<Patient> pDir = docDir.getPatientDir();
          
                                    for(Patient p: pDir) {
                                        if(p.getName() == patName) {
                                            
                                            if (p.getEncounterHistory() != null) {
                                                populateEncounters(p.getEncounterHistory());
                                            }
                                        }
                                    }
                                } 
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    private void populatePatients(Patient pat) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        DefaultTableModel model = (DefaultTableModel) tblPatients.getModel();
        model.setRowCount(0);
            
            Object[] row = new Object[11];
            row[0] = pat.getName();
            row[1] = pat.getInsured();
            
            model.addRow(row);
            
        
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
                                    // populatePatients(h.getPatientDir());
                                    
                                    PatientDir patDir = h.getPatientDir();
                                    ArrayList<Patient> pDir = patDir.getPatientDir();
                                    for(Patient p: pDir) {
                                        if(p.getName() == patName) {
                                            populatePatients(p);
                                        }
                                    }
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
    
//    private void populateHospitalsHousesTable(HospitalDir hospitalDir, HouseDir houseDir) {
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        
//        DefaultTableModel model = (DefaultTableModel) tblHospitals.getModel();
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
//            
////        model = (DefaultTableModel) tblHouses.getModel();
////        model.setRowCount(0);
////        
////        for(House h : houseDir.getHouseDir()) {
////            
////            row = new Object[11];
////            //row[0] = house;
////            row[0] = h.getHouseID();
////
////            
////            model.addRow(row);
//            
////        } 
//            
//        } 
//    }
    

    
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

        btnDispDoctors = new javax.swing.JButton();
        btnBookApp = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblDoctors = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncounters = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblPatients);

        tblDoctors.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(tblDoctors);

        tblEncounters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Doctor Name", "Encounter Type", "Disease", "Temperature", "Pulse", "Blood Pressure"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEncounters);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setText("                                          Patient Portal");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setText("Patient Details:");

        jLabel2.setText("Doctors:");

        jLabel3.setText("Encounter History:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(445, 445, 445)
                        .addComponent(btnDispDoctors)
                        .addGap(34, 34, 34)
                        .addComponent(btnBookApp))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDispDoctors)
                    .addComponent(btnBookApp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(358, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDispDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDispDoctorsActionPerformed
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

//                int selectedRowIndex = tblHospitals.getSelectedRow();
//
//                if (selectedRowIndex < 0 ) {
//
//                    JOptionPane.showMessageDialog(this, "Please select a hospital.");
//                    return;
//                }
//                
//                DefaultTableModel model = (DefaultTableModel) tblHospitals.getModel();
//                String hospitalName = (String) model.getValueAt(selectedRowIndex, 0);
                
                int selectedRowIndex = tblDoctors.getSelectedRow();

                if (selectedRowIndex < 0 ) {

                    JOptionPane.showMessageDialog(this, "Please select a doctor.");
                    return;
                }
                
                DefaultTableModel model = (DefaultTableModel) tblDoctors.getModel();
                String doctorName = (String) model.getValueAt(selectedRowIndex, 0);

                communityDir = c.getCommunityDir(); // communityDir.getCommunityDir();

                ArrayList<Community> comDir = communityDir.getCommunityDir();

                for(Community com: comDir) {
                    if(com.getCommunityName().equalsIgnoreCase(commName)) {

                        HospitalDir hospitalDir = com.getHospitalDir();
                        ArrayList<Hospital> hospDir = hospitalDir.getHospitalDir();

                        for(Hospital h: hospDir) {
                            if(h.getHospitalName().equalsIgnoreCase(hospName)) {

                                if (h.getDoctorDir() != null) {
                                    
                                    DoctorDir doctorDir = h.getDoctorDir();
                                    ArrayList<Doctor> docDir = doctorDir.getDoctorDir();
                                    
                                    for(Doctor d: docDir) {
                                        
                                        if(d.getName() == doctorName) {
                                            
                                            if(d.getAppDir() != null) {
                                                
                                                AppointmentDir appDir = d.getAppDir();
                                                
                                                Appointment app = appDir.addNewAppointment();
                                                
                                                app.setDoctorName(doctorName);
                                                app.setHospitalName(hospName);
                                                app.setPatientName(patName);
                                            }
                                            else {
        
                                                AppointmentDir appDir = new AppointmentDir();
                                                
                                                Appointment app = appDir.addNewAppointment();
                                                app.setDoctorName(doctorName);
                                                app.setHospitalName(hospName);
                                                app.setPatientName(patName);
                                                
                                                d.setAppDir(appDir);
                                            }
                                            
                                            JOptionPane.showMessageDialog(this, "Appointment booked!");
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tblDoctors;
    private javax.swing.JTable tblEncounters;
    private javax.swing.JTable tblPatients;
    // End of variables declaration//GEN-END:variables
}
