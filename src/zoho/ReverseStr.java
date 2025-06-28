package zoho;

public class ReverseStr {
    public static void main(String[] args) {
        String str="hello";
        System.out.println(StrReverse(str));
    }
    public static String StrReverse(String str){
        int len=str.length();
        String rev="";
        char ch;
        for(int i=0;i>len;i++){
                ch = str.charAt(i);
                rev=ch+rev;

        }
        return rev;
    }
}
