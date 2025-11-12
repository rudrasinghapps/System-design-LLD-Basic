package SystemDesign.class23.Raw2;

public class Mohani {
    String name ;
    String level ;
    int mukka ;
    String dress;
    Display display;


    public Mohani(String name, String level, int mukka, String dress, Display display) {
        this.name = name;
        this.level = level;
        this.mukka = mukka;
        this.dress = dress;
        this.display = display;
    }

    void showTheDetails(){
        display.display(name ,level,mukka,dress);
    }
}
