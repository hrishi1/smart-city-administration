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
public class CommunityDir {
    
    private ArrayList<Community> communityDir;

    public CommunityDir() {
        this.communityDir = new ArrayList<Community>();
    }

    public ArrayList<Community> getCommunityDir() {
        return communityDir;
    }

    public void setCommunityDir(ArrayList<Community> communityDir) {
        this.communityDir = communityDir;
    }
    
    public Community addNewCommunity() {
        Community h = new Community();
        communityDir.add(h);
        return h;
    }
    
    public void deleteCommunity(Community c) {
        communityDir.remove(c);
    }
    
    public void updateCommunity(Community c, Community u) {
        
        for(int i=0;i<communityDir.size();i++) {
            
            if (communityDir.get(i).equals(c)) {
                communityDir.set(i,u);
            }
        }
    }
    
}
