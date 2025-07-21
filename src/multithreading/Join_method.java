package multithreading;

class mythread_join  extends  Thread{
    @Override
    public void run() {

        System.out.println("thread started");
        for (int i=1;i<=5;i++){
            try {
                System.out.println(i+" user thread priority "+Thread.currentThread().getPriority());
                Thread.sleep(2000);

            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("thread finished ");
    }
}

public class Join_method {
    public static void main(String[] args) {
        mythread_join t1=new mythread_join();
        t1.start();

        mythread_join t2=new mythread_join();
        t2.start();

        System.out.println("main thread priority "+Thread.currentThread().getPriority());

        try {
            System.out.println("t2 is waiting for t1 to complete");
            t1.join();
            System.out.println("t2 is running");
        }catch (InterruptedException e){
            System.out.println(e);
        }

    }
}
