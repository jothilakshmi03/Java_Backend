package multithreading;

class ThreadEx extends Thread{
    public void run(){
        for(int i=1;i<4;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class JoinEx2 {
    public static void main(String[] args) {
        ThreadEx t1=new ThreadEx();
        t1.setName("thread A");
        t1.start();

        ThreadEx t2 =new ThreadEx();
        t2.setName("thread B");
//        t2.start();

        try {
            t1.join();   //wait until current thread execution completes
        }catch (InterruptedException e){
            System.out.println(e);
        }
        t2.start();
        System.out.println("main thread is executing");
    }
}
