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
public class AppointmentDir {
    
    private ArrayList<Appointment> appDir;

    public AppointmentDir() {
        this.appDir = new ArrayList<Appointment>();
    }

    public ArrayList<Appointment> getAppointmentDir() {
        return appDir;
    }

    public void setAppointmentDir(ArrayList<Appointment> appDir) {
        this.appDir = appDir;
    }
    
    public Appointment addNewAppointment() {
        Appointment h = new Appointment();
        appDir.add(h);
        return h;
    }
    
    public void deleteAppointment(Appointment h) {
        appDir.remove(h);
    }
    
    public void updateAppointment(Appointment h, Appointment u) {
        
        for(int i=0;i<appDir.size();i++) {
            
            if (appDir.get(i).equals(h)) {
                appDir.set(i,u);
            }
        }
    }
    
}
