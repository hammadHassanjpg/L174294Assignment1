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
public class FaisalHospital {
    private List<Staff> lsStaff;
    private List<Ward> lsWard;
    
    public FaisalHospital(){
        lsStaff = new ArrayList<Staff>();
        lsWard = new ArrayList<Ward>();
    }

    public FaisalHospital(List<Staff> lsStaff, List<Ward> lsWard) {
        this.lsStaff = lsStaff;
        this.lsWard = lsWard;
    }

    public List<Staff> getLsStaff() {
        return lsStaff;
    }

    public void setLsStaff(List<Staff> lsStaff) {
        this.lsStaff = lsStaff;
    }

    public List<Ward> getLsWard() {
        return lsWard;
    }

    public void setLsWard(List<Ward> lsWard) {
        this.lsWard = lsWard;
    }
    
    
    public void addWard(Ward w){
        lsWard.add(w);
    }
    
    public void addStaff(Staff s){
        lsStaff.add(s);
    }
    
    
    public void print(){
        for(Staff s: lsStaff){
            s.printStaff();
        }
        System.out.println("\nPrinting Wards in the Hospital");
        
        for(Ward w: lsWard){
            w.print();
        }
    }
    
}
