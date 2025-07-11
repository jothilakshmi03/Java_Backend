package exception_handling;

class InvalidAgeException extends  Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class Custom_exceptionhandling{
    public static void checkAge(int age)throws InvalidAgeException{
       if(age<18){
           throw new InvalidAgeException("they are minor");
       }else {
           System.out.println("they are major");
       }
    }
    public static void main(String[] args) {
        try {
            checkAge(14);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
