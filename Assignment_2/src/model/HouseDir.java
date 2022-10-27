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
public class HouseDir {
    
    private ArrayList<House> houseDir;

    public HouseDir() {
        this.houseDir = new ArrayList<House>();
    }

    public ArrayList<House> getHouseDir() {
        return houseDir;
    }

    public void setHouseDir(ArrayList<House> houseDir) {
        this.houseDir = houseDir;
    }
    
    public House addNewHouse() {
        House h = new House();
        houseDir.add(h);
        return h;
    }
    
    public void deleteHouse(House h) {
        houseDir.remove(h);
    }
    
    public void updateHouse(House h, House u) {
        
        for(int i=0;i<houseDir.size();i++) {
            
            if (houseDir.get(i).equals(h)) {
                houseDir.set(i,u);
            }
        }
    }
    
}
