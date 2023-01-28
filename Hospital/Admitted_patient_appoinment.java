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
public class Admitted_patient_appoinment extends Appoinment{
    Admitted_patient ap1;
 private    String ph_number;
       Admitted_patient_appoinment(String app_date, String app_time,    Admitted_patient ap1){
           System.out.println("Patient name "+ap1+"patient appoinment date and time "+app_date+""+app_time);
          
     }
}
