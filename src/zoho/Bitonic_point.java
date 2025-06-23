package zoho;

public class Bitonic_point {
    public static void main(String[] args) {
        int[] array={1,4,5,9,12,8,7};
        System.out.println(findBitonic(array));
    }
    public static int findBitonic(int[] array){
        int left=0;
        int right=array.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(array[mid]>array[mid-1]&& array[mid]>array[mid+1]){
                return array[mid];
            }
            else if(array[mid-1]>array[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }
}
