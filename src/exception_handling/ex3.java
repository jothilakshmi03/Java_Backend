package exception_handling;

public class ex3 {
    public static void main(String[] args) {
        String str=" ";
        try {
            System.out.println(str.length());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
