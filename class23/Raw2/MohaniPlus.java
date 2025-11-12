package SystemDesign.class23.Raw2;

public class MohaniPlus extends Mohani{

    String str;

    public MohaniPlus(String name, String level, int mukka, String dress, Display display, String str) {
        super(name, level, mukka, dress, display);
        this.str = str;
        this.level += str;
    }
}
