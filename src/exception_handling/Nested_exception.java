package exception_handling;

public class Nested_exception {
    public static void main(String[] args) {
        int a=2;
        int b=0;
        int age[]={1,2,3,4};
        try {
            System.out.println("outer try block");
            try {
                int res=a/b;
                System.out.println(res);
            }catch (Exception e){
                System.out.println(e);
            }
            try {
                System.out.println(age[5]);
            }catch (Exception ee){
                System.out.println(ee);
            }
        } catch (Exception e1){
            System.out.println(e1);
            System.out.println("outer catch block");
        }
        System.out.println("welcome to nested exception");

    }
}
