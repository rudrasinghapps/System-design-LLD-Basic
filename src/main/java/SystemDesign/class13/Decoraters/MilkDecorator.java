package SystemDesign.class13.Decoraters;

public class MilkDecorator extends CoffeeDecorater {

    MilkDecorator(Coffee coffee){
       super(coffee) ;
    }


    public int price() {
        return coffee.price()+10;
    }


    public int priceTea() {
        return 0;
    }


    public String adding() {
        return "Genger";
    }


    public String description() {
        return  coffee.description()+" + Mikl";
    }

    @Override
    public String size() {
        return "Mediam";
    }


    public String sizeTea() {
        return  "Mediam";
    }

    public void m3(){
        System.out.println("m3");
    }





}
