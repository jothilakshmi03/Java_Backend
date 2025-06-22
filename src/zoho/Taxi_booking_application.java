package zoho;

import java.util.Scanner;
import java.util.ArrayList;


public class Taxi_booking_application {
    public static void main(String[]args) throws CloneNotSupportedException {
        boolean loop=true;

        while(loop){
            System.out.println("Choose any one\n1.book taxi\n2.Display Details\n3.Exit");
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();

            switch (n){
                case 1:{
                    System.out.println("enter pickup location");
                    char pickupLocation=s.next().charAt(0);
                    System.out.println("enter drop location");
                    char dropLocation=s.next().charAt(0);
                    System.out.println("enter pickup time");
                    int pickupTime=s.nextInt();
                    System.out.println(taxiBooking.booking(pickupLocation,dropLocation,pickupTime));
                }
                case 2:{
                    taxiBooking.display();
                    break;
                }
            }

        }
    }
}
