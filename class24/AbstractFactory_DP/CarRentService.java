package SystemDesign.class24.AbstractFactory_DP;

public class CarRentService {
    ICarFactory carFactory;

    public void setCarFactory(ICarFactory iCarFactory){
        this.carFactory = iCarFactory;
    }

    public void rentCar(int kms){
       ICar car =  carFactory.getCar();
       car.start();
       car.stop();
       System.out.println(car.pricePerKm() * kms);
    }
}
