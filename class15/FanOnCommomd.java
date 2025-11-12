package SystemDesign.class15;

public class FanOnCommomd extends Commond{
    Fan fan;

    FanOnCommomd(Fan fan){
        this.fan = fan;
    }
    @Override
    void execute() {
        fan.onFan();
    }

    @Override
    void undo() {
        fan.offFan();
    }
}
