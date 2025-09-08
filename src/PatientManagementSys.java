import java.util.ArrayList;
import java.util.Scanner;

public class PatientManagementSys {
    public static ArrayList<Patient> patients=new ArrayList<>();
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("========> Patient Management System <======= ");
        int choice;
        do {
            System.out.println("1. Add Patient");
            System.out.println("2. View Patient Details");
            System.out.println("3. Update Patient Details");
            System.out.println("4. Delete Patient Details");
            System.out.println("5. Exiting.....");
            System.out.print("Enter choice: ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    Patient.addPatient();
                    break;
                case 2:
                    Patient.viewPatient();
                    break;
                case 3:
                    Patient.updatePatient();
                    break;
                case 4:
                    Patient.deletePatient();
                    break;
                case 5:
                    System.out.println("Exiting....Goodbye!!");
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }
        while (choice != 5);

    }
}

class Patient {
    private static String name;
    private static int id;
    private static String disease;
    private static int age;
    static Scanner scan = new Scanner(System.in);


    //constructor for patient details

    public Patient(int id,String name, String disease, int age) {
        this.name = name;
        this.id = id;
        this.disease = disease;
        this.age = age;
    }
      // Getter

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getDisease() {
        return disease;
    }
    public int getAge() {
        return age;
    }

    // Setter

    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }
    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public String toString(){
//        return "Patient Id : "+id+", Patient Name : "+name+", Name of the Disease : "+disease+", Patient Age : "+age;
//    }
 // methods
    public static void addPatient(){
        System.out.println("Enter id number: ");
        int id=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the Name: ");
        String name=scan.nextLine();
        System.out.println("Enter the disease: ");
        String disease=scan.nextLine();
        System.out.println("Enter the age: ");
        int age=scan.nextInt();
        scan.nextLine();


        PatientManagementSys.patients.add(new Patient(id,name,disease,age));
        System.out.println("Patient is Added Successfully");

    }
    public static void viewPatient(){
        if(PatientManagementSys.patients.isEmpty()){
            System.out.println("There is no Patients");
        }else {
            System.out.println("patients List");
            for(Patient p: PatientManagementSys.patients){
                System.out.println(p);
            }
            System.out.println("Patient Id : "+id+", Patient Name : "+name+", Name of the Disease : "+disease+", Patient Age : "+age);
        }
    }
    public static void updatePatient(){
        System.out.println("Enter Patient Id to update: ");
        int id=scan.nextInt();
        scan.nextLine();
        for (Patient p: PatientManagementSys.patients){
            if(p.getId()==id){
                System.out.println("Enter new name: ");
                p.setName(scan.nextLine());
                System.out.println("Enter new Age: ");
                p.setAge(scan.nextInt());
                scan.nextLine();
                System.out.println("Enter the new Disease: ");
                p.setDisease(scan.nextLine());
                System.out.println("Patient details updated Successfully");
            }
            else {
                System.out.println("patient id doesn't match");
            }
        }

    }
    public static void deletePatient(){
        System.out.println("Enter patient id to delete: ");
        int id = scan.nextInt();

        boolean removed = PatientManagementSys.patients.removeIf(p -> p.getId() == id);

        if(removed){
            System.out.println("Patient details deleted successfully");
        } else {
            System.out.println("Patient not found");
        }
    }

}








