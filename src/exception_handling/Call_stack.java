package exception_handling;


public class Call_stack {
    public static void main(String[] args) {
        Call_stack A=new Call_stack();
        A.methodA();
        A.methodB();
    }
    public void methodA(){
        System.out.println("method a");
    }
    public void  methodB(){
        System.out.println("method b");
    }
}
