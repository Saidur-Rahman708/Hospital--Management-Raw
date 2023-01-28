/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;



public class Word_boy extends Staff{
    String word_name;
    String word_fl;
     Word_boy(String s_Id ,String name){
    super(s_Id  , name);
            }
     public void get_info(){
         System.out.println("word name      ");
            word_name = input.nextLine();
         System.out.println("word flore name        ");
           word_fl = input.nextLine();
            
}
     public void word_boy_Post(String post_of_wb){
    System.out.println("Post of word boy is"+post_of_wb);
}
}
