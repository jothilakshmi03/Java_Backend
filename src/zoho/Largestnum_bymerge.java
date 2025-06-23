package zoho;

public class Largestnum_bymerge {
    public static void main(String[] args) {
        int[] array={8,7,1,9};
        int[] count=new int[10];

        for(int num:array){
            count[num]++;
            
        }
        StringBuilder result=new StringBuilder();
        for(int i=9;i>=0;i--){
            while(count[i]>0){
               result.append(i);
               count[i]--;
            }
//            System.out.println(result);
        }
        System.out.println(result);
    }
}
