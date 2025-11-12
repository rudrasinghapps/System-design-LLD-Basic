package SystemDesign.class10;

public class Bmw extends Car {
    int price;
    int speed;

    public Bmw(int price, int speed) {
        super(price,speed);
        this.price = price;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Bmw{" +
                "price=" + price +
                ", speed=" + speed +
                '}';
    }
}
