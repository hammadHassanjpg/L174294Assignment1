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
public class Doctor extends MemberOfMedicalStaff{
    
    private String docID;
    private String speciality;
    
    public Doctor(String docID, String speciality, String name, Date dob, String gender, Date dateOfJoin, String Education) {
        super(name, dob, gender, dateOfJoin, Education);
        this.docID = docID;
        this.speciality = speciality;
    }

    public String getDocID() {
        return docID;
    }

    public void setDocID(String docID) {
        this.docID = docID;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    
    
    public void print(){
        System.out.println("\nPrinting Doctor");
        
        System.out.println("ID: " + docID);
        System.out.println("Speciality: " + speciality);
        super.print();
    }
    
}
