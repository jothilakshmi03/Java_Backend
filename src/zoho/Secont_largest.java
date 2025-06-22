package zoho;

public class Secont_largest {
    public static void main(String[]args){
        int[] array ={1,8,5,9,0};

        System.out.println(findSecondLargest(array));
    }
    private static int findSecondLargest(int[] array){
        int max=Integer.MIN_VALUE;
        int sec_max=Integer.MIN_VALUE;
        for(int num:array){
            if(max<num){
                sec_max=max;
                max=num;
            }
            else if(sec_max<num){
                sec_max=num;
            }
        }

        return sec_max;
    }
}
