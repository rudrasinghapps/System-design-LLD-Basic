package SystemDesign.strategy_design_pattern;

public class OneInchPunch implements IPunchBehaviour{
    @Override
    public void punch() {
        System.out.println("One Inch Punch");
    }

    @Override
    public String toString() {
        return "OneInchPunch{}";
    }
}
