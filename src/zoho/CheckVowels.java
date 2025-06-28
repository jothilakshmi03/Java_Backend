package zoho;

import java.util.Arrays;

public class CheckVowels {
    public static void main(String[] args) {
        String[] str={"j","a","o","t","h","i"};
        System.out.println(VowelCheck(Arrays.toString(str)));
    }
    public static Character VowelCheck(String str){
        int len=str.length();
        for(int i=0;i<len;) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                i++;
            }
            return str.charAt(i);
        }
        return null;
    }
}
