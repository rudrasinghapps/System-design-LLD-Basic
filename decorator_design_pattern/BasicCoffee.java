package SystemDesign.decorator_design_pattern;

public class BasicCoffee implements Coffee {

    String coffeeType;
    String cupType;

    public BasicCoffee(String coffeeType, String cupType) {
        this.coffeeType = coffeeType;
        this.cupType = cupType;
    }

    @Override
    public int price() {
        return 10;
    }

    @Override
    public String coffeeSize() {
        return "Small";
    }

    @Override
    public String coffeeName() {
        return coffeeType;
    }

    @Override
    public String toping() {
        return "Water + Coffee";
    }

    @Override
    public void display() {
        System.out.println(this.coffeeType);
        System.out.println(this.cupType);
        System.out.println(this.price());
        System.out.println(this.coffeeSize());
        System.out.println(this.coffeeName());
        System.out.println(this.toping());
        System.out.println("--------------------------");

    }
}
