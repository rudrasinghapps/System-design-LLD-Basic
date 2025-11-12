package SystemDesign.class19.Raw;

public class MFinder implements Visitor{
    @Override
    public void visit(Mohani mohani) {
        System.out.println("Mohani num -> "+mohani.num);
    }

    @Override
    public void visit(Srishti srishti) {
        System.out.println("Srishti num -> "+srishti.num);
    }
}
