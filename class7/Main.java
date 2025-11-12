package SystemDesign.class7;

import java.util.*;

class Person  {
    int age;
    String name;
    int rollno;

    public Person(int age, String name, int rollno) {
        this.age = age;
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }
}
public class Main {
    static void main() {
     Person p1 = new Person(10,"A",12);
     Person p2 = new Person(20,"B",18);
     Person p3 = new Person(30,"C",9);
     Person p4 = new Person(40,"D",117);
     List<Person> list = new ArrayList<>();
     list.add(p3);
     list.add(p4);
     list.add(p1);
     list.add(p2);
     System.out.println(list);
     Collections.sort(list ,new SortByRollNo());
     System.out.println(list);


    }
}
