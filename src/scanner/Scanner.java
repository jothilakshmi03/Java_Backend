package scanner;

public class Scanner {
    public  static  void  main(String[]args){

//        SCANNER INTRO
        java.util.Scanner scan=new java.util.Scanner(System.in);
//        System.out.println("Enter the Name : ");
//        String name=scan.next();
//        System.out.println("Entered Name is : "+ name);

        int age=scan.nextInt();
        System.out.println("Age Entered is : "+age);
        scan.close();


    }
}
