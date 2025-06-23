package abstraction;

interface Music_system{
    void playMusic();
}
class Kpop implements Music_system{
    public void playMusic(){
        System.out.println("music can heal your mind");
    }
    public void display(){
        System.out.println("it is a universal medicine");
    }
    public void tour(){
        System.out.println("it is needed concert");
    }
}
interface Pop_music extends Music_system {
    void concert();
}

public class Interface_ex2 {
    public static void main(String[] args) {
        Music_system obj=new Kpop();
        obj.playMusic();

        Kpop o=new Kpop();
        o.display();


    }
}
