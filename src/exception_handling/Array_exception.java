package exception_handling;

public class Array_exception {
    public static void main(String[] args) {
        int array[]={1,2,3,4};
        try {
            System.out.println(array[4]);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
