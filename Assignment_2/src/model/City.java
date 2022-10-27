/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hrish
 */
public class City {
    
    private CommunityDir communityDir;
    private String cityName;
    private String state;

    public CommunityDir getCommunityDir() {
        return communityDir;
    }

    public void setCommunityDir(CommunityDir communityDir) {
        this.communityDir = communityDir;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
}
