package SystemDesign.class25.Builder_DP;

public class Test {
    static void main() {
      Director dr = new Director();
      dr.setMealBuilder(new NonVegMealBuilder());
        System.out.println(dr.construct());

    }
}
