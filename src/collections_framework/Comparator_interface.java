package collections_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Stud{
    String name;
    int age;
    Stud(String name, int age){
        this.name=name;
        this.age=age;
    }
     static class nameComparator implements Comparator<Stud> {

        @Override
        public int compare(Stud o1, Stud o2) {
            return o1.name.compareTo(o2.name);
        }
    }
}
public class Comparator_interface {
    public static void main(String[] args) {
        List<Stud> students=new ArrayList<>();
        students.add(new Stud("jyothi",24));
        students.add(new Stud("devi",23));
        students.add(new Stud("guru",22));
        students.add(new Stud("deepak",28));
        students.add(new Stud("sulo",27));

        Collections.sort(students,new Stud.nameComparator());
        for(Stud o1:students){
            System.out.println(o1.name+" "+o1.age);
        }
    }
}
