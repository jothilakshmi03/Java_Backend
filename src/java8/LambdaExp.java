package java8;

@FunctionalInterface
interface greet{
    void hello();
}
class child implements greet{
    @Override
    public void hello(){
//        System.out.println("hi");
    }

}
@FunctionalInterface
interface add{
    int add(int a,int b);
}

public class LambdaExp {
    public static void main(String[] args) {
//        greet obj=new child();
//        obj.hello();

        greet g=()-> System.out.println("hii");  //lambda expression
        g.hello();

        add plus=(a,b)->a+b;
        System.out.println(plus.add(4,7));
    }
}
