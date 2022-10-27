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
public class HospitalDir {
    
    private ArrayList<Hospital> hospitalDir;

    public HospitalDir() {
        this.hospitalDir = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getHospitalDir() {
        return hospitalDir;
    }

    public void setHospitalDir(ArrayList<Hospital> hospitalDir) {
        this.hospitalDir = hospitalDir;
    }
    
    public Hospital addNewHospital() {
        Hospital h = new Hospital();
        hospitalDir.add(h);
        return h;
    }
    
    public void deleteHospital(Hospital h) {
        hospitalDir.remove(h);
    }
    
    public void updateHospital(Hospital h, Hospital u) {
        
        for(int i=0;i<hospitalDir.size();i++) {
            
            if (hospitalDir.get(i).equals(h)) {
                hospitalDir.set(i,u);
            }
        }
    }

    
}
