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
public class Machine_readable_test extends Test{
   Machine_readable_test(String test_name,String test_id){
        super(test_name,test_id);
    }
   public void patient_info_test(NewPatient n1){
       System.out.println("Patient information to do test is "+n1.pa_id);
       System.out.println("Patient information to do test is "+n1.pa_name);
       
   }
   public void getinfo(double t_price){
       System.out.println("test price of xray is 500bdt");
   }
   public void getinfo(){
     
   }
}
