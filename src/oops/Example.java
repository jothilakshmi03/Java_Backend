package oops;

class Car{
    // non static variable
    int year=2015;
    static  String model="KIA";

    //static method
    public static void dis(Car c1){

        // creating an instance of  car class
//        Car c=new Car();

        // access the non-static variable through object
        System.out.println(c1.year+" "+model);
    }
}


public class Example {
    public static void main(String[]args){
        Car c=new Car();
        Car.dis(c);  // call the dis method
        Car d=new Car();
        d.year=2012;
        Car.dis(d);
    }
}
