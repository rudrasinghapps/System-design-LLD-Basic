package SystemDesign.class7;

import java.util.Comparator;

public class SortByage implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Person)o1).age -  ((Person)o2).age;
    }
}
