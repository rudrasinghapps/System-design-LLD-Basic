package SystemDesign.decorator_design_pattern;

public class MilkDecorator extends CoffeeDecorator{


    MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int price() {
        return coffee.price()+10;
    }



    @Override
    public String coffeeName() {
        return coffee.coffeeName()+"-M";
    }

    @Override
    public String toping() {
        return coffee.toping()+" +Milk";
    }
}
