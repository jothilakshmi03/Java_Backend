package exception_handling;

public class ex2 {
    public static void main(String[] args) {
        String []array={"a","b","c",};
        int num= Integer.parseInt(null);
        try {
            System.out.println("outer try block");
            try {
                System.out.println(array[3]);
            } catch (Exception e) {
                System.out.println(e);
            }
            try {
                System.out.println(array[10]);
            } catch (Exception e1) {
                System.out.println(e1);
            }
            try {
                System.out.println(1/0);
            } catch (Exception e2) {
                System.out.println(e2);
            }
        }catch (Exception e3){
            System.out.println(e3);
            System.out.println("catch outer block");
        }
    }
}
