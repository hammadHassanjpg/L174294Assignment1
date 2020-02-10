/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aphospital;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author hamad
 */
public class Patient extends Person{

    private String patientID;
    
    private List<HospitalVisit> lsHV;

    public Patient(String name, Date dob, String gender, String patientID) {
        super(name, dob, gender);
        this.patientID = patientID;
        lsHV = new ArrayList<HospitalVisit>();
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }
    
    public void addHospitalVisit(HospitalVisit hv){
        lsHV.add(hv);
    }

    public List<HospitalVisit> getLsHV() {
        return lsHV;
    }

    public void setLsHV(List<HospitalVisit> lsHV) {
        this.lsHV = lsHV;
    }
    
    public void print(){
        System.out.println("\nPrinting Patient:");
        System.out.println("Patient ID: " + this.patientID);
        super.print();
    }
    
}
