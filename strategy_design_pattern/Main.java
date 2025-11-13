package SystemDesign.strategy_design_pattern;

public class Main {
    static void main() {

        Fighter fighter = new Fighter();
        fighter.kb = new BackKick();
        fighter.pb = new HammerPunch();
        fighter.ft = new karatefight();

        Fighter fighter1 = new Fighter();
        fighter1.kb = new FrontKick();
        fighter1.pb = new OneInchPunch();
        fighter1.ft = new TaekwondoFighter();


        Fighter fighter2 = new Fighter();
        fighter2.kb = new SideKick();
        fighter2.pb = new ShortPunch();
        fighter2.ft = new MixFighter();


        fighter.fight();
        System.out.println("-----------");

        fighter1.fight();
        System.out.println("------------");

        fighter2.fight();

    }
}
