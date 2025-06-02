package looping;

public class Labelling_continue {
    public static void main(String[]args){
        loop1:  for(int i=1;i<=3;i++){
            loop2:  for(int j=1;j<=3;j++){

                if(j==2){

                    continue loop2;

                }
                System.out.println("the value of j : "+j + " the value of i : "+i);


            }
        }
    }
}
