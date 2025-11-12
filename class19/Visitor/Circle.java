package SystemDesign.class19.Visitor;

public class Circle extends Shape {
    int num = 3;
    @Override
    void draw() {
        System.out.println("Draw Circle");
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
