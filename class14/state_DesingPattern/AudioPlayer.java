package SystemDesign.class14.state_DesingPattern;

public class AudioPlayer {
    State state;

    AudioPlayer(){
        this.state = new StandBy();
    }



    void changeSource() {
        this.state.changeSource( this );
    }


    void pressPlay() {
       this.state.pressPlay(this);
    }
}
