package multithreading;

class mythread implements Runnable{
    @Override
    public void run(){
        System.out.println("runnable interface");
    }
}

public class Runnable_interface {
    public static void main(String[] args) {
        mythread t1=new mythread();
        Thread t2=new Thread(t1);
        t2.start();

    }
}
