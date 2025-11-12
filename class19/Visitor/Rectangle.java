package SystemDesign.class19.Visitor;

public class Rectangle extends Shape {
    int num =  40;
    @Override
    void draw() {
        System.out.println("Draw Rectongle");
    }

    @Override
    void accept(Visitor visitor) {
     visitor.visit(this);
    }
}
