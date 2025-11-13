package SystemDesign.observer_design_pattern;

public class Cricket extends Subject {

   private int currentRun;
   private int totalOver;
   private int currentOver;

    public Cricket(int currentRun, int totalOver, int currentOver) {
        this.currentRun = currentRun;
        this.totalOver = totalOver;
        this.currentOver = currentOver;
    }

    public void setCurrentRun(int run) {
        this.currentRun = run;
        this.notifyObserver();
    }

    public void setCurrentOver(int over) {
        this.currentOver = over;
        this.notifyObserver();
    }

    public int getCurrentRun() {
        return currentRun;
    }

    public int getTotalOver() {
        return totalOver;
    }

    public int getCurrentOver() {
        return currentOver;
    }
}
