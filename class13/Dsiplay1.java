package SystemDesign.class13;

public class Dsiplay1 implements Observor {

    public void getData(Subject ob) {
        CricketData cr = (CricketData)ob;
        System.out.println("Display -> 1" +" //  "+ cr.getOver() +" ->> " +" ->> "+cr.getRun() +"  -> "+ cr.getWickets() );
    }
}
