package SystemDesign.strategy_design_pattern;

public class HammerPunch implements IPunchBehaviour{
    @Override
    public void punch() {
        System.out.println("Hammer Punch");
    }

    @Override
    public String toString() {
        return "HammerPunch{}";
    }
}
