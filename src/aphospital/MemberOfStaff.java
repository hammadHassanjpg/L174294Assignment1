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
public class MemberOfStaff extends Person {
    private Date dateOfJoin;
    private String Education;
    public Date getDateOfJoin() {
        return dateOfJoin;
    }

    public void setDateOfJoin(Date dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String Education) {
        this.Education = Education;
    }


    public MemberOfStaff(String name, Date dob, String gender, Date dateOfJoin, String Education) {
        super(name, dob, gender);
        this.dateOfJoin = dateOfJoin;
        this.Education = Education;
    }
    
    
    public void print(){
        super.print();
        System.out.println("Date Of Join: " + this.dateOfJoin.toString());
        System.out.println("Education: " + this.Education);
    }
}
