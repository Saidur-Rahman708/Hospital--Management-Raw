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
public class New_Patient_appoinment extends Appoinment{
     NewPatient np;
     String patient_db;
     New_Patient_appoinment(String app_date,String app_time, NewPatient np){
  System.out.println("Patient name "+np+"patient appoinment date and time "+app_date+""+app_time);
     }
     
}
