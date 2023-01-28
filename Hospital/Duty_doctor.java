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
public class Duty_doctor extends Doctor implements Idoctor {
    Duty_doctor(String doc_id,String doc_name){
        super(doc_id,doc_name);
    }
 int duty_time;
 String hp_name;
 String hp_location;

    
    @Override
    public void get_hospital_details (){
    System.out.println("Enter hospital name " );    
    hp_name = input.nextLine();
    System.out.println("Enter hospital Location ");
    hp_location = input.nextLine();
}
public void check_patient (NewPatient np1){
  System.out.println("Doctor check this patient" +np1.pa_name);
}
 void suggest_medicine(String medicine){
     System.out.println("Doctor suggest medicine that is "+medicine);
 }
}
