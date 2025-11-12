package SystemDesign.class14;

public class Srishti extends Human{
    @Override
    public void Name() {
        System.out.println("Srishti");
    }

    @Override
    void tataPower() {
        System.out.println("10");
    }

    @Override
    void level(Handler ha) {
        System.out.println("Extreeme");
        ha.human = new Arti();
    }
}
