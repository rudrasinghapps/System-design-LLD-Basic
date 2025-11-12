package SystemDesign.class13.Decoraters;

public class BasicCoffee implements Coffee{

    @Override
    public int price() {
        return 50;
    }

    @Override
    public String description() {
        return "Basic Coffee";
    }

    @Override
    public String size() {
       return "Small";
    }
}
