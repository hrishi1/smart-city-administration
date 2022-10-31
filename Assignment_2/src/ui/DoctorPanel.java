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
public class DoctorPanel extends javax.swing.JPanel {

    private JSplitPane splitPane;
    private CityDir cityDir;
    private String cityName;
    private String commName;
    private String hospName;
    private String patName;
    private String docName;
    private UserAuthDir userAuthDir;
    private CommunityDir communityDir;

    /**
     * Creates new form DoctorPanel
     */
    public DoctorPanel() {
        initComponents();
    }
    
    public DoctorPanel(CityDir cityDir, UserAuthDir userAuthDir, JSplitPane splitPane, String cityName, String commName, String hospName, String docName) {
        initComponents();
        
        this.splitPane = splitPane;
        this.cityDir = cityDir;
        this.userAuthDir = userAuthDir;
        this.cityName = cityName;
        this.commName = commName;
        this.hospName = hospName;
        this.docName = docName;
        //this.patName = patName;
        
        populateDoctorsTable();
        populateAppointmentTable();
        populateEncountersTable();
    }
    
    private void populateEncounters(EncounterHistory encHist) {
        
        DefaultTableModel model = (DefaultTableModel) tblEncounters.getModel();
        model.setRowCount(0);
        
        
        ArrayList<Encounter> aDir = encHist.getEncounterHistory();
        
        for(Encounter a: aDir) {
            Object[] row = new Object[11];
            row[0] = a.getPatientName();
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

                                if (h.getDoctorDir() != null) {
                                    
                                    //populateDoctors(h.getDoctorDir());
                                    DoctorDir docDir = h.getDoctorDir();
                                    ArrayList<Doctor> pDir = docDir.getDoctorDir();
          
                                    for(Doctor p: pDir) {
                                        if(p.getName() == docName) {
                                            
                                            
                                            if (p.getEncounterHistory() != null) {
                                                populateEncounters(p.getEncounterHistory());
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
        
    }
    
    private void populateAppointments(AppointmentDir appDir) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        DefaultTableModel model = (DefaultTableModel) tblAppointment.getModel();
        model.setRowCount(0);
        
        
        ArrayList<Appointment> aDir = appDir.getAppointmentDir();
        
        for(Appointment a: aDir) {
            Object[] row = new Object[11];
            row[0] = a.getPatientName();
            row[1] = a.getHospitalName();
            
            model.addRow(row);
        }
    }
    
    private void populateAppointmentTable() {
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
                                    
                                    //populateDoctors(h.getDoctorDir());
                                    DoctorDir docDir = h.getDoctorDir();
                                    ArrayList<Doctor> pDir = docDir.getDoctorDir();
          
                                    for(Doctor p: pDir) {
                                        if(p.getName().equalsIgnoreCase(docName) && p.getAppDir() != null) {
                                            populateAppointments(p.getAppDir());
                                        }
                                    }
                                    
                                } 
//                                else {
//                                    JOptionPane.showMessageDialog(this, "No Doctors available.");
//                                    return;
//                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void populateDoctors(Doctor doc) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        DefaultTableModel model = (DefaultTableModel) tblDoctors.getModel();
        model.setRowCount(0);
            
            Object[] row = new Object[11];
            row[0] = doc.getName();
            row[1] = doc.getQualification();
            row[2] = doc.getSpecialization();
            
            model.addRow(row);
            
        
    }

    private void populateDoctorsTable() {
        
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
                                    //populateDoctors(h.getDoctorDir());
                                    DoctorDir patDir = h.getDoctorDir();
                                    ArrayList<Doctor> pDir = patDir.getDoctorDir();
                                    for(Doctor p: pDir) {
                                        if(p.getName() == docName) {
                                            populateDoctors(p);
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

        jScrollPane6 = new javax.swing.JScrollPane();
        tblDoctors = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblAppointment = new javax.swing.JTable();
        btnStartAppointment = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncounters = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(1200, 722));

        tblDoctors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Doctor Name", "Qualification", "Specialization"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tblDoctors);

        tblAppointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Patient Name", "Hospital"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tblAppointment);

        btnStartAppointment.setText("Start Appointment");
        btnStartAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartAppointmentActionPerformed(evt);
            }
        });

        tblEncounters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Encounter Type", "Disease", "Temperature", "Pulse", "Blood Pressure"
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("                                          Doctor Portal");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Appointments:");

        jLabel3.setText("Doctor Details:");

        jLabel4.setText("Encounter History:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnStartAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(420, 420, 420))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStartAppointment)
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartAppointmentActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblAppointment.getSelectedRow();

                if (selectedRowIndex < 0 ) {

                    JOptionPane.showMessageDialog(this, "Please select an appointment.");
                    return;
                }
                
                DefaultTableModel model = (DefaultTableModel) tblAppointment.getModel();
                String patientName = (String) model.getValueAt(selectedRowIndex, 0);
                
                StartAppPanel s = new StartAppPanel(cityDir, userAuthDir, splitPane, cityName, commName, hospName, docName, patientName);//cityDir,uaDir);

                    splitPane.setRightComponent(s);
        
    }//GEN-LAST:event_btnStartAppointmentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStartAppointment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable tblAppointment;
    private javax.swing.JTable tblDoctors;
    private javax.swing.JTable tblEncounters;
    // End of variables declaration//GEN-END:variables
}
