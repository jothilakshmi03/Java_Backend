package multithreading;


class Restaurant{
    private boolean foodReady = false;

    public synchronized void waitForFood(){
        System.out.println("Customer is waiting for the food");

        while (!foodReady) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("customer is eating after receiving");
    }

    public synchronized void serveFood(){
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        foodReady = true;
        System.out.println("chef is notifying the customer");
        notify();
    }

}

class CustomerThread extends Thread{

    Restaurant restaurant;

    public CustomerThread(Restaurant restaurant){
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        restaurant.waitForFood();
    }
}

class ChefThread extends Thread{

    Restaurant restaurant;

    public ChefThread(Restaurant restaurant){
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        restaurant.serveFood();
    }
}


public class Wait_method {
    public static void main(String[] args){
        Restaurant restaurant = new Restaurant();

        CustomerThread customer = new CustomerThread(restaurant);
        ChefThread chef = new ChefThread(restaurant);

        customer.start();
        chef.start();
    }
}
