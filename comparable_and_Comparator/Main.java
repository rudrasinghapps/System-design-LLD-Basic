package SystemDesign.comparable_and_Comparator;

import java.util.*;

public class Main {
    static void main() {

        Person p1 = new Person(25, "Aney", 12);
        Person p2 = new Person(56, "Rudra", 18);
        Person p3 = new Person(12, "Shani", 9);
        Person p4 = new Person(18, "Diva", 117);
        Person p5 = new Person(60, "Sris", 117);

        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        System.out.println(list);                        //-> unsorted list

        Collections.sort(list);                          //-> Sort on the basis of name , class default sorting is on the basis of name ( Comparable )
        System.out.println(list);

        Collections.sort(list, new SortByage());        // -> Sort on the basis of Age , beacuse SortByAge Comparator   ( Comparator )
        System.out.println(list);

        Collections.sort(list, new SortByRollNo());     // -> Sort on the basis of RollNo . beacuse  SortByRollNo  Comparator   ( Comparator )
        System.out.println(list);
    }
}
