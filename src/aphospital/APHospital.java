/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aphospital;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hamad
 */
public class APHospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creating wards
        Ward w1 = new SurgicalWard();
        Ward w2 = new OrthopedicWard();
        Ward w3 = new ChildrenWard();
        
        //Creating Medical Staff Members
        MemberOfMedicalStaff ms1 = new Doctor("1", "Knee Surgery", "DocName1", new Date(), "Male", new Date(), "MBBS");
        MemberOfMedicalStaff ms2 = new Doctor("2", "Brain", "DocName2", new Date(), "Female", new Date(), "PHD");
        MemberOfMedicalStaff ms3 = new Nurse("NuseName1", new Date(), "Male", new Date(), "Masters");
        
        //Creating Technical Staff Members
        MemberOfTechnicalStaff ts1 = new Technician("TechnicianName1", new Date(), "Female", new Date(), "Education1");
        MemberOfTechnicalStaff ts2 = new Technician("TechnicianName2", new Date(), "Female", new Date(), "Education2");
        MemberOfTechnicalStaff ts3 = new ScrubTech("ScrubTechName1", new Date(),  "Male", new Date(), "Education3");
        
        
        List<MemberOfMedicalStaff> lsMS = new ArrayList<MemberOfMedicalStaff>();
        lsMS.add(ms1);
        lsMS.add(ms2);
        lsMS.add(ms3);
        
        List<MemberOfTechnicalStaff> lsTS = new ArrayList<MemberOfTechnicalStaff>();
        lsTS.add(ts1);
        lsTS.add(ts2);
        lsTS.add(ts3);
        
        
        //Setting up staff
        Staff s1 = new MedicalStaff(lsMS);
        Staff s2 = new TechnicalStaff(lsTS);
        
        //Adding staff to wards
        w1.addStaff(s1);
        s1.addWard(w1);
        
        w2.addStaff(s2);
        w2.addStaff(s1);
        s2.addWard(w2);
        s1.addWard(w2);
        
        w3.addStaff(s2);
        w3.addStaff(s1);
        s2.addWard(w3);
        s2.addWard(w3);
        
        
        //Setting up the hospital
        FaisalHospital FH = new FaisalHospital();
        
        FH.addStaff(s1);
        FH.addStaff(s2);
        FH.addWard(w1);
        FH.addWard(w2);
        FH.addWard(w3);
        
        //Creating new Patients
        Patient p1 = new Patient("PatientName1", new Date(), "Male", "1");
        Patient p2 = new Patient("PatientName2", new Date(), "Male", "2");
        Patient p3 = new Patient("PatientName3", new Date(), "Female", "3");
        Patient p4 = new Patient("PatientName4", new Date(), "Male", "4");
        Patient p5 = new Patient("PatientName5", new Date(), "Female", "5");
        
        List<Patient> patientList = new ArrayList<Patient>();
        patientList.add(p1);
        patientList.add(p2);
        patientList.add(p3);
        patientList.add(p4);
        patientList.add(p5);
        
        int input = -1;

        Scanner in = new Scanner(System.in);
        
        while(input != 0){
            //Displaying the menu to user
            System.out.println("\n**********************************\nInput 1 to view all the data");
            System.out.println("Input 2 to visit doctor");
            System.out.println("Input 0 to EXIT\n");
            System.out.print("Input Here: ");


            input = in.nextInt();
            if(input == 1){
                FH.print();
            }
            else if(input==2){
                System.out.println("\n*************************************\nChoose a ward from following: ");
                for(int i = 0; i<FH.getLsWard().size(); i++){
                    System.out.println("Ward # " + i + ":");
                    FH.getLsWard().get(i).print();
                }
                
                System.out.print("Input Ward Number: ");
                int wardNum = in.nextInt();
                
                MedicalStaff currMS = null;
                System.out.println("\n**************************************\nThis ward has following doctors: ");
                for(Staff s: FH.getLsWard().get(wardNum).getLsStaff()){
                    if(s instanceof MedicalStaff){
                        MedicalStaff ms = (MedicalStaff) s;
                        
                        ms.printDocOnly();
                    }
                }
                in.nextLine();
                System.out.println("Input Doctor ID: ");
                String did = in.nextLine();
                
                for(Staff s: FH.getLsWard().get(wardNum).getLsStaff()){
                    if(s instanceof MedicalStaff){
                        MedicalStaff ms = (MedicalStaff) s;
                        
                        if(ms.docExists(did)){
                            currMS = ms;
                            break;
                        }

                    }
                }
                
                
                System.out.println("Choose a patient from the following hardcoded list of patients: \n");
                for(Patient p: patientList){
                    p.print();
                }
                System.out.println("\n********************************\nChoose Patient ID: ");
                String pid = in.nextLine();
                
                Patient chosenPatient = null;
                for(Patient p: patientList){
                    if(p.getPatientID().equals(pid)){
                        chosenPatient = p;
                        break;
                    }
                }
                
                if(chosenPatient == null || currMS == null || wardNum >= FH.getLsWard().size()){
                    System.out.println("*******************ERROR*************************");
                    System.out.println("THE INPUT WAS WRONG(EITHER WRONG PATIENT ID, WRONG DOCTOR ID, OR INCORRECT WARD NUMBER WAS ENTERED)");
                    
                }
                else{
                    boolean alreadyVisited = false;
                    
                    for(HospitalVisit h: currMS.getLsHV()){
                        if(h.getP().getPatientID().equals(chosenPatient.getPatientID()) && h.getDateOfVisit().getDate() == new Date().getDate()){   //Here new Date represents the date today
                            alreadyVisited = true;
                        }
                    }
                    
                    
                    if(!alreadyVisited){
                        HospitalVisit hv = new HospitalVisit(chosenPatient, currMS, new Date(), did);
                        currMS.addHospitalVisit(hv);
                        chosenPatient.addHospitalVisit(hv);
                        System.out.println(chosenPatient.getName() + " with " + chosenPatient.getPatientID() + " is allowed");
                    }
                    else{
                        System.out.println(chosenPatient.getName() + " with " + chosenPatient.getPatientID() + " has already visited today");
                    }
                }
            }
            
        }
    }
    
}
