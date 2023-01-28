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
public class Delux_room extends Room_type{
 String delux_type ;
 String delux_num = " 345gh";
 String s_delux_num = " S345gh";
String delux_info;
Delux_room(String room_type ,double room_price){
    super( room_type, room_price);
}
 void getInfo(String delux_type ){
   
        if("Super".equals(delux_type)){
            System.out.println("Special cavin");
            System.out.println(" cabin number  "+s_delux_num);
    
 
}
else{
            System.out.println("Normal Delux   ");
        System.out.println("Delux number "+delux_num);
        }
}
}
