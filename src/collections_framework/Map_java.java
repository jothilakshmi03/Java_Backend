package collections_framework;

import java.util.HashMap;
import java.util.Map;

public class Map_java {
    public static void main(String[] args) {
        Map<Integer,String> name=new HashMap<>();
        name.put(1,"rahul");
        name.put(2,"jyothi");
        name.put(3,"rohit");
        name.put(3,"arul");
        System.out.println(name);
        System.out.println(name.get(3));
        System.out.println(name.remove(2));
        System.out.println(name);
        name.replace(3,"arul","guru");
        System.out.println(name);
        System.out.println(name.containsValue("arul"));
        System.out.println(name.keySet());
        System.out.println(name.entrySet());

        for (Map.Entry<Integer,String>entry:name.entrySet()){
            System.out.println(entry.getKey()+" is "+entry.getValue());
        }
        for (Integer map:name.keySet()){
            System.out.println("key : "+map+" "+name.get(map));
        }
    }
}
