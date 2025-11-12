package SystemDesign.class14.state_DesingPattern;

public class Mp3_play extends State{

    @Override
    void changeSource(AudioPlayer pl) {
        System.out.println("Changing Source to 'Mp3_paused'");
        pl.state = new Mp3_paused();
    }

    @Override
    void pressPlay(AudioPlayer pl) {
        System.out.println("Pausing Mp3 ## ");
        pl.state = new Mp3_paused();
    }
}
