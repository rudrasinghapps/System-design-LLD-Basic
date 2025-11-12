package SystemDesign.class25.Builder_DP;

public class NonVegMealBuilder extends MealBuilder{
    Meal meal = new Meal();
    @Override
    void reset() {
        meal = new Meal();
    }

    @Override
    void addBurger() {
         meal.burger = "Non Veg Cheese Burger";
    }

    @Override
    void addSweet() {
       meal.sweet = "Soan papri";
    }

    @Override
    void addFries() {
       meal.fries = "Cheese fries";
    }

    @Override
    void addDrink() {
      meal.drink = "CocaCola";
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
