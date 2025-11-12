package SystemDesign.class14.state_DesingPattern;

public class StandBy extends State {

    @Override
    void changeSource(AudioPlayer pl) {
        System.out.println("Changing Source to -> 'Radio'");
        pl.state = new Radio();
    }

    @Override
    void pressPlay(AudioPlayer pl) {
        System.out.println("Invalid Play----");
    }
}
