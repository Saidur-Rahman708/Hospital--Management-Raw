/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

/**
 *
 * @author User-PC
 */
public class Proffesor extends Doctor implements Idoctor{
    Proffesor(String doc_id, String doc_name){
        super(doc_id, doc_name);
    }
    String speciality;
String qualification;
    @Override
    public void get_hospital_details (){
    System.out.println("Enter hospital name " );    
   String hp_name = input.nextLine();
    System.out.println("Enter hospital Location ");
    String hp_location = input.nextLine();
}
 void proffesor_information(){
     
     System.out.println("Enter professor Speciality ");
   speciality = input.nextLine();
   
     System.out.println("Enter Doctor Qualification     ");
   qualification = input.nextLine();
 }
 
 void   patient_dises_info(NewPatient d1){
     System.out.println("Patient Id     "+d1.pa_id);
     System.out.println("Patient name   "+d1.pa_name);
     System.out.println("Patient dises are  "+d1.pa_dises);
     
     
    }
 void check_patient(NewPatient np1){
     System.out.println("proffesor checked this patient   "+np1);
 }
 void suggest_medicine(String medicine){
     System.out.println("Doctor suggest medicine that is "+medicine);
 }
}
