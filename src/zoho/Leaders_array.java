package zoho;

public class Leaders_array {
    public static void main(String[] args) {
        int[] array={16,17,4,3,5,2};
        int max=Integer.MIN_VALUE;
        StringBuilder res=new StringBuilder();
        for(int i=array.length-1;i>=0;i--){
            if(max<array[i]){
                max=array[i];
                res.insert(0,max+" ");
            }
        }
        System.out.println(res);
    }
}
