package exception_handling;

public class Exception_handling_ex1 {
    public static void main(String[] args) {
        int a=15;
        int b=0;
//        int res=a/b;
        try {
            int c=a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println(e);
        }
//        System.out.println(res);

        System.out.println("the code finished execution");
    }
}
