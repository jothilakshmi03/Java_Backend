package collections;

import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        String str = "{[[]]}";
//        System.out.println(Bracket_check(str));
        if (Bracket_check(str)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    public static boolean Bracket_check(String str){
        Stack<Character> check_bracket=new Stack<Character>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='['||ch=='{'||ch=='('){
                check_bracket.push(ch);
            }
            else{
                if(check_bracket.isEmpty()){
                    return false;
                }
                char top=check_bracket.pop();
            }

                if((ch == '[' && ch == ']')||
                        (ch=='{'&& ch=='}')||
                        (ch=='('&& ch==')')){

                    return false;
                }
            }

        return check_bracket.empty();
        }


    }

