package casting;

public class Implicit_casting {
    public static void main(String[] args) {
// one datatype to another datatype
        //narrow or explicit << (programmer (manually))
        //widening or implicit >> (compiler)

        byte b=76;
        long l=b;
        System.out.println(l);

        byte b1=76;
        double d =b;
        System.out.println(d);



    }
}

