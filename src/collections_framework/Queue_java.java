package collections_framework;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_java {
    public static void main(String[] args) {
        Queue<Integer> num=new PriorityQueue<>();
        num.add(24);
        num.add(43);
        num.add(25);
        num.add(87);
        num.add(987);
//        System.out.println(num);
//        System.out.println(num.remove(87));
//        System.out.println(num.offer(43));
//        num.removeAll(num);
        System.out.println(num);
        System.out.println(num.poll());
        System.out.println(num);
        System.out.println(num.peek());
        System.out.println(num);
    }
}
