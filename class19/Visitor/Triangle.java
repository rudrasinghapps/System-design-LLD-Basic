package SystemDesign.class19.Visitor;

public class Triangle extends Shape {
    int num = 30;

    @Override
    void draw() {
        System.out.println("Draw Trinagle");
    }

    @Override
    void accept(Visitor visitor) {
      visitor.visit(this);
    }
}
