package exception_handling;

public class throws_kwyword {
    public static void main(String[] args) {
        try {
            divide(15,0);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void  divide(int a,int b)throws ArithmeticException{   //method signature
        System.out.println("Result : "+(a/b));
        System.out.println("hi");
    }
}
