package SystemDesign.observer_design_pattern;

public class Display3 implements Observer {
    @Override
    public void update(Subject subject) {
        Cricket cr = ((Cricket) subject);
        System.out.println("Display 3 *****************************");
        System.out.println("Current Over -> " + cr.getCurrentOver());
        System.out.println("Current Run -> " + cr.getCurrentRun());
        System.out.println("Total Over -> " + cr.getTotalOver());
        System.out.println();
    }
}
