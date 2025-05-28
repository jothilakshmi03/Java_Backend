package variable;

public class Static_variable {
    static byte mark=89;   //static variable (inside the class outside the method) with keyword static
//     if you dont want to change the datatype or method use static variable

    static String coll_name="மயிலம் பொறியியல் கல்லூரி"; //example

    public static void main(String[]args){
        System.out.println(Static_variable.coll_name);  // no need to create an object
    }
}
