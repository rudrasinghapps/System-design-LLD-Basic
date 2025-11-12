package SystemDesign.hashCode_and_equal;

public class Lambo extends Car{

    int topSpeed =999;

    public Lambo(int price, int speed) {
        super(price, speed);
    }

    @Override
    public String toString() {
        return "Lambo{" +
                "topSpeed=" + topSpeed +
                '}';
    }
}
