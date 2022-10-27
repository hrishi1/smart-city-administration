/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.*;

/**
 *
 * @author hrish
 */
public class EncounterHistory {
    
    private ArrayList<Encounter> encounterHistory;
    
    public EncounterHistory() {
        this.encounterHistory = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public Encounter addNewEncounter() {
        Encounter e = new Encounter();
        encounterHistory.add(e);
        return e;
    }
    
    public void deleteEncounter(Encounter e) {
        encounterHistory.remove(e);
    }
    
    public void updateEncounter(Encounter e, Encounter u) {
        
        for(int i=0;i<encounterHistory.size();i++) {
            
            if (encounterHistory.get(i).equals(e)) {
                encounterHistory.set(i,u);
            }
        }
    }
}
