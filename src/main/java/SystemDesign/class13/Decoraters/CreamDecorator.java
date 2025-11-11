package SystemDesign.class13.Decoraters;

public class CreamDecorator extends CoffeeDecorater implements  Tea{
    CreamDecorator(Coffee coffee) {
        super(coffee);
    }




    @Override
    public int price() {
        return coffee.price()+20;
    }

    @Override
    public String description() {
        return coffee.description()+" + Cream";
    }

    @Override
    public String size() {
        return coffee.size();
    }

    @Override
    public int priceTea() {
        return 1555;
    }

    @Override
    public String adding() {
        return "dfghbfg";
    }

    @Override
    public String sizeTea() {
        return "fvbdsf";
    }
}
