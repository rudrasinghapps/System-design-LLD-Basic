package SystemDesign.class24.AbstractFactory_DP;

public class HyundaiCarFactory implements ICarFactory{
    @Override
    public ICar getCar() {
        return new HyundaiCar();
    }
}
