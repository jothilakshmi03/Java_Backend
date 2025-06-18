package oops;

class Dad{   // parent class
   static int size=567;
    static String home="chennai";

    public void property(){
        System.out.println("the area of the property is "+size+" feet/sq");
    }
   private void show(){
        System.out.println("the area is "+size+" location "+home);
    }
}

class Daughter extends Dad{  // child class

    static int age=21;

    public void education(){
        System.out.println("the child was graduated at the age of "+age+" in "+home);
    }
    public void show2(){
        property();
    }
}

public class Single_Inheritance {
    public static void main(String[]args){
        Dad obj=new Dad();
        obj.property();
//        obj.show();

        Daughter edu=new Daughter();
        edu.education();
        edu.property();

        Daughter.home="banglore";  // it will affect the parent class also
//      Dad.size=57637;
        edu.size=8999;
        edu.property();
        edu.education();

    }
}
