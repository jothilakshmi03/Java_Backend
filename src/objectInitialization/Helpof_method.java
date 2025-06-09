package objectInitialization;

class car{
    public  int tyres;
    public  String name;

    public void carDetials(int tyres,String name){
        this.tyres=tyres;
        this.name=name;
        System.out.println("the name of the car is "+name+" it has "+tyres+" tyres");
    }
}



public class Helpof_method {
    public static void main(String[]args){
         car obj=new car();
         obj.carDetials(4,"BMW");

    }
}
