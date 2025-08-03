package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Stream_ex {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("Banana","Apple","Orange","Kiwi","Pomegranate");
        List<Integer> nums= Arrays.asList(43,35,13,67,77);
        List<String> fruit= Arrays.asList("Banana","Apple"," ","Kiwi","","Pomegranate",null);

        //print fruit start with the letter "p"
        fruits.stream()
                .filter(string->string.toLowerCase().startsWith("p")).forEach(System.out::println);

        //print the sum of the arrayList
       Optional<Integer> opt= nums.stream().reduce((x, y)->x+y);
        opt.ifPresent(System.out::println);


        //print the sum of the arrayList using builtin function
        int sum=nums.stream().mapToInt(numObj -> numObj.intValue()).sum();
        System.out.println(sum);


        //print the avg og the ArrayList
        OptionalDouble avg=nums.stream()
                    .mapToInt(Integer::intValue).average();
        avg.ifPresent(System.out::println);


        // check the string of array and remove null,whitespace and print the remaining
        fruit.stream().filter(str->str!=null&&!str.trim().isEmpty())
                .forEach(System.out::println);

        //print the string in desc order according to the length and in uppercase
        fruits.stream().sorted((f1,f2)->Integer.compare(f2.length(),f1.length()))
//                .map(fru->fru.toUpperCase())
                .map(String::toUpperCase)
                .forEach(System.out::println);


// greater num in a list
        List<Integer> greater=nums.stream().filter(num->num>50).collect(Collectors.toList());
        System.out.println(greater);
    }

}
