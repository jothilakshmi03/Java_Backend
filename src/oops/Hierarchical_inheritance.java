package oops;

//one parents and two childs

class Bike{
    String name="KTM";
    int speed=45;

    public void ride(){
        System.out.println("this bike "+name+" goes "+speed);
    }

}
class Hero extends Bike{
    String color="red";
    public void hero(){
        System.out.println("it is red in color");
        ride();
    }
}
class Scooty extends Bike{
    int weight=93;

    public void display(){
        System.out.println("the weight is "+weight);
    }
}

public class Hierarchical_inheritance {
    public static void main(String[]args){
        Bike b=new Bike();
        b.ride();

        Hero h=new Hero();
        h.name="honda";
        h.speed=60;
        h.ride();
        h.hero();

        Scooty s=new Scooty();
        s.name="pept";
        s.speed=50;
        s.ride();
        s.display();

    }
}
