package SystemDesign.class13.Decoraters;

public class Test {
    static void main() {

       Coffee coffee = new BasicCoffee();
       System.out.println(coffee.size() +" -> "+ coffee.description() +" -> "+coffee.price());

       MilkDecorator milkDecorator = new MilkDecorator(coffee);
        System.out.println(milkDecorator.sizeTea() +" -> "+ milkDecorator.description() +" -> "+milkDecorator.price());

       Coffee sugarDecorator = new SugarDecorator(milkDecorator);
        System.out.println(sugarDecorator.size() +" -> "+ sugarDecorator.description() +" -> "+sugarDecorator.price());

        CreamDecorator creamDecorator = new CreamDecorator(  milkDecorator);
        System.out.println(creamDecorator.size() +" -> "+ creamDecorator.description() +" -> "+creamDecorator.price());

    }
}
