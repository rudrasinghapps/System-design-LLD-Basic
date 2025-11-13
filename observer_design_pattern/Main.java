package SystemDesign.observer_design_pattern;

public class Main {
    static void main() {
        Display1 display1 = new Display1();
        Display2 display2 = new Display2();
        Display3 display3 = new Display3();

        Cricket subject = new  Cricket(10,10,10);
        subject.addObserver(display1);
        subject.addObserver(display2);
        subject.addObserver(display3);

        subject.notifyObserver();

        subject.setCurrentRun(20);
        subject.setCurrentRun(30);

        subject.setCurrentOver(5);
        subject.setCurrentOver(3);




    }




}
