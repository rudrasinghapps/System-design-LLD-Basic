package SystemDesign.class7;

import java.util.Comparator;

public class SortByRollNo implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Person)o2).rollno - ((Person)o1).rollno;
    }
}
