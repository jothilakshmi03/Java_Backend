package constructor;

class Application_form{

    public String name;
    public static String col_name="Mailam Engineering College";

    public void printdetails(){
        System.out.println("The student name is "+ name + " and "+name +" studied in "+col_name);
    }

}

public class Spl_constructor {
    public static void main(String[]args){
//         Application_form stu1=new Application_form();
//         stu1.name="Jyothilakshmi";
//         stu1.col_name="Besant";
//         stu1.printdetails();

        Application_form stu2=new Application_form();
        stu2.name="Jayasri";
        stu2.col_name="vcodez";
        stu2.printdetails();

        Application_form stu1=new Application_form();
        stu1.name="Jyothilakshmi";
        stu1.col_name="besant";
        stu1.printdetails();
        stu2.printdetails();


    }
}
