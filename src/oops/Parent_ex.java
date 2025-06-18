package oops;


class Book{
    String name="Java";
    int pages=450;

    protected void study(){
        System.out.println(name+" "+pages);
    }
}

public class Parent_ex {
    public static void main(String[]args){
        Book b=new Book();
        b.study();
    }
}
