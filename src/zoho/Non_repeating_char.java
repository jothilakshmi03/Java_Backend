package zoho;

public class Non_repeating_char {
    public static void main(String[]args){
        String str="abcdabcd";
        String str2="%%$$@";
        String str3=" abcabc";
        System.out.println(firstChar(str));
        System.out.println(firstChar(str2));
        System.out.println(firstChar(str3));
    }
    public static Character firstChar(String str){
        int length=str.length();
        if(length<=1){
            return null;
        }
        int[] count=new int[256];
        for(int i=0;i<length;i++){
            count[str.charAt(i)]++;
        }
        for(int i=0;i<length;i++){
            if(count[str.charAt(i)]==1){
                return str.charAt(i);
            }
        }
        return null;
    }
}
