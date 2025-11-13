package SystemDesign.strategy_design_pattern;

public class FrontKick implements IKichBehaviour{
    @Override
    public void kick() {
        System.out.println("Front Kick");
    }

    @Override
    public String toString() {
        return "FrontKick{}";
    }
}
