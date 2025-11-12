package SystemDesign.class14.state_DesingPattern;

public abstract class State {

    abstract void changeSource(AudioPlayer pl);
    abstract void pressPlay(AudioPlayer pl);

}
