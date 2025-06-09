package constructor;

import java.sql.SQLOutput;

class Car_showroom{
    public String brand;
    public double price;
    public String color;

    public void carDetails(){
        System.out.println("the "+color+" "+ brand +" price is "+price);
    }

    Car_showroom(){
          brand="Lamborghini";
          color="Yellow";
          price=200000.00d;
    }
}



public class No_argConstructor {
    public static void main(String[]args) {

        Car_showroom car=new Car_showroom();
        car.color="black";
        car.carDetails();

    }
}
