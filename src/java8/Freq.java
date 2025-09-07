package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Freq {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("Kiwi","Banana","Apple","Orange","Kiwi","Apple","Pomegranate");
        Map<String,Long>freq=fruits.stream().collect(Collectors.groupingBy(items->items,Collectors.counting()));
        System.out.println(freq);
    }
}
