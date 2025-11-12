package SystemDesign.class14.state_DesingPattern;

public class Mp3_paused extends State{

    @Override
    void changeSource(AudioPlayer pl) {
        System.out.println("Changing Source to -> 'Mp3_playing'");
        pl.state =new Mp3_play();
    }

    @Override
    void pressPlay(AudioPlayer pl) {
        System.out.println("Playing Mp3 ....");
        pl.state = new Mp3_play();
    }
}
