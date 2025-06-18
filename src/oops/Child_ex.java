package oops;


class Ebook extends Book{
    public  void testing(){
        System.out.println("testing");
        study();
    }
}
public class Child_ex {
    public static void main(String[]args){
        Ebook e= new Ebook();
        e.testing();
        e.study();
    }
}
