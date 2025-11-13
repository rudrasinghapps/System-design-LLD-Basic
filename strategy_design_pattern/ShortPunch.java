package SystemDesign.strategy_design_pattern;

public class ShortPunch implements IPunchBehaviour{
    @Override
    public void punch() {
        System.out.println("Short Punch");
    }

    @Override
    public String toString() {
        return "ShortPunch{}";
    }
}
