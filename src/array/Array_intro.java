package array;

import java.util.Arrays;

public class Array_intro {
    public static void main(String[]args){
        int num[]={1,3,6,7,9};  // intialization is done on a same line
        String name[]={"hi","hello","bye"};
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(name));//if we print the array with the plain variable name the memory address will be printed
        System.out.println(num[3]);
        num[3]=8;   //replace
        System.out.println(Arrays.toString(num));

        int age[]=new int[4];//length initialization
        age[0]=34;
        age[1]=32;
        age[2]=44;
//        age[3]=22;

    System.out.println(Arrays.toString(age));


    }
}
