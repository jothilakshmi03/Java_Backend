package multithreading;

class Daemon__thread extends Thread{
    @Override
    public void run(){
        if (isDaemon()) {
            System.out.println("its a daemon thread");
        } else {
            System.out.println("User thread");
        }
    }
}

public class Daemon_thread {
    public static void main(String[] args) {
        Daemon__thread t1=new Daemon__thread();
        Daemon__thread t2=new Daemon__thread();
        Daemon__thread t3=new Daemon__thread();
        t1.setDaemon(false);
        t2.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();

    }
}
