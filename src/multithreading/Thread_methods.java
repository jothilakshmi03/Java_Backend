package multithreading;

class mytthread extends Thread{
    @Override
    public void run(){
        for (int i=1;i<=4;i++){
            System.out.println("count : "+i+" "+Thread.currentThread().getName()+" Priority of the thread : "+getPriority()+" "+isAlive()+" "+getState());
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class Thread_methods {
    public static void main(String[] args) {
          mytthread t1=new mytthread();
          t1.setName("Thread A");
          t1.setPriority(10);
          t1.start();

        mytthread t2=new mytthread();
        t2.setName("Thread B");
        t2.setPriority(1);
        t2.start();

        mytthread t3=new mytthread();
        t3.setName("Thread C");
        t3.setPriority(5);
        System.out.println(t3.getState());
        t3.start();
    }
}
