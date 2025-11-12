package SystemDesign.class24.Factory_DP;

public class MarutiCarService extends CarRentService{
    @Override
    protected ICar getCar() {
        return new MarutiCar();
    }
}
