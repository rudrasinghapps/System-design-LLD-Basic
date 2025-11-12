package SystemDesign.class14;

public class Arti extends Human{
    @Override
    public void Name() {
        System.out.println("Arti");
    }


    @Override
    void tataPower() {
        System.out.println("50");
    }

    @Override
    void level(Handler ha) {
        System.out.println("Very Simple");
        ha.human = new Mohani();
    }
}
