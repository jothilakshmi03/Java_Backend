package variable;

public class Instance_variable {
    byte age=21;//instance variable (inside the class outside the method)
    String name="jyothilakshmi";
    long mob_no=8015425080l;

    public static void main(String[]args){

        Instance_variable stud1=new Instance_variable();
        System.out.println(stud1.age);  // method to access the instance variable
        System.out.println(stud1.name);
        System.out.println(stud1.mob_no);
    }
}
