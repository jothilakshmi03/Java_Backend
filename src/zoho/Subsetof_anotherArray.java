package zoho;

public class Subsetof_anotherArray {
    public static void main(String[]args){
        int[] array={1,2,3,4};
        int[] array1={2,4,5};
        System.out.println(isSubset(array,array1));
    }
    public static boolean isSubset(int[] array,int[] array1){
        int i=0;
        int j=0;
        while (i<array.length && j<array1.length){
            if(array[i]==array1[j]){
                i++;
                j++;
            }
            else if(array[i]<array1[j]){
                i++;
            }
            else{
                return false;
            }
        }
        return  j==array1.length;

    }
}
