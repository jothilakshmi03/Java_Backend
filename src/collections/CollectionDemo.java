package collections;

import java.util.ArrayList;
import java.util.Collection;

//collection interface is a root interface

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> fruitCollection=new ArrayList<>();
        fruitCollection.add("banana");
        fruitCollection.add("apple");
        fruitCollection.add("orange");
        System.out.println(fruitCollection);
        fruitCollection.remove("banana");
        System.out.println(fruitCollection);

        System.out.println(fruitCollection.contains("apple"));

        System.out.println(fruitCollection.isEmpty());
        fruitCollection.forEach((element)->{
            System.out.println(element);
        });
        fruitCollection.clear();
        System.out.println(fruitCollection);
    }
}
