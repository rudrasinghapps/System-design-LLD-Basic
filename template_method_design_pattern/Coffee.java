package SystemDesign.template_method_design_pattern;

public class Coffee extends BeverageTemplate {
    @Override
    public void addMainIngredients() {
        System.out.println("Adding Coffee Beans");
    }

    @Override
    public void addSecondIngredients() {
        System.out.println("Adding CoCo powder");
    }

    @Override
    public String name() {
        return "Coffee";
    }
}
