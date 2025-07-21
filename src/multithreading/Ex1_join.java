package multithreading;

import static java.lang.Character.getName;

class join1 extends  Thread{
    @Override
    public void run(){
        System.out.println("thread a is started : "+getName());
        try{
            Thread.sleep(1500);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Thread a finished "+getName());
    }
}
class join2 extends Thread{
    Thread jointhread;
    public join2(Thread jointhread){
        this.jointhread=jointhread;
    }
    @Override
    public void run(){
        System.out.println("thread b is started : "+getName());
        try {
            System.out.println("thread b is started : "+getName());
            System.out.println("thread b is waiting for thread a : "+jointhread.getName());
            jointhread.join();
            System.out.println("thread b is resumed");
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("thread a finished "+getName());
    }

}

public class Ex1_join {
    public static void main(String[] args) {
          join1 t=new join1();
          join2 t1=new join2(t);

          t.setName("thread a");
          t1.setName("thread b");
          t.start();
          t1.start();
    }
}
