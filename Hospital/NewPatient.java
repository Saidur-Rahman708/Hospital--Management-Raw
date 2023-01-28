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
public class NewPatient extends Patient implements Ipatient{
     
        
    String pa_card_info ;
String pa_nationality ;
   NewPatient(String pa_name, String pa_id,String pa_dises){
        super(pa_name,pa_id,pa_dises);
        
        
    }
    @Override
    public void patient_details(){
        
        System.out.println("Enter age,Card information , Nationality, and phone number,");
       
        System.out.println("Enter  patient age     ");
          age = input.nextLine();
       
        System.out.println("Enter Patient Card information      ");
      pa_card_info   =input.nextLine();
        
        System.out.println("Enter patient Nationality   ");
         pa_nationality   =input.nextLine();
         
           System.out.println("Enter patient phone number  ");
         pa_ph_number = input.nextInt();
    }
}

