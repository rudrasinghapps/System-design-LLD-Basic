package SystemDesign.class13;

public class Dsiplay2 implements Observor {

    public void getData(Subject ob) {
        CricketData cr = (CricketData)ob;
        System.out.println("Display -> 2" +" //  "+ cr.getOver() +" ->> " +" ->> "+cr.getRun() +"  -> "+ cr.getWickets() );
    }
}
