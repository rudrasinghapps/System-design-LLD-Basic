package SystemDesign.class14.state_DesingPattern;

public class Radio extends State{


    @Override
    void changeSource(AudioPlayer pl) {
        System.out.println("Changing Source to -> 'Mp3 _paused'");
        pl.state = new Mp3_paused();
    }

    @Override
    void pressPlay(AudioPlayer pl) {
        System.out.println("Playing Radio...");
    }
}
