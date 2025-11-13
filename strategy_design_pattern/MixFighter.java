package SystemDesign.strategy_design_pattern;

public class MixFighter implements FightingType{
    @Override
    public void type() {
        System.out.println("Mix Fighting Style");
    }

    @Override
    public String toString() {
        return "MixFighter{}";
    }
}
