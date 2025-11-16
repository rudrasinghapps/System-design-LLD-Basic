package SystemDesign.visitor_design_pattern;

public class Mobile implements Item{
    String brand;
    String model;
    int storage;
    int price;

    public Mobile(String brand, String model, int storage, int price) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
        this.price = price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
