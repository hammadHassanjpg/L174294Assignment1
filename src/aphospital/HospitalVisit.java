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
public class HospitalVisit {
    
    private Patient p;
    private MedicalStaff ms;
    private Date dateOfVisit;
    private String DocID;

    public HospitalVisit(Patient p, MedicalStaff ms, Date dateOfVisit, String DocID) {
        this.p = p;
        this.ms = ms;
        this.dateOfVisit = dateOfVisit;
        this.DocID = DocID;
    }

    public String getDocID() {
        return DocID;
    }

    public void setDocID(String DocID) {
        this.DocID = DocID;
    }
    
    

    public Patient getP() {
        return p;
    }

    public void setP(Patient p) {
        this.p = p;
    }

    public MedicalStaff getMs() {
        return ms;
    }

    public void setMs(MedicalStaff ms) {
        this.ms = ms;
    }

    public Date getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(Date dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }


    public void print(){
        System.out.println("Printing Hospital Visit: ");
        System.out.println(p.getName() + " with ID " + p.getPatientID() + "visited the hospital on " + dateOfVisit.toString());
    }
    
    
}
