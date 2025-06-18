package books;

public class Books { //parent class

    int pages;
    static String book_name;

   public void reading(){
        System.out.println("the book name is "+book_name+" it has "+pages+" pages");
    }
    protected void learning(){
        System.out.println("the book is "+book_name);
    }
}
