package SystemDesign.decorator_design_pattern;

public class Main {
    static void main() {

        BasicCoffee coffee = new BasicCoffee("Espresso", "Noraml Cup");
        MilkDecorator milk = new MilkDecorator(coffee);
        SugarDecorator sugarr = new SugarDecorator(milk);
        CreamDecorator cream = new CreamDecorator(sugarr);

        coffee.display();
        milk.display();
        sugarr.display();
        cream.display();

    }
}
