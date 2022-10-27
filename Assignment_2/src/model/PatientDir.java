/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author hrish
 */
public class PatientDir {
    
    private ArrayList<Patient> patientDir;

    public PatientDir() {
        this.patientDir = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientDir() {
        return patientDir;
    }

    public void setPatientDir(ArrayList<Patient> patientDir) {
        this.patientDir = patientDir;
    }
    
    public Patient addNewPatient() {
        Patient p = new Patient();
        patientDir.add(p);
        return p;
    }
    
    public void deletePatient(Patient p) {
        patientDir.remove(p);
    }
    
    public void updatePatient(Patient p, Patient u) {
        
        for(int i=0;i<patientDir.size();i++) {
            
            if (patientDir.get(i).equals(p)) {
                patientDir.set(i,u);
            }
        }
    }
    
    
}
