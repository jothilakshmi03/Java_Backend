package control_statement;

import java.util.Scanner;

public class Control {
    public static  void  main(String[]args){
        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter the Mark : ");
//        int mark=scan.nextInt();
//        if (mark>40){
//            System.out.println("passed");
//        }
//        else{
//            System.out.println("failed");
//        }
//        System.out.println("Enter the Age : ");
//        int age=scan.nextInt();
//        if(age>18){
//            System.out.println("Major");
//        }
//        else{
//            System.out.println("Minor");
//        }
        System.out.println("Enter the Age : ");
        int age=scan.nextInt();
        if(age>60){
            System.out.println("Senior citizen");
        }
        else{
            System.out.println("Not a Senior citizen");
        }
        scan.close();
    }
}
