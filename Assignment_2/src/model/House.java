/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import model.PersonDir;

/**
 *
 * @author hrish
 */
public class House {
    private PersonDir personDir;
    private String houseID;
    private String houseNum;
    private String street;
    private String zipCode;

    public PersonDir getPersonDir() {
        return personDir;
    }

    public void setPersonDir(PersonDir personDir) {
        this.personDir = personDir;
    }

    public String getHouseID() {
        return houseID;
    }

    public void setHouseID(String houseID) {
        this.houseID = houseID;
    }
    
    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
       
}
