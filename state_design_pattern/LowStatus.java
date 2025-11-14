package SystemDesign.state_design_pattern;

public class LowStatus implements Status{
    @Override
    public void handleRequest(Fan fan) {
        System.out.println("Fan is on LOW. Turning to MEDIUM state...");
        fan.status = new MediumStatus();
    }
}
