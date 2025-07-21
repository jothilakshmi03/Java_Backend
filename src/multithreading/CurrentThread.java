package multithreading;

class th extends Thread{
    public void run(){
        System.out.println(Thread.currentThread());
    }
}

public class CurrentThread {
    public static void main(String[] args) {
        th t=new th();
        t.start();
        System.out.println(t.getPriority());   //normal priority value=5
        System.out.println(t.getName());
    }
}
