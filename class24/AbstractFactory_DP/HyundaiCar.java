package SystemDesign.class24.AbstractFactory_DP;



public class HyundaiCar implements ICar {
    @Override
    public void start() {
        System.out.println("Start Hyundai Car");
    }

    @Override
    public void stop() {
        System.out.println("Stop Hyundai Car");
    }

    @Override
    public int pricePerKm() {
        return 10;
    }
}
