package collections;

//how to create arrayList from another collection using the 
//Arraylist collection c constructor


// how to add all element from an existing collection to a new arraylist using the addall() method

import java.util.ArrayList;
import java.util.List;

public class createArrayListfromCollectionsEx {
    public static void main(String[] args) {
        List<Integer> FirstFivePrimeNum=new ArrayList<>();
        FirstFivePrimeNum.add(2);
        FirstFivePrimeNum.add(3);
        FirstFivePrimeNum.add(5);
        FirstFivePrimeNum.add(7);
        FirstFivePrimeNum.add(11);
//
        List<Integer> firstTenPrimeNum=new ArrayList<>(FirstFivePrimeNum);

        List<Integer>nextFivePrimeNum=new ArrayList<>();
        nextFivePrimeNum.add(13);
        nextFivePrimeNum.add(17);
        nextFivePrimeNum.add(19);
        nextFivePrimeNum.add(23);
        nextFivePrimeNum.add(29);

        firstTenPrimeNum.addAll(nextFivePrimeNum);
        System.out.println(firstTenPrimeNum);
    }
}
