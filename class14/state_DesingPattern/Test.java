package SystemDesign.class14.state_DesingPattern;

public class Test {
    static void main() {
        AudioPlayer pl = new AudioPlayer();
        pl.pressPlay();
        pl.changeSource();
        pl.pressPlay();
        pl.changeSource();
        pl.pressPlay();
        pl.pressPlay();
        pl.pressPlay();
        pl.pressPlay();
        pl.changeSource();
        pl.changeSource();
        pl.changeSource();
        pl.changeSource();
   }
}
