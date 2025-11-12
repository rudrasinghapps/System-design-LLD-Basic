package SystemDesign.class19.Raw;

public class LevelFinder implements Visitor {

    @Override
    public void visit(Mohani mohani) {
        System.out.println(mohani.level);
    }

    @Override
    public void visit(Srishti srishti) {
        System.out.println(srishti.level);
    }
}
