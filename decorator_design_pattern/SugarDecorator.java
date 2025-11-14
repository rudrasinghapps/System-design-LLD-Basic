package SystemDesign.decorator_design_pattern;

public class SugarDecorator extends CoffeeDecorator {


    SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int price() {
        return coffee.price()+10;
    }


    @Override
    public String coffeeName() {
        return coffee.coffeeName()+"_S";
    }

    @Override
    public String toping() {
        return coffee.toping()+" + Sugar";
    }
}
