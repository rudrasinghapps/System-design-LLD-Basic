package SystemDesign.state_design_pattern;

public class HighStatus implements Status {


    @Override
    public void handleRequest(Fan fan) {
        System.out.println("Fan is on HIGH. Turning OFF...");
        fan.status = new OffStatus();
    }
}
