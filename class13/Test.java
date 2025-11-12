package SystemDesign.class13;

public class Test {
    static void main() {

        CricketData cr = new CricketData();
        cr.setData(10,10,10);

        Dsiplay1 dp1 = new Dsiplay1();
        Dsiplay2 dp2 = new Dsiplay2();

        cr.register(dp1);
        cr.register(dp2);

        cr.setData(10,10,10);
        cr.setData(10,10,10);

        cr.setRun(55);
        cr.setOver(33);

        cr.setWickets(4);





    }



}
