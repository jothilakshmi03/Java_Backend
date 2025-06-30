package collections;

class student{

}
class book{

}
// need of collection framework


public class java_collections {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int array[]=new int[10000];  //we can store multiple values in a single variable
        // limitations of an array
        //1. arrays are fixed in size
        //2. single type of datatype can be stored(homogeneous)

        student[] students=new student[10];
        students[0]=new student();
        students[1]=new student();
        students[2]= new student();
        //students[3]=new book();

        Object[] objects=new Object[10];
        objects[0]=new student();
        objects[1]=new student();
        objects[2]=new book();

        // ready Made api's support is not available in array
    }
}
