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
public class Canteen {
   


    public double subTotal;
double quantity;
    private  double itemPrice;
     boolean ordering = true;
     Scanner input = new Scanner(System.in);

    public  void menu() {
        System.out.println("Welcome \n1. Burger (200.00) \n2. Fries (150.00)\n3. Soda (100.00) \n4. Done");
    }

    public  double itemPrice(int foodItem) {
        if (foodItem == 1) {
      
            System.out.println("You've ordered a burger");
            itemPrice = 200.00;
        }
        if (foodItem == 2) {
          
            System.out.println("You've ordered fries");
            itemPrice = 150.00;
        }
        if (foodItem == 3) {
         
            System.out.println("You've ordered a soda");
            itemPrice = 100.00;
        }
  
        return itemPrice;
    }

    public double quantity() {
        System.out.println("Enter quantity");
        quantity = input.nextDouble();

        return quantity;
    }

    public  void subTotal() {
        double subTotal = quantity * itemPrice;
        System.out.println("Subtotal: " + subTotal);
         System.out.println("You have to pay"+subTotal);
System.out.println("Have a good day");
        
    }

   
}
