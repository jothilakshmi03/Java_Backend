package inheritance_oops;

class Birds{
    String name="bird";
    String fly="flying";

    public void eat(){
        System.out.println("the bird is eating insects");
    }
}
class Parrot extends Birds{
    String color="green";
    String name="parrot";

    Parrot(String name,String fly,String color){
        this.color=color;
        super.fly=fly;
        this.name=name;
    }

    public void speak(){
        System.out.println("the bird is speaking and it is of type "+name+" and the color is "+color+" and it is "+fly); // super represent the parent class
    }

//    public void display(){
//        System.out.println(super.fly+super.name);
//    }
}

public class Super_keyword {
    public static void main(String[]args){
         Birds obj=new Birds();
         obj.eat();

         Parrot p=new Parrot("peacock","flying","white");
         p.speak();
    }
}
