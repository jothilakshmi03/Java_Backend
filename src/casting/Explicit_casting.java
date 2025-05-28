package casting;

public class Explicit_casting {
    public  static void main(String[]args){
        int a= 127;

        byte b= (byte)a;  //manually changing with the help of casting operator
        System.out.println(b);

        double d=787798.90d;
        int c=(int) d;
        System.out.println(c);
    }
}
