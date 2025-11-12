package SystemDesign.Interface2;

public class Test {
    Coffe coffe;
    Tea tea;
    Lassi lassi;
    Bevrage bevrage;

    public Test(Bevrage bevrage){
        this.bevrage = bevrage;
    }

    public Test(Tea tea) {
        this.tea = tea;
    }

    public Test(Lassi lassi){
        this.lassi = lassi;
    }

    Test(Coffe coffe){
        this.coffe = coffe;
    }

    public void display(){
        if(bevrage != null){
            coffe = (Coffe) bevrage;
            tea = (Tea) bevrage;
            lassi = (Lassi) bevrage;
        }
      if(coffe != null)  System.out.println(coffe.coffePrice()+" -> "+coffe.coffeName());
      if(tea != null) System.out.println(tea.teaPrice() +" -> "+tea.teaName());
      if(lassi != null) System.out.println(lassi.lassiPrice() +" -> "+lassi.lassiName());
    }


}
