package oops;

class Dad{   // parent class
    int size=567;
    static String home="chennai";

    public void property(){
        System.out.println("the area of the property is "+size+" feet/sq");
    }
}

class Daughter extends Dad{  // child class

    static int age=21;

    public void education(){
        System.out.println("the child was graduated at the age of "+age+" in "+home);
    }
}

public class Single_Inheritance {
    public static void main(String[]args){
        Dad obj=new Dad();
        obj.property();

        Daughter edu=new Daughter();
        edu.education();
        edu.property();

        Daughter.home="banglore";
        edu.education();

    }
}
