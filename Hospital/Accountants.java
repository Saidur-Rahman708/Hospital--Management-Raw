/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

import java.util.Scanner;

/**
 *
 * @author User-PC
 */
public class Accountants {
    Scanner input = new Scanner(System.in);
    String ac_Id ="1934g";
 String ac_name = "Suvasis";
 int ac_ph ;
double payment;
double full_pay;

public void get_iaccount_info(){
    System.out.println("Enter accounted id");
   // ac_Id = input.nextLine();
      System.out.println("Enter accounted name  ");
   // ac_name = input.nextLine();
      System.out.println("Enter accounted phone number  ");
   ac_ph = input.nextInt();
}
public void take_payment( Admitted_patient ap1,double payment){
    System.out.println("Admitted patient "+ap1.pa_id+"will pay "+payment);
    System.out.println("patient need to pay     ");
    full_pay = input.nextDouble();
    System.out.println("Customer paid "+full_pay);
}
public void  discharge(){
    if(full_pay == payment){
        System.out.println("Patient will discharge");
    }
}
}
