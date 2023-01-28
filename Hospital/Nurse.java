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
public class Nurse extends Staff{
    Nurse(String s_Id ,String name){
    super(s_Id  , name);
            }
    String q_fication;
String speciality ;
public void get_info (){
       System.out.println("Enter nurse qualifiation ");
            q_fication = input.nextLine();
         System.out.println("Enter nurse speciality ");
           speciality = input.nextLine();
}
public void nursePost(String post_of_nurse){
    System.out.println("Nurse post is"+post_of_nurse);
}
}
