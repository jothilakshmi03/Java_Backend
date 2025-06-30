package zoho;

import java.util.Scanner;

class removepalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Malayalam is my mother tongue mom",temp="",temp2 = "";
        int n = str.length();
        for(int i = 0;i<n;i++){
//            System.out.println(i);
            if(str.charAt(i) != ' ')
                temp2=temp2+str.charAt(i);
            if(str.charAt(i) == ' ' || i==(n-1)) {
                System.out.println(temp2);
                if(!ispalindrome(temp2))
                    temp=temp+temp2+" ";
                temp2 = "";
            }
        }
        System.out.println(temp);
    }
    public static boolean ispalindrome(String a) {
        a = a.toLowerCase();
        for(int i = 0,j = a.length()-1;i<j;i++,j--) {
            if(a.charAt(i)!=a.charAt(j))
                return false;
        }
        return true;
    }
    }




