package SystemDesign.class13.Decoraters;

public abstract class CoffeeDecorater implements Coffee {
   Coffee coffee;

   CoffeeDecorater(Coffee coffee){
       this.coffee = coffee;
   }

    protected CoffeeDecorater() {
    }
}
