package SystemDesign.command_design_pattern;

public class FanOffCommand extends Command {
    Fan fan;
    FanOffCommand(Fan fan){
        this.fan = fan;
    }


    @Override
    void execute() {
        fan.offFan();
    }
}
