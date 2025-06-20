package abstraction;

abstract class Tvremote{

    String brand="gucci";
    abstract void turnon();  //only method name without method logic
    abstract void turnoff();

    public void tv(){
        System.out.println("this is normal tv");  // concrete method (normal method)
    }
}

class Onida extends Tvremote{
    @Override
    public void turnon(){
        System.out.println("tv is turned on");
    }
    @Override
    public void turnoff(){
        System.out.println("tv is turned off");
    }

    public void print(){
        System.out.println(brand);
    }
}

public class Abstraction_oops {
    public static void main(String[]args){
        // showing the essential functionality to the user (logic)
        //with the help of interface and abstract classes
           Onida obj=new Onida();
           obj.turnon();
           obj.turnoff();
           obj.tv();
           obj.print();

    }
}
