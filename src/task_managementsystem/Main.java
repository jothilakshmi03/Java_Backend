package task_managementsystem;

import java.util.Scanner;

public class Main {
    // version 1
    //task add and view
    // task id,name
    public static void main(String[] args) {
        System.out.println("Welcome!");
        Scanner sc=new Scanner(System.in);
        Task_manager taskmanager=new Task_manager();
        boolean isRunning=true;
        while (isRunning){
            System.out.println("\n1.Add task\n2.View task\n0.Exit");
            System.out.println("Enter user choice: ");
            int userchoice= sc.nextInt();
            switch (userchoice){
                case 1:
                    taskmanager.addTask();
                    break;
                case 2:
                    taskmanager.viewTask();
                    break;
                    case 0:
                        isRunning=false;
            }
        }
        sc.close();
    }
}
