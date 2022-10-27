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
public class UserAuthDir {
    
    private ArrayList<UserAuth> userAuthDir;

    public UserAuthDir() {
        this.userAuthDir = new ArrayList<UserAuth>();
    }

    public ArrayList<UserAuth> getUserAuthDir() {
        return userAuthDir;
    }

    public void setUserAuthDir(ArrayList<UserAuth> userAuthDir) {
        this.userAuthDir = userAuthDir;
    }
    
    public UserAuth addNewUserAuth() {
        UserAuth u = new UserAuth();
        userAuthDir.add(u);
        return u;
    }
    
    public void deleteUserAuth(UserAuth c) {
        userAuthDir.remove(c);
    }
    
    public void updateUserAuth(UserAuth c, UserAuth u) {
        
        for(int i=0;i<userAuthDir.size();i++) {
            
            if (userAuthDir.get(i).equals(c)) {
                userAuthDir.set(i,u);
            }
        }
    }
    
    
    
}
