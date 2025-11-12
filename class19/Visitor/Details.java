package SystemDesign.class19.Visitor;

public class Details implements Visitor{
    @Override
    public void visit(Circle circle) {
        System.out.println(this);
        System.out.println("circle details " + circle.num);
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println(this);
        System.out.println("rectangle details "+rectangle.num);
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println(this);
        System.out.println("triangle details "+triangle.num);
    }
}
