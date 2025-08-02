package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> names= Arrays.asList(1,3,4);
//        names.stream().filter(name->name.startsWith("j")).forEach(System.out::println);
        List<Integer> num=names.stream().filter(n-> n%2!=0).collect(Collectors.toList());
        System.out.println(num);
    }
}
