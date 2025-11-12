package SystemDesign.class22.ProtoType;

public class Rectange implements Shape{

    String name;
    int length;
    int breath;
    int area;

    public Rectange() {
    }

    public Rectange(int length, int breath, int area, String name) {
        this.length = length;
        this.breath = breath;
        this.area = area;
        this.name = name;
    }

    @Override
    public Shape clone() {
        return new Rectange(this.length, this.breath, this.area, this.name);
    }

    @Override
    public String toString() {
        return "Rectange{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", breath=" + breath +
                ", area=" + area +
                '}';
    }
}
