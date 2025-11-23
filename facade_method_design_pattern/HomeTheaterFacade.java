package SystemDesign.facade_method_design_pattern;

public class HomeTheaterFacade {

    private Tv tv;
    private SoundSystem soundSystem;
    private DvdPlayer dvdPlayer;

    public HomeTheaterFacade() {
        tv = new Tv();
        soundSystem = new SoundSystem();
        dvdPlayer = new DvdPlayer();
    }

    public void onHomeTheater() {
        tv.onTv();
        soundSystem.onSound();
        soundSystem.setVolume(10);
        dvdPlayer.onDvdPlayer();
    }

    public void offHomeTheater() {
        tv.offTv();
        soundSystem.offSound();
        dvdPlayer.offDvdPlayer();
    }
}
