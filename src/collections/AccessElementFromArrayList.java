package collections;

import java.util.ArrayList;
import java.util.List;

public class AccessElementFromArrayList {
    public static void main(String[] args) {
        List<String> num=new ArrayList<>();
        System.out.println(num.isEmpty());
        num.add("Python");
        num.add("Java");
        num.add("SQL");
        num.add("C");
        num.add("JavaScript");
        System.out.println("Here are the top "+ num.size()+" programming Languages of all time");
        System.out.println("The best programming language==> " +num.get(1));
        System.out.println(num.set(3,"HTML"));
        System.out.println(num);


    }
}
