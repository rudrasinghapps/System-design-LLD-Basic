package SystemDesign.state_design_pattern;

public class Fan {
    Status status;

    Fan(){
        this.status = new OffStatus();
    }

    public void pressButton(){
        status.handleRequest(this);
    }
}
