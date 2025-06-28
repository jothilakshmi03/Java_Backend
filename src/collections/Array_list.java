package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_list {
    public static void main(String[] args) {
//        int[] arr=new int[10];
        ArrayList<Integer> alist=new ArrayList<Integer>();

        for(int i=1;i<=10;i++){
            alist.add(i);
        }
        alist.add(100);
        alist.add(200);
        alist.add(300);
        System.out.println(alist);
        alist.add(5,400);
        alist.contains(100);
        alist.get(6);
        for(int i:alist.subList(4,7))
//        alist.subList(4,7);
        System.out.println(alist);
        Iterator<Integer> i=alist.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }


}
