package SystemDesign.class15;

public class LinghOnCommomd extends Commond{

    Light light;

    LinghOnCommomd(Light light){
        this.light = light;
    }

    @Override
    void execute() {
        light.onLight();
    }

    @Override
    void undo() {
        light.offLight();
    }
}
