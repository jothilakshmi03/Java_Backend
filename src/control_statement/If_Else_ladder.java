package control_statement;


import java.util.Scanner;

public class If_Else_ladder {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Age : ");
        int age=s.nextInt();
        if(age<=5){
            System.out.println("infant");
        } else if (age>5&&age<10) {
            System.out.println("kid");
        } else if (age>10&&age<20) {
            System.out.println("Teenager");
        } else if (age>20&&age<35) {
            System.out.println("Adult");
        } else if (age>35&&age<55) {
            System.out.println("Middle age");
        }
        else{
            System.out.println("Senior citizen");
        }
    }
}
