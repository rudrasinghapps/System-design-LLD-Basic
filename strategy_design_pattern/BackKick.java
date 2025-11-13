package SystemDesign.strategy_design_pattern;

public class BackKick implements IKichBehaviour{
    @Override
    public void kick() {
        System.out.println("Back kick");
    }

    @Override
    public String toString() {
        return "BackKick{}";
    }
}
