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
public class DoctorDir {
    
    private ArrayList<Doctor> doctorDir;

    public DoctorDir() {
        this.doctorDir = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctorDir() {
        return doctorDir;
    }

    public void setDoctorDir(ArrayList<Doctor> doctorDir) {
        this.doctorDir = doctorDir;
    }
    
    public Doctor addNewDoctor() {
        Doctor d = new Doctor();
        doctorDir.add(d);
        return d;
    }
    
    public void deleteDoctor(Doctor d) {
        doctorDir.remove(d);
    }
    
    public void updateDoctor(Doctor d, Doctor u) {
        
        for(int i=0;i<doctorDir.size();i++) {
            
            if (doctorDir.get(i).equals(d)) {
                doctorDir.set(i,u);
            }
        }
    }
    
}
