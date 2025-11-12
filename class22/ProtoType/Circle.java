package SystemDesign.class22.ProtoType;

public class Circle implements Shape{

    String name;
    int radius;
    int circumfrence;

    public Circle(String name, int radius, int circumfrence) {
        this.name = name;
        this.radius = radius;
        this.circumfrence = circumfrence;
    }

    public Circle() {

    }

    @Override
    public Shape clone() {
        return new Circle(this.name ,this.radius ,this.circumfrence);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", circumfrence=" + circumfrence +
                '}';
    }
}
