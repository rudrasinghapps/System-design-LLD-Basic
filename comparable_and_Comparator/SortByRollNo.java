package SystemDesign.comparable_and_Comparator;

import java.util.Comparator;

public class SortByRollNo implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Person) o1).rollno - ((Person) o2).rollno;
    }
}
