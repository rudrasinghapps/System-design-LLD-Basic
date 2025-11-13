package SystemDesign.strategy_design_pattern;

public class Fighter {
    IPunchBehaviour     pb;
    IKichBehaviour      kb;
    FightingType        ft;


    public void fight(){
        kb.kick();
        pb.punch();
        ft.type();
    }

}
