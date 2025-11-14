package SystemDesign.command_design_pattern;

public class LightOnCommand extends Command{
    Light light;

    LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    void execute() {
        light.onLight();
    }
}
