package SystemDesign.command_design_pattern;

public class Main {
    static void main() {
        Fan fan = new Fan();
        Light light = new Light();

        Remote remote = new Remote();
        remote.command1 = new LightOnCommand(light);
        remote.command2 = new LightOffCommand(light);
        remote.command3 = new FanOnCommand(fan);
        remote.command4 = new FanOffCommand(fan);

        remote.button1();
        remote.button2();
        remote.button3();
        remote.button4();
        System.out.println("------------------------");


        remote.command3 = new LightOnCommand(light);
        remote.command4 = new LightOffCommand(light);
        remote.command1 = new FanOnCommand(fan);
        remote.command2 = new FanOffCommand(fan);

        remote.button1();
        remote.button2();
        remote.button3();
        remote.button4();
        System.out.println("------------------------");

        remote.command2 = new LightOnCommand(light);
        remote.command3 = new LightOffCommand(light);
        remote.command1 = new FanOnCommand(fan);
        remote.command4 = new FanOffCommand(fan);

        remote.button1();
        remote.button2();
        remote.button3();
        remote.button4();


    }
}
