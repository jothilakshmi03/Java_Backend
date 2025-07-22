package multithreading;

class thread_Class extends Thread{
    private String threadname;
    private Object lock;

    public thread_Class(String threadname,Object lock){
        this.threadname=threadname;
        this.lock=lock;

    }
//    public synchronized void printDoc(){
//        int pages=5;
//        for (int i=1;i<=pages;i++){
//            System.out.println(threadname+" Print pages : "+i);
//            try {
//                Thread.sleep(1500);
//            }catch (InterruptedException e){
//                System.out.println(e);
//            }
//        }
//    }
    @Override
    public void run(){
//       printDoc();
        synchronized (lock){
            int pages=5;
        for (int i=1;i<=pages;i++){
            System.out.println(threadname+" Print pages : "+i);
            try {
                Thread.sleep(1500);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
        }
    }
}


public class SyncronizedMethod {
    public static void main(String[] args) {
        Object lock=new Object();
       thread_Class t1=new thread_Class("thread 1",lock);
       thread_Class t2=new thread_Class("thread 2",lock);
       t1.start();
       t2.start();
    }
}
