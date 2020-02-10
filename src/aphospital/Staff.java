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
public abstract class Staff {
    List<Ward> lsWard;

    public Staff(List<Ward> lsWard) {
        this.lsWard = lsWard;
    }

    public List<Ward> getLsWard() {
        return lsWard;
    }

    public void setLsWard(List<Ward> lsWard) {
        this.lsWard = lsWard;
    }
    
    public Staff(){
        lsWard = new ArrayList<Ward>();
    }
    
    public void addWard(Ward w){
        lsWard.add(w);
    }
    
    
    public abstract void printStaff();
    
}
