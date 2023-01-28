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
public class Patient {
    
    public String pa_name;
   public String pa_id;
	 String age;
	public int pa_ph_number;
public String pa_dises;
    Scanner input = new Scanner(System.in);    
	public Patient() {
	}

	
	
	public Patient(String pa_name, String pa_id,String pa_dises  ) {
		this. pa_name= pa_name;
		this.pa_id = pa_id;
                this.pa_dises = pa_dises;
		
	}
   
}
