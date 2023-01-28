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
public class Cabin extends Room_type{
   String s_cabin_num ="2345Sup";
    String cabin_type;
    String cabin_num="c456";
Cabin(String room_type ,double room_price){
    super(room_type, room_price);
    System.out.println("Room price per day  "+room_price);
}
    public void getInfo( String cabin_type){
        if("Super".equals(cabin_type)){
            System.out.println("Special cavin");
            System.out.println(" cabin number  "+s_cabin_num);
    
        }
        else{
            System.out.println("Normal cavinn   ");
        System.out.println("cabin num "+cabin_num);
        }
        
    }

}
