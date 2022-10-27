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
public class Community {
    
    private HouseDir houseDir;
    private HospitalDir hospitalDir;
    private String communityName;
    private String majorityReligion;
    private String communityType;

    public HouseDir getHouseDir() {
        return houseDir;
    }

    public void setHouseDir(HouseDir houseDir) {
        this.houseDir = houseDir;
    }

    public HospitalDir getHospitalDir() {
        return hospitalDir;
    }

    public void setHospitalDir(HospitalDir hospitalDir) {
        this.hospitalDir = hospitalDir;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getMajorityReligion() {
        return majorityReligion;
    }

    public void setMajorityReligion(String majorityReligion) {
        this.majorityReligion = majorityReligion;
    }

    public String getCommunityType() {
        return communityType;
    }

    public void setCommunityType(String communityType) {
        this.communityType = communityType;
    }
    
    
    
}
