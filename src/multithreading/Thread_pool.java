package multithreading;

//it is a group of pre-created threads, and these threads are reusable whenever we want
//this thread will not terminate


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_pool {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(3);
        ExecutorService executor1= Executors.newSingleThreadExecutor();  //only one thread created
        ExecutorService executor2= Executors.newCachedThreadPool();


        for(int i=1;i<=7;i++){
            Runnable task=new workerTask("task : "+i);
            executor.execute(task);
        }

        System.out.println("for loop finished");
        for(int i=8;i<=12;i++){
            Runnable task=new workerTask("task : "+i);
            executor.execute(task);
        }
        executor.shutdown();
    }
    static class workerTask implements Runnable{
        private  String taskName;

        workerTask(String Name){
            this.taskName= Name;
        }
        @Override
        public void run(){
            System.out.println(taskName+" is executing by "+Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(taskName+" is completed by "+Thread.currentThread().getName());
        }
    }
}
