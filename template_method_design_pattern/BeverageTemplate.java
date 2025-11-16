package SystemDesign.template_method_design_pattern;

public abstract class BeverageTemplate {

    public final void prepareBeverage() {     //Template method should be final
        boilWater();
        addMainIngredients();
        addSecondIngredients();
        serve();
    }

    protected abstract void addMainIngredients();

    protected abstract void addSecondIngredients();

    protected abstract String name();


    private void boilWater() {
        System.out.println("Boiling Water...");
    }

    private void serve() {
        System.out.println("Serving " + name());
    }


}

