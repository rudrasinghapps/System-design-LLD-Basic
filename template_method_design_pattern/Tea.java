package SystemDesign.template_method_design_pattern;

public class Tea extends BeverageTemplate {
    @Override
    public void addMainIngredients() {
        System.out.println("Adding Tea powder");
    }

    @Override
    public void addSecondIngredients() {
        System.out.println("Adding Ginger");
    }

    @Override
    public String name() {
        return "Tea";
    }
}
