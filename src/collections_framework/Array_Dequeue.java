package collections_framework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Array_Dequeue {
    public static void main(String[] args) {
        Deque<Integer> num= new ArrayDeque<>();
        num.add(12);
        num.add(34);
        num.add(31);
        num.add(78);
        num.add(87);
        num.addFirst(21);
        num.addLast(98);
        System.out.println(num);
        System.out.println(num.peekFirst());
        System.out.println(num);
        System.out.println(num.peekLast());
        System.out.println(num);
        System.out.println(num.pollFirst());
        System.out.println(num);
        System.out.println(num.pollLast());
        System.out.println(num);
        System.out.println(num.pop());
    }
}
