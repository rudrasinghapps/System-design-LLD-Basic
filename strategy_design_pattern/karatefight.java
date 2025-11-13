package SystemDesign.strategy_design_pattern;

public class karatefight implements FightingType{
    @Override
    public void type() {
        System.out.println("karate fight..");
    }

    @Override
    public String toString() {
        return "karatefight{}";
    }
}
