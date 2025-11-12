package SystemDesign.class15;

public class FanOffCommond extends Commond{
    Fan fan;

    FanOffCommond(Fan fan){
        this.fan = fan;
    }
    @Override
    void execute() {
        fan.offFan();
    }

    @Override
    void undo() {
        fan.offFan();
    }
}
