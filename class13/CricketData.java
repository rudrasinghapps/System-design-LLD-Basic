package SystemDesign.class13;

public class CricketData extends  Subject {

   private int run;
   private int over;
   private int wickets;

   public void setData(int run , int over , int wickets){
       setRun(run);
       setOver(over);
       setWickets(wickets);
       dataUpdated();

   }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getOver() {
        return over;
    }

    public void setOver(int over) {
        this.over = over;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }
}
