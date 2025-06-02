package looping;

public class Nested_for_loop {
    public static void main(String[]args){
//        one loop present inside another loop

       for(int i=1;i<=2;i++){
            System.out.println("row : "+i);
          for(int j=1;j<=3;j++) {
                System.out.println("col val : "+j);
            }
        }
    }
}
