package SystemDesign.class19.Visitor;

public abstract class Shape {
    abstract void draw();
    abstract void accept(Visitor visitor);
}
