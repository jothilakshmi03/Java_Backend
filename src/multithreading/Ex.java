package multithreading;

import java.util.Scanner;

class Sleep_thread extends Thread{
    @Override
    public void run(){
        while (!Thread.currentThread().isInterrupted()){
            System.out.println("Running..");
        }
        System.out.println("The Thread was Interrupted");
    }
}

public class Ex {
    public static void main(String[] args) {
         Sleep_thread t1=new Sleep_thread();
         t1.start();
         try {
             Thread.sleep(1500);
         }catch (InterruptedException e){
             System.out.println(e);
         }
         t1.interrupt();
    }
}
