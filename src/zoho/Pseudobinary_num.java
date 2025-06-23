package zoho;


public class Pseudobinary_num {
    public static void main(String[] args) {
        int num=31;
        int num2=44;
        System.out.println(minPseudoBinary(num));
        System.out.println(minPseudoBinary(num2));

    }
    private static int minPseudoBinary(int num){
        int max_num=0;
        while (num>0){
            int digit=num%10;
            max_num= Math.max(digit,max_num);
            num=num/10;
        }
        return max_num;
    }

}
