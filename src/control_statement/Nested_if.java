package control_statement;

import java.util.Scanner;

public class Nested_if {
    public static void main(String[]args){
//        int age=34;
//        if(age>17){
//            System.out.println("eligible to vote");
//            if(age>60){
//                System.out.println("Senior citizen");
//            }
//            else{
//                System.out.println("not a senior citizen");
//            }
//        }
//        else{
//            System.out.println("Not eligible to vote");
//        }

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age=s.nextInt();
        if(age<=7){
            System.out.println("you'll get 10% discount");
        } else if (age<20&&age>7) {
            System.out.println("you'll get 15% discount");
        } else if (age<40&&age>20) {
            System.out.println("you'll get 20% discount");
        } else {
            System.out.println("you'll get 25% discount");
        }
    }
}
