package SystemDesign.class24.AbstractFactory_DP;

public class Main {
    static void main() {
        CarRentService car = new CarRentService();
        car.setCarFactory(new HyundaiCarFactory());
       // car.setCarFactory(new MartuiCarFactory());
        car.rentCar(100);
    }
}
