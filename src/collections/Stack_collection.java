package collections;


import java.util.*;

public class Stack_collection {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack);
        ArrayList<Integer> array=new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        System.out.println(array.get(1));
        System.out.println(array);
        HashMap<String, Integer> hash=new HashMap<>();
        hash.put("a",1);
        hash.put("b",2);
        System.out.println(hash);
        Set<Integer> set=new HashSet<>();
        set.add(12);
        set.add(13);
        set.add(14);
        System.out.println(set);
        PriorityQueue<String> que=new PriorityQueue<>();
        que.add("a");
        que.add("y");
        que.add("c");
        System.out.println(que);
        hash.get("a");
        System.out.println(hash);
    }
}
