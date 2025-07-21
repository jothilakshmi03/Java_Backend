package multithreading;

import java.util.Scanner;

class Sleepingthread extends Thread{
    @Override
    public void run(){
        Scanner s=new Scanner(System.in);
        try{
            System.out.println("Thread is going to sleep");
            int sample_thread=s.nextInt();
            Thread.sleep(2500);
            System.out.println("the thread is woke up");
        }catch (Exception e){
            System.out.println("Exception caught becoz thread is interupted");
            System.out.println(e);
        }

    }
}

public class interupted_exception {
    public static void main(String[] args) {  // main method itself a thread don't need to extend thread
        Sleepingthread t1=new Sleepingthread();
        t1.start();
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("main thread is interrupting the thread");
        //t1.interrupt();


    }
}
