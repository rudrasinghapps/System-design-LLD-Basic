package SystemDesign.Interface2;

public class Main {
    static void main() {
        Coffe coffe = new Bevrage();
        Tea tea = new Bevrage();
        Lassi lassi = new Bevrage();

        Bevrage bevrage = new Bevrage();

        Test test = new Test((Tea) bevrage);

        test.display();


    }
}
