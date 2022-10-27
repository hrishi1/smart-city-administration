/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import model.PatientDir;
import model.DoctorDir;

/**
 *
 * @author hrish
 */
public class Hospital {
    
    private PatientDir patientDir;
    private DoctorDir doctorDir;
    private String hospitalName;
    private String location;
    private int rating;
    private String hospitalType;
  
    

    public PatientDir getPatientDir() {
        return patientDir;
    }

    public void setPatientDir(PatientDir patientDir) {
        this.patientDir = patientDir;
    }

    public DoctorDir getDoctorDir() {
        return doctorDir;
    }

    public void setDoctorDir(DoctorDir doctorDir) {
        this.doctorDir = doctorDir;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getHospitalType() {
        return hospitalType;
    }

    public void setHospitalType(String hospitalType) {
        this.hospitalType = hospitalType;
    }
    
    
    
    
}
