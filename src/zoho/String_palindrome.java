package zoho;

public class String_palindrome {
    public static void main(String[]args){
        String str="abcba";
        String str2="aA";
        String str3="@ab*cba#";
        String str4="  aba ";
        System.out.println(checkPalindrome(str));
        System.out.println(checkPalindrome(str2.toLowerCase()));
        System.out.println(checkPalindrome(str3.toLowerCase()));
        System.out.println(checkPalindrome(str4.toLowerCase()));

    }
    private static boolean checkPalindrome(String str){
        int left=0;
        int right=str.length()-1;

        while (left<right){
            if(!Character.isAlphabetic(str.charAt(left))){
                left++;
            }
            else if(!Character.isAlphabetic((str.charAt(right)))){
                right--;
            }
            else if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;

    }
}
