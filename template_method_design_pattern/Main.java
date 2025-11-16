package SystemDesign.template_method_design_pattern;

public class Main {
    static void main() {
        BeverageTemplate beverage = new Tea();
        beverage.prepareBeverage();

        System.out.println("------------");

        BeverageTemplate beverage1 = new Coffee();
        beverage1.prepareBeverage();
    }
}
