/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aphospital;

import java.util.List;

/**
 *
 * @author hamad
 */
public class TechnicalStaff extends Staff{

    public List<MemberOfTechnicalStaff> getLsTechStaffMem() {
        return lsTechStaffMem;
    }

    public void setLsTechStaffMem(List<MemberOfTechnicalStaff> lsTechStaffMem) {
        this.lsTechStaffMem = lsTechStaffMem;
    }
    List<MemberOfTechnicalStaff> lsTechStaffMem;

    public TechnicalStaff(List<MemberOfTechnicalStaff> lsTechStaffMem) {
        this.lsTechStaffMem = lsTechStaffMem;
    }
    
    public void addMem(MemberOfTechnicalStaff m){
        lsTechStaffMem.add(m);
    }

    @Override
    public void printStaff() {
        System.out.println("\n*****************************\nPrinting Technical Staff: ");
        for(MemberOfTechnicalStaff m: lsTechStaffMem){
            m.print();
        }
    }
    
}
