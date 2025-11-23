package SystemDesign.facade_method_design_pattern;

public class SoundSystem {
    public void onSound(){
        System.out.println("Sound System On");
    }

    public void setVolume(int volume){
        System.out.println("Volume set to -> "+volume);
    }

    public void offSound(){
        System.out.println("Sound System off");
    }
}
