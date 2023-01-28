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
abstract public class Room_type {
 
String room_type ;
double room_price;
Scanner input = new Scanner(System.in);
Room_type(String room_type ,double room_price){
    
    this.room_type = room_type;
    this.room_price = room_price;
}
abstract void getInfo(String d);
}
