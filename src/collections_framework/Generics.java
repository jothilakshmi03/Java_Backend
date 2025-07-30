package collections_framework;

import java.util.ArrayList;
import java.util.List;

//writing without datatype is called generic

public class Generics {
    public static void main(String[] args) {
        List<Number> list=new ArrayList<>();
        list.add(1);
        list.add(7.989d);
        list.add(12345678);
        System.out.println(list);
    }
}
