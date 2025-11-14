package SystemDesign.command_design_pattern;

public class LightOffCommand extends Command{
    Light light;

    LightOffCommand (Light light){
        this.light = light;
    }
    @Override
    void execute() {
        light.offLight();
    }
}
