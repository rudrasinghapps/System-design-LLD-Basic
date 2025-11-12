package SystemDesign.class24.Factory_DP;

public abstract class CarRentService {

    void rentCar(int km){
        ICar car = getCar();
        car.start();
        car.stop();
        int bill = car.pricePerKm() * km;
        System.out.println(bill);

    }

    protected abstract ICar getCar();
}
