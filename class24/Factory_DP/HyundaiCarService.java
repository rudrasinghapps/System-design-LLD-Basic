package SystemDesign.class24.Factory_DP;

public class HyundaiCarService extends CarRentService{
    @Override
    protected ICar getCar() {
        return new HyundaiCar();
    }
}
