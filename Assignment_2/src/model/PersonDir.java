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
public class PersonDir {
    
    private ArrayList<Person> personDir;

    public PersonDir() {
        this.personDir = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonDir() {
        return personDir;
    }

    public void setPersonDir(ArrayList<Person> personDir) {
        this.personDir = personDir;
    }
    
    public Person addNewPerson() {
        Person p = new Person();
        personDir.add(p);
        return p;
    }
    
    public void deletePerson(Person p) {
        personDir.remove(p);
    }
    
    public void updatePerson(Person p, Person u) {
        
        for(int i=0;i<personDir.size();i++) {
            
            if (personDir.get(i).equals(p)) {
                personDir.set(i,u);
            }
        }
        
    }
    
}
