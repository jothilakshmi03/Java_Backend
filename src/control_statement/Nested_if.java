package control_statement;

public class Nested_if {
    public static void main(String[]args){
        int age=34;
        if(age>17){
            System.out.println("eligible to vote");
            if(age>60){
                System.out.println("Senior citizen");
            }
            else{
                System.out.println("not a senior citizen");
            }
        }
        else{
            System.out.println("Not eligible to vote");
        }
    }
}
