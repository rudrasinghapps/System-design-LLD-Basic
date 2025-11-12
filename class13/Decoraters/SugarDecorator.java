package SystemDesign.class13.Decoraters;

public class SugarDecorator extends CoffeeDecorater {

   SugarDecorator(Coffee coffee){
       super(coffee) ;
   }

    public int price() {
        return coffee.price()+10;
    }


    public String description() {
        return  coffee.description()+" + Sugar";
    }


    public String size() {
        return  "Large";
    }
}
