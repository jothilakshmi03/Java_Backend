package abstraction;

abstract class Vehicle{
    String brand;

    Vehicle(String brand){
        this.brand=brand; // constrctor
    }
    abstract void fuelType();

    void start(){
        System.out.println("this "+brand+" is starting");
    }
}

class car extends Vehicle{
    car(String brand) {
        super(brand);
    }

    void fuelType(){
        System.out.println("it uses petrol");

    }
}
class Scooty extends Vehicle{
    Scooty(String brand) {
        super(brand);
    }

    void fuelType(){
        System.out.println("it uses diesel");

    }
}

public class Abstract_ex2 {
    public static void main(String[] args) {
        Vehicle obj=new car("bmw");
        obj.start();
        obj.fuelType();

        Vehicle obj2=new Scooty("pept");
        obj2.fuelType();
    }
}
