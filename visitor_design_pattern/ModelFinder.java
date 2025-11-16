package SystemDesign.visitor_design_pattern;

public class ModelFinder implements Visitor{

    @Override
    public void visit(Mobile mobile) {
        System.out.println(mobile.model);
    }

    @Override
    public void visit(Laptop laptop) {
        System.out.println(laptop.model);
    }
}
