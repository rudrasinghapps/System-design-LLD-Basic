package SystemDesign.class24.AbstractFactory_DP;



public class MarutiCar implements ICar
{
    @Override
    public void start() {
        System.out.println("Start Maruti_Car");
    }

    @Override
    public void stop() {
        System.out.println("Stop Maruti_Car");
    }

    @Override
    public int pricePerKm() {
        return 20;
    }
}
