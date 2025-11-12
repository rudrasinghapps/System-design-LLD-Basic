package SystemDesign.class24.AbstractFactory_DP;

public class MartuiCarFactory implements ICarFactory{
    @Override
    public ICar getCar() {
        return new MarutiCar();
    }
}
