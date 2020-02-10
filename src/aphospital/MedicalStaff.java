/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aphospital;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hamad
 */
public class MedicalStaff extends Staff{
    private List<MemberOfMedicalStaff> lsMedStaff;

    private List<HospitalVisit> lsHV;
    
    
    public MedicalStaff(List<MemberOfMedicalStaff> lsMedStaff) {
        this.lsMedStaff = lsMedStaff;
        lsHV = new ArrayList<HospitalVisit>();
    }

    public List<MemberOfMedicalStaff> getLsMedStaff() {
        return lsMedStaff;
    }

    public void setLsMedStaff(List<MemberOfMedicalStaff> lsMedStaff) {
        this.lsMedStaff = lsMedStaff;
    }


    public void addMedStaffMem(MemberOfMedicalStaff m){
        lsMedStaff.add(m);
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

    @Override
    public void printStaff() {
        System.out.println("\n*****************************\nPrinting Medical Staff: ");
        for(MemberOfMedicalStaff m: lsMedStaff){
            m.print();
        }
        System.out.println("\n*****************************\nPrinting Patient Visits Handled By This Medical Staff: ");
        for(HospitalVisit hv: lsHV){
            hv.print();
        }
    }
    
    public boolean docExists(String docID){
        boolean toRet = false;
        for(MemberOfMedicalStaff m: lsMedStaff){
            if(m instanceof Doctor){
                Doctor doc = (Doctor) m;
                if(doc.getDocID().equals(docID)){
                    toRet = true;
                }
            }
        }
        return toRet;
    }
    
    public void printDocOnly(){
    
        System.out.println("\n*****************************\nPrinting Doctors in Staff:");
        for(MemberOfMedicalStaff m: lsMedStaff){
            if(m instanceof Doctor){
                ((Doctor) m).print();
            }
        }
    }
    
    
}
