package zoho;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Odd_characterCount {
    public static void main(String[]args){
        String str="aabbcdcc";
        String str2="aabbdccc";
        System.out.println(OddCountCheck(str));
        System.out.println(OddCountCheck(str2));
    }
    public static String OddCountCheck(String str){
        HashMap<Character,Integer> frequency=new LinkedHashMap<>();
        StringBuilder result=new StringBuilder();
        for(char ch : str.toCharArray()){
            frequency.put(ch,frequency.getOrDefault(ch,0)+1);
        }
        for(char ch:frequency.keySet()){
            if(frequency.get(ch)%2!=0){
                result.append(ch);
            }
        }
        return result.toString();
    }
}
