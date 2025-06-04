package method1;

class Testing{
    public static void test(){
        System.out.println("this is class");
//        Private_method.sample(); // we cant call a private method inside another class
    }

}

public class Private_method {
    public static  void  main(String[]args){
        System.out.println("hi");
        sample();
        Private_method obj=new Private_method();
        obj.sample1();
    }
    private static  void sample(){
        System.out.println("this is a sample");
    }
    private void sample1(){
        System.out.println("this is instance sample");
    }
}
