package SystemDesign.class14;

public class Mohani extends Human{
    @Override
    public void Name() {
        System.out.println("Mohani");
    }



    @Override
    void tataPower() {
        System.out.println("900");
    }

    @Override
    void level(Handler ha) {
        System.out.println("Hand");
        ha.human = new Srishti();
    }
}
