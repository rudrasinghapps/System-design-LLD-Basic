package SystemDesign.decorator_design_pattern;

public abstract class CoffeeDecorator implements Coffee {
    Coffee coffee;

    CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String coffeeSize() {
        return coffee.coffeeSize();
    }

    @Override
    public void display() {
        System.out.println(this.price());
        System.out.println(this.coffeeSize());
        System.out.println(this.coffeeName());
        System.out.println(this.toping());
        System.out.println("***********************************");

    }
}
