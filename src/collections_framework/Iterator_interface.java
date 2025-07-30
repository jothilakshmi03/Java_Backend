package collections_framework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Iterator_interface {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator<Integer> it=list.iterator();
        while (it.hasNext()){ //check next element present or not(hasNext)
           int num=it.next();
            System.out.println(num);
        }

    }
}
