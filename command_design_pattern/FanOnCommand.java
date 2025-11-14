package SystemDesign.command_design_pattern;

public class FanOnCommand extends Command{
    Fan fan;
    FanOnCommand(Fan fan){
        this.fan =fan;
    }
    @Override
    void execute() {
         fan.onFan();
    }
}
