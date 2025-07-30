package collections_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public int compareTo(Student o) {
//        return this.age-o.age;
        return this.name.compareTo(o.name);
    }
}

public class Comparable_interface {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("jyothi",24));
        students.add(new Student("devi",23));
        students.add(new Student("guru",22));
        students.add(new Student("deepak",28));
        students.add(new Student("sulo",27));

        Collections.sort(students);
        for(Student o:students){
            System.out.println(o.name+" "+o.age);
        }
    }
}
