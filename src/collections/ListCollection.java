package collections;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
//        list.add("element1");
//        list.add("element2");  // list allows duplicate elements
//        list.add("element2");
//        list.add("");  // list allows null element
//        list.add(null);
//        System.out.println(list);

        list.add("element1");
        list.add("element2");
        list.add("element5");
        list.add("element4");
        list.add("element3");
        System.out.println(list);

        // acess element from the list

        System.out.println(list.get(2));
    }
}
