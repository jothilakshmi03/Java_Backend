package string;

public class String_intro {
    public static void main(String[]args){
        String text="java";    //string literal (string constant pool is a memory to store the string)
        System.out.println(text);

        String word="java";
        System.out.println(word);

        String name=new String("besant"); //heap memory
        System.out.println(name);
    }
}
