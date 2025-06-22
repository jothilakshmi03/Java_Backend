package zoho;

public class Missing_num {
    public static void main(String[]args){
        int[] array={3,0,1};
        int[] array1={};
        int[] array2={1,2};
        System.out.println(find_missing_num(array));
        System.out.println(find_missing_num(array1));
        System.out.println(find_missing_num(array2));
    }
    private static int find_missing_num(int[] array){
        int length= array.length;
        if(length==0){
            return 0;
        }
        int total=length*(length+1)/2;
        for(int num:array){
            total=total-num;
        }
        return total;
    }
}
