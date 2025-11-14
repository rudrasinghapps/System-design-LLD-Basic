package SystemDesign.decorator_design_pattern;

public class CreamDecorator extends CoffeeDecorator {


    CreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int price() {
        return coffee.price()+10;
    }


    @Override
    public String coffeeName() {
        return coffee.coffeeName()+"_C";
    }

    @Override
    public String toping() {
        return coffee.toping()+" + Cream";
    }
}
