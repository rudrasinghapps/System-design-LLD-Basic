package SystemDesign.class15;

public class Test {
    static void main() {
        RemoteControl rc = new RemoteControl();
        Light light = new Light();
        Fan fan = new Fan();

        rc.commond1 = new LinghOnCommomd(light);
        rc.commond2 = new LightOfCommand(light);
        rc.commond3 = new FanOnCommomd(fan);
        rc.commond4 = new FanOffCommond(fan);

        rc.button1();
        rc.button2();
        rc.button3();
        rc.button4();

        rc.commond3 = new LinghOnCommomd(light);
        rc.commond4 = new LightOfCommand(light);
        rc.commond1 = new FanOnCommomd(fan);
        rc.commond2 = new FanOffCommond(fan);

        rc.button1();
        rc.button2();
        rc.button3();
        rc.button4();
    }
}
