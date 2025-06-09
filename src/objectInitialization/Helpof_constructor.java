package objectInitialization;

class Elect_gagetss{
    public String name;
    public int size;

    public void display(){
        System.out.println("my gadget is "+name+" and it's size is "+size+" inches");
    }
    public Elect_gagetss(String n,int s){
        this.name=n;
        this.size=s;
    }

}


public class Helpof_constructor {
    public static void main(String[]args){
          Elect_gagetss gadgets=new Elect_gagetss("keyboard",15);
          Elect_gagetss gadgets1=new Elect_gagetss("phone",6);

        gadgets.display();
        gadgets1.display();
    }
}
