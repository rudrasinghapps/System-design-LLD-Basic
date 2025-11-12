package SystemDesign.class25.Builder_DP;

public abstract class MealBuilder {
     abstract void reset();
     abstract void addBurger();
     abstract void addSweet();
     abstract void addFries();
     abstract void addDrink();
     public abstract Meal getMeal();



}
