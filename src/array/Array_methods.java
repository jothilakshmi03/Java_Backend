package array;

import java.util.Arrays;

public class Array_methods {
    public static void main(String[]args){
        // sort method

        int num[]={1,8,5,34,76,22};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        String name[]={"u","e","o","i","a"};
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));

        //binary search

        int arr[]={1,8,87,33,5,34,76,22};
        Arrays.sort(arr);
        int index=Arrays.binarySearch(arr,87);
        System.out.println(Arrays.toString(arr));
        System.out.println(index);

        //fill method

        int arr1[]=new int[5];
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));

        //equals method
        int arr2[]={1,8,87,33,5,34,76,22};
        int arr3[]={5,8,87,33,1,34,22,76};
        System.out.println(Arrays.equals(arr2,arr3));

        //copyOf

        int num1[]={8,87,33,5,34,75};
        int num2[]= Arrays.copyOf(num1,4);
        System.out.println(Arrays.toString(num2));

        //copyOf range

        int number[]={8,87,33,5,34,75,67,44};
        int number1[]=Arrays.copyOfRange(number,2,4);
        System.out.println(Arrays.toString(number1));

        //compare

        System.out.println( Arrays.compare(arr2,arr3));

    }
}
