package array;

import java.util.Arrays;

public class Multi_dimensional_array {
    public static void main(String[]args){
        int arrays[][]= {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(arrays));
        System.out.println(arrays[0][1]);
        arrays[1][1]=100;
        System.out.println(Arrays.deepToString(arrays));
    }
}
