package zoho;

public class Secont_largest {
    public static void main(String[]args){
        int[] array ={1,8,5,9,0};
        int[] array2={};
        int[] array3={5,5,4};
        int [] array4={5,5,5};

        System.out.println(findSecondLargest(array));
        System.out.println(findSecondLargest(array2));
        System.out.println(findSecondLargest(array3));
        System.out.println(findSecondLargest(array4));
    }
    private static int findSecondLargest(int[] array){
        if(array.length==0||array.length==1){
            return -1;
        }
        int max=Integer.MIN_VALUE;
        int sec_max=Integer.MIN_VALUE;
        for(int num:array){
            if(max<num){
                sec_max=max;
                max=num;
            }
            else if(sec_max<num && num!=max){
                sec_max=num;
            }
        }
        if(sec_max==Integer.MIN_VALUE){
            return max;
        }

        return sec_max;
    }
}
