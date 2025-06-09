package objectInitialization;

class Elect_gagets{
    public String name;
    public int size;

    public void display(){
        System.out.println("my gadget is "+name+" and it's size is "+size+" inches");
    }

}


public class Ref_variable {
    public static void main(String[]args){
        Elect_gagets obj=new Elect_gagets();
        obj.name="Mouse";
        obj.size=5;   //object initialization by reference value
        obj.display();
    }
}
