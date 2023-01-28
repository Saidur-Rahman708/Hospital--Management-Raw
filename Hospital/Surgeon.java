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
public class Surgeon extends Doctor{
    String su_qualification;
       Surgeon(String doc_id,String doc_name){
        super(doc_id,doc_name);
    }
       public void surgeon_info(){
           System.out.println("Enter surgeon qualification  ");
           su_qualification = input.nextLine();
       }
}
