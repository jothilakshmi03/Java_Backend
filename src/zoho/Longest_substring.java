package zoho;

public class Longest_substring {
    public static void main(String[]args){
        String str="ababcdefc";
        String str2="AaaBb";
        String str3="pwwekk";
        System.out.println(longestSubString(str));
        System.out.println(longestSubString(str2));
        System.out.println(longestSubString(str3));
    }
    public static int longestSubString(String str){
        int start=0;
        int maxlen=0;
        int[] lastseen=new int[256];
        for(int i=0;i<str.length();i++){
            char currentChar=str.charAt(i);
            if(lastseen[currentChar]>start){
                start=lastseen[currentChar];
            }
            lastseen[currentChar]=i+1;
            maxlen=Math.max(maxlen,i+1-start);
        }
        return maxlen;

    }
}
