package variable;

public class Local_variable {
    static String library1="xyz";
    String book="Core java";
    String author="katrina joshep";

    public static void main(String[]args){
        short num=6789;  // declared inside the method only access inside the method

        System.out.println(num);
    }
    public static void library(){
        Local_variable lib=new Local_variable();
        System.out.println(library1);
        System.out.println(lib.book);
        System.out.println(lib.author);


    }
}
