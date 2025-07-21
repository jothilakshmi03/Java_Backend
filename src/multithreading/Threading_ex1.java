package multithreading;

class thread extends Thread{
    @Override
    public void run(){ //only one method
        System.out.println("the thread is running "+ getId()+" "+Thread.currentThread().getName());
        System.out.println("displaying");
    }
//    public void display(){
//        System.out.println("hii");
//    }
}

public class Threading_ex1 {
    public static void main(String[] args) {
        thread t1=new thread();
        t1.start();

        thread t3=new thread();
        t3.start();


        thread t2=new thread();
        t2.start();
    }
}
