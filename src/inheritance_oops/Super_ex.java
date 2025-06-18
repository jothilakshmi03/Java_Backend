package inheritance_oops;

class Parent{
    String name;
}
class  Child extends Parent{
    String name;

    Child(String cName,String pName){
        this.name=cName;
        super.name=pName;
    }

    public void childdis(){
        System.out.println("this is "+this.name);
        System.out.println("this is "+super.name);

    }
}

public class Super_ex {
    public static void main(String[]args){
        Child obj=new Child("daughter","mom");
        obj.childdis();
    }
}
