package SystemDesign.class15;

public class LightOfCommand extends Commond{

    Light light;

    LightOfCommand(Light light){
        this.light = light;
    }

    @Override
    void execute() {
        light.offLight();
    }

    @Override
    void undo() {
        light.onLight();
    }

}
