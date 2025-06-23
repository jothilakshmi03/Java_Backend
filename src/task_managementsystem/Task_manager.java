package task_managementsystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        Date dueDate=null;
        while (dueDate==null){
            dueDate=getDate();
        }
        tasks.put(++idCounter,new Task(idCounter,name,description,dueDate));
        System.out.println("Task added successfully");
    }
    private Date getDate(){
        System.out.println("enter due date: (dd-mm-yyyy)");
        String strDate=sc.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        try{
            Date date=dateFormat.parse(strDate);
            if(date.before(new Date())){
                System.out.println("please enter the future date");
                return null;
            }
            return date;
        }catch (ParseException e){
            System.out.println("date is invalid!please enter the valid date");
        }
        return null;
    }
    public void viewTask(){
        for(Map.Entry<Integer,Task>task: tasks.entrySet()){
            System.out.printf("%-2d. %-8s | Description : %-10s | Due Date : %-10s\n",task.getKey(),task.getValue().getTaskname(),
                    task.getValue().getTaskDescription(),dateTostring(task.getValue().getDuedate()));
        }
    }
    private String dateTostring(Date dueDate){
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(dueDate);
    }
}


