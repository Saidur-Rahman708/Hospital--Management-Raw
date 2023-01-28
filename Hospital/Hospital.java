
package Hospital;


public class Hospital {

  
    public static void main(String[] args) {
 
    
NewPatient Ridoy = new NewPatient("Ridoy" , "193R", "kidney");
NewPatient Mukim = new NewPatient("Mukim" , "31R", "Mental Health");
Ridoy.patient_details();

Admitted_patient Mustafizur = new Admitted_patient("fizz" , "193F", "leg break ");
Mustafizur.patient_details();

 Duty_doctor Riaz = new  Duty_doctor("2953R", "Riaz paatwary");
 Riaz.get_hospital_details();
 Riaz.check_patient(Ridoy);
 Riaz.suggest_medicine("Rocal D");
 
 Proffesor Rayna = new Proffesor("2930R","Rukya Sohrab Rayna");
 Rayna.get_hospital_details();
 Rayna.proffesor_information();
 Rayna.patient_dises_info(Mukim);
 Rayna.check_patient(Mukim);
 Rayna.suggest_medicine("Clozaril");

 //Surgeon Annoy = new Surgeon("30A","Shahariar Hayder");
 //Annoy.surgeon_info();
 
 SampleCollectingTest Marzia = new SampleCollectingTest("CBC","675");
Marzia.patient_info_test(Ridoy);

Machine_readable_test Anu = new Machine_readable_test("X-Ray","875");
Anu.patient_info_test(Ridoy);
 
 Nurse Namira = new Nurse("2929N","Munjarina islam Namira");
 Namira.get_info();
 Namira.nursePost("ICU");
 
 Word_boy Sifat = new Word_boy("2923","tanveem Rezwan");
 Sifat.get_info();
 Sifat.word_boy_Post("CCU");
 
  Accountants Parvez = new  Accountants();
  Parvez.get_iaccount_info();
  Parvez.take_payment( Mustafizur, 1000.00);
  Parvez.discharge();
 
  
  
  New_Patient_appoinment obj= new New_Patient_appoinment("5th March","2021",Ridoy);
  
  Admitted_patient_appoinment obj2 = new Admitted_patient_appoinment("7th jan","2020",Mustafizur);
  
  Adminstrator Aron = new Adminstrator();
  Aron.give_new_patient_appoinment(obj);
  Aron.give_new_admitted_patient_appoinment(obj2);
  Aron.patient_appoinment_to_doctor(Riaz, obj);
  Cabin Ca = new Cabin("normal",4500);
  Ca.getInfo("Super");
  
  Delux_room Dlux = new Delux_room("Delux type",8500);
  Dlux.getInfo("Super");
  
  
  
 Canteen Diu = new Canteen();
 Diu.menu();
 Diu.itemPrice(3);
 Diu.quantity();
 Diu.subTotal();
 
 Drug Arnob = new Drug();
 Arnob.drugItem();
 Arnob.itemPrice("Napa");
 Arnob.quantity();
 Arnob.total();
 
 


   }
    
}
