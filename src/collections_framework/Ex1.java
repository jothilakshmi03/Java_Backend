package collections_framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        //type of interface <Datatype> varName=new class <>();

        List<Integer> num=new LinkedList<>();
        num.add(8);
        num.add(7);
        num.add(9);
        num.add(10);
        num.add(12);
        num.add(77);
        System.out.println(num.size());
        System.out.println(num);
        num.remove(3);
        System.out.println(num);
        System.out.println(num.isEmpty());
        System.out.println(num.contains(7));
        num.removeAll(num);
        System.out.println(num);
    }
}
