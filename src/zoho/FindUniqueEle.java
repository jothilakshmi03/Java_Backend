package zoho;

public class FindUniqueEle {
    public static void main(String[] args) {
        int[] arr={4,3,5,4,3};
        System.out.println(Uniqueele(arr));
    }
    public static int Uniqueele(int[] arr){
        int result=0;
        for(int n:arr){
            result^=n;
        }
        return result;
    }
}
