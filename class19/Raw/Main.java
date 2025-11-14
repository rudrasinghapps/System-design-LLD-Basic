package SystemDesign.class19.Raw;



import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {

        Human m = new Mohani();
        Human s = new Srishti();


        System.out.println(m);
        System.out.println(s);

        m.name();
        s.name();


        Visitor levelFinder = new LevelFinder();
        m.passObj(levelFinder);
        s.passObj(levelFinder);

        Visitor mFinder = new MFinder();
        m.passObj(mFinder);
        s.passObj(mFinder);







    }
}
