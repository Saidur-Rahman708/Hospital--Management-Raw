
package Hospital;


public class Admitted_patient extends Patient implements Ipatient{
  private String pa_admitId ;

    Admitted_patient(String pa_name, String pa_id,String pa_dises){
        super(pa_name,pa_id, pa_dises);
    } 
  
  @Override
    public void patient_details(){
         System.out.println("Patient Name    "+pa_name+"\nPatient Id    "+pa_id+"\nPatient problem  "+pa_dises);
         System.out.println("Enter patient age   ");
        age = input.nextLine();
       
        System.out.println("Enter patient admit id");
          pa_admitId   =input.nextLine();
         System.out.println("Enter patient phone number  ");
        pa_ph_number = input.nextInt();
    }

}
