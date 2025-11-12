package SystemDesign.class14.RawCodeState;

public class AudioPlayer {

    String state;

    public AudioPlayer(){
        this.state = "standBy";
    }

    public void changeSource(){
        if(state.equals("standBy")){
            System.out.println("Changing Source to -> 'Radio'");
            this.state = "Radio";
        } else if (state.equals("Radio")) {
            System.out.println("Changing Source to -> 'Mp3 _paused'");
            this.state = "Mp3_paused";
        }else if(state.equals("Mp3_paused")){
            System.out.println("Changing Source to -> 'Mp3_playing'");
            this.state = "Mp3_playing";
        } else if (state.equals("Mp3_playing")) {
            System.out.println("Changing Source to 'Mp3_paused'");
            this.state = "Mp3_paused";
        }
    }

    public void pressPlay(){
        if(state.equals("standBy")){
            System.out.println("Invalid play");
        }else if(state.equals("Radio")){
            System.out.println("Playing Radio------------");
        } else if (state.equals("Mp3_playing")) {
            System.out.println("Pausing Mp3 ## ");
            this.state = "Mp3_paused";
        } else if (state.equals("Mp3_paused")) {
            System.out.println("Playing Mp3 ....");
            this.state = "Mp3_playing";
        }
    }
}
