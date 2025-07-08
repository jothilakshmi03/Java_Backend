package exception_handling;

public class Exception_handling_ex1 {
    public static void main(String[] args) {
        int a=15;
        int b=4;
//        int res=a/b;
        try {
            int c=a/b;
            System.out.println(c);   //runtime Exception unchecked exception
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("finally block will always executes if there is exception or not");
        }
//        System.out.println(res);

        System.out.println("the code finished execution");
    }
}
