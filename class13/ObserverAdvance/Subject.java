package SystemDesign.class13.ObserverAdvance;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    List<Observer> list;

    Subject(){
        list = new ArrayList<>();
    }
}
