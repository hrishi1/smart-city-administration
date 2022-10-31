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
import model.Doctor;
import model.DoctorDir;
import model.Hospital;
import model.HospitalDir;
import model.HouseDir;
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

    /**
     * Creates new form DoctorPanel
     */
    public DoctorPanel() {
        initComponents();
    }
    
    public DoctorPanel(CityDir cityDir, UserAuthDir userAuthDir, JSplitPane splitPane, String cityName, String commName, String hospName, String patName) {
        initComponents();
        
        this.splitPane = splitPane;
        this.cityDir = cityDir;
        this.userAuthDir = userAuthDir;
        this.cityName = cityName;
        this.commName = commName;
        this.hospName = hospName;
        this.docName = docName;
        this.patName = patName;
        
        populateDoctorsTable();
    }
    
    private void btnDispHospitalsHousesActionPerformed(java.awt.event.ActionEvent evt) {                                                       
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
    }                                                      

    private void btnDispDoctorsActionPerformed(java.awt.event.ActionEvent evt) {                                               
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

        jScrollPane6 = new javax.swing.JScrollPane();
        tblDoctors1 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblAppointment = new javax.swing.JTable();
        btnStartAppointment = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        tblDoctors1.setModel(new javax.swing.table.DefaultTableModel(
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
        ));
        jScrollPane6.setViewportView(tblDoctors1);
        if (tblDoctors1.getColumnModel().getColumnCount() > 0) {
            tblDoctors1.getColumnModel().getColumn(2).setHeaderValue("Specialization");
        }

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
        ));
        jScrollPane7.setViewportView(tblAppointment);

        btnStartAppointment.setText("Start Appointment");
        btnStartAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartAppointmentActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Encounter", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnStartAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(667, 667, 667))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(527, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnStartAppointment)
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(298, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartAppointmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStartAppointmentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStartAppointment;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblAppointment;
    private javax.swing.JTable tblDoctors1;
    // End of variables declaration//GEN-END:variables
}
