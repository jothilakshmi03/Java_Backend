package method1;

public class Method1 {
    public static  void  main(String[]args){
        System.out.println("hi");
        //example();  //it'll run first
//
//        Method1 obj=new Method1();
//        obj.instanceMethod();

        Method1 obj1=new Method1();
        obj1.instanceMethod2();
    }
    public static void example(){
        System.out.println("this is an example method");  // (static)class based method
//        Method1 obj=new Method1();
//        obj.instanceMethod2();
    }
    public void  instanceMethod(){
        System.out.println("this is instance method");// (instance)object based method

    }
    public void instanceMethod2(){
        System.out.println("this is instance method2");
        instanceMethod();
        example();


    }

}

