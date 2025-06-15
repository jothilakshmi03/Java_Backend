package string;

public class String_methods {
    public static void main(String[]args){
        String str="Java Developer";
        String str1="java developer";
        String stri=new String("Java Developer ");

        String str2=" backend";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(6));
        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('e'));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.concat(str2));
        System.out.println(str+str2);
        System.out.println(str.isEmpty());
        System.out.println(str.replace('e','z'));
        System.out.println(str.startsWith("J"));
        System.out.println(str.endsWith("r"));
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str==stri);

        String var="Content Writing,\"it is a easy work!\"";
        System.out.println(var);
    }
}
