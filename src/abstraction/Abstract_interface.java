package abstraction;

// multiple inheritance using interface

interface Animals{
    int legs=4;
    void sound(); //only method name without method logic
    void color();

    default void eat(){
        System.out.println("the animal is eating");
    }
    static void info(){
        System.out.println("the animals information is confidential");
    }
}

interface plants extends Animals{  // use one interface into another interface we use extends
    void leafs();
}

class Rat implements Animals,plants{
    @Override
    public void sound(){
        System.out.println("it sound's weird "+ legs);
    }
    @Override
    public void color(){
        System.out.println("it is in gray color");
    }
    @Override
    public void leafs(){
        System.out.println("it has 4 leaves");
    }
    public void print(){
        System.out.println("it has "+legs+" legs");
    }
}

public class Abstract_interface {
    public static void main(String[]args){
         Rat obj=new Rat();
         obj.sound();
         obj.color();
         obj.print();
         obj.eat();
         Animals.info();
         obj.leafs();
    }
}
