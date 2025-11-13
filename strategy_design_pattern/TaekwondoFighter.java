package SystemDesign.strategy_design_pattern;

public class TaekwondoFighter implements FightingType{
    @Override
    public void type() {
        System.out.println("Taekwondo Fighter");
    }

    @Override
    public String toString() {
        return "TaekwondoFighter{}";
    }
}
