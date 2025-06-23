package task_managementsystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_manager {
    private  Map<Integer,Task> tasks=new HashMap<>();
    int idCounter=0;
    Scanner sc=new Scanner(System.in);


    public void addTask(){
        System.out.println("Enter task name: ");
        String name=sc.nextLine();
        System.out.println("Enter task description :");
        String description=sc.nextLine();
        tasks.put(++idCounter,new Task(idCounter,name,description));
        System.out.println("Task added successfully");
    }
    public void viewTask(){
        for(Map.Entry<Integer,Task>task: tasks.entrySet()){
            System.out.printf("%-2d. %-8s | Description : %-10s\n",task.getKey(),task.getValue().getTaskname(),
                    task.getValue().getTaskDescription());
        }
    }
}
