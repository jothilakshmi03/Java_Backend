package constructor;
class Ornament{
    public String type="Earring";
    public  static  double price=67000.67;

    public void buying(){
        System.out.println("the "+type+ " is ready to buy the price is "+price+"!!");
    }
}

public class Default_constructor {
    public static void main(String[]args) {
            Ornament o=new Ornament();
            o.type="chain";
            Ornament.price= 68000.99;
            o.buying();
    }
}
