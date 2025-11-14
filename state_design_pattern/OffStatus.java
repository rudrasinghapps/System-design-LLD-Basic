package SystemDesign.state_design_pattern;

public class OffStatus implements Status{
    @Override
    public void handleRequest(Fan fan) {
        System.out.println("Fan is off. Turning to low Status");
        fan.status = new LowStatus();

    }
}
