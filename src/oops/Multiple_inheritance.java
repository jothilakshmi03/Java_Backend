package oops;

//grandfather
//father
//daughter

class Animal{
    int legs=4;
    String name;

    public static void zoo(){
        Animal a=new Animal();
        a.name="tiger";
        System.out.println("the "+a.name+" has "+a.legs+" legs");
    }
}

class Elephant extends Animal{
    public void eat(){
        System.out.println("the elephant is eating");
//        zoo();
    }
}

class African_elephant extends  Elephant{
    public void sleep(){
        System.out.println("it is sleeping");
    }

    @Override  //annotations

    public void eat(){ // Method overriding - same method name and same return type(void)
        System.out.println("the african elephant is eating banana");
    }
}

public class Multiple_inheritance {
    public static void main(String[]args){

        Animal obj=new Animal();
        obj.zoo();

        Elephant e=new Elephant();
        e.eat();

        African_elephant ae=new African_elephant();
        ae.sleep();
        ae.eat();
        Animal.zoo();
    }
}
