package zoho;

public class Equilibrium_index {
    public static void main(String[] args) {
        int[] arr={1,5,8,2,3,1};
        System.out.println(CheckequilibriumIndex(arr));
    }
    public static int CheckequilibriumIndex(int[] arr){
        int totalsum=0;
        for(int num:arr){
            totalsum+=num;
        }
        int leftsum=0;
        for(int i=0;i<arr.length;i++){
            totalsum-=arr[i];
            if(totalsum==leftsum){
                return i;
            }
            leftsum+=arr[i];
        }
        return -1;
    }
}
