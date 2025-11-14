package SystemDesign.state_design_pattern;

public class MediumStatus implements Status{
    @Override
    public void handleRequest(Fan fan) {
        System.out.println("Fan is on MEDIUM. Turning to HIGH state...");
        fan.status = new HighStatus();
    }
}
