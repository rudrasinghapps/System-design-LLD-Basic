package SystemDesign.class25.Builder_DP;

public class VegLunchBuilder extends  MealBuilder{
    private  Meal meal = new Meal();

    @Override
    void reset() {
        meal = new Meal();
    }

    @Override
    void addBurger() {
         meal.burger = "Cheese Veg Burger";
    }

    @Override
    void addSweet() {
          meal.sweet = "Soan Papari";
    }

    @Override
    void addFries() {
       meal.fries = "Cheese peri peri fries";
    }

    @Override
    void addDrink() {
         meal.drink = "Sprite";
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
