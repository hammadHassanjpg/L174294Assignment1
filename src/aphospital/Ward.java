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
public abstract class Ward {
    private List<Staff> lsStaff;


    
    public Ward(){
        lsStaff = new ArrayList<Staff>();
    }

    public List<Staff> getLsStaff() {
        return lsStaff;
    }

    public void setLsStaff(List<Staff> lsStaff) {
        this.lsStaff = lsStaff;
    }

    public void addStaff(Staff s){
        lsStaff.add(s);
    }
    
    public abstract void print();
    
    
}
