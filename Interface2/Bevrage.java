package SystemDesign.Interface2;

public class Bevrage implements Coffe ,Tea ,Lassi {
    @Override
    public int coffePrice() {
        return 50;
    }

    @Override
    public String coffeName() {
        return "Basic_Coffe";
    }

    @Override
    public int teaPrice() {
        return 10;
    }

    @Override
    public String teaName() {
        return "Tapri_Tea";
    }

    @Override
    public int lassiPrice() {
        return 30;
    }

    @Override
    public String lassiName() {
        return "Sweet_Lassi";
    }



}
