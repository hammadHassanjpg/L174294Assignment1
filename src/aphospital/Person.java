/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aphospital;

import java.util.Date;

/**
 *
 * @author hamad
 */
public class Person {
    
    private String name;
    private Date dob;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public Person(String name, Date dob, String gender) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }
    
    public void print(){
        System.out.println("Name: " + this.name);
        System.out.println("DOB: " + this.dob.toString());
        System.out.println("Gender: " + this.gender);
    }
    
}
