/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

import java.util.Scanner;


public class Drug {
     
public double m_quantity;
    private  double m_itemPrice;
     boolean ordering = true;
     Scanner input = new Scanner(System.in);

    public  void drugItem() {
        System.out.println("Welcome what do you want \n 1. Napa (2.00) \n2. Tofen (150.00)\n3. Ribotril (1.00) \n4. Done");
    }

    public  double itemPrice(String medItem) {
        if ("Napa".equals(medItem)) {
      
            System.out.println("napa");
            m_itemPrice = 2.00;
        }
        if ("Tofen".equals(medItem)) {
          
            System.out.println("Tofen");
            m_itemPrice = 150.00;
        }
        if ("Ribotril".equals(medItem)) {
         
            System.out.println("Ribotril");
            m_itemPrice = 1.00;
        }
    if ("Done".equals(medItem)) {
         
            System.out.println("You've ordered nothing");
            m_itemPrice = 0.00;
        }
    
        return  m_itemPrice;
    }

    public double quantity() {
        System.out.println("Enter quantity");
        m_quantity = input.nextDouble();

        return m_quantity;
    }

    public  void total() {
        double total = m_quantity * m_itemPrice;
     
        System.out.println("You have to pay"+total);
System.out.println("Have a good day");
    
}
}
 
