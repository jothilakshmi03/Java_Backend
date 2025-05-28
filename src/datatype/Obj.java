package datatype;

// class created by me

class Mobile{
    int camera=67;

    public void takingpic(){
        if(camera<=90) {
            System.out.println("Taking Selfie with " + camera + "px camera iphone");
        }
        else{
            System.out.println("Taking Selfie with " + camera + "px camera samsung");
        }
    }
}

public class Obj {
    public static void main(String[]args) {
         Mobile iphone=new Mobile();
         iphone.camera=90;
         iphone.takingpic();

         Mobile samsung=new Mobile();
         samsung.camera=180;
         samsung.takingpic();

        }
    }

