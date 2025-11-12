package SystemDesign.class10;

public class Lambo extends Car{

    int topSpeed =999;

    public Lambo(int price, int speed) {
        super(price, speed);
    }
    public void lamboMethod(){
        System.out.println("lambo method");
    }

    @Override
    public String toString() {
        return "Lambo{" +
                "topSpeed=" + topSpeed +
                '}';
    }
}
