package SystemDesign.visitor_design_pattern;

public class BrandFinder implements Visitor{

    @Override
    public void visit(Mobile mobile) {
        System.out.println(mobile.brand);
    }

    @Override
    public void visit(Laptop laptop) {
        System.out.println(laptop.brand);
    }
}
