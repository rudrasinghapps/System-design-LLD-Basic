package SystemDesign.strategy_design_pattern;

public class SideKick implements IKichBehaviour{
    @Override
    public void kick() {
        System.out.println("Side kick");
    }

    @Override
    public String toString() {
        return "SideKick{}";
    }
}
