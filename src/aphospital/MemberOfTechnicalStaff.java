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
public class MemberOfTechnicalStaff extends MemberOfStaff{
    
    public MemberOfTechnicalStaff(String name, Date dob, String gender, Date dateOfJoin, String Education) {
        super(name, dob, gender, dateOfJoin, Education);
    }
    
}
