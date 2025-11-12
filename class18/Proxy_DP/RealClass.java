package SystemDesign.class18.Proxy_DP;

public class RealClass implements Task{
    @Override
    public int m1(int x) {
        return x*x;
    }

    @Override
    public int m2(int x, int y) {
        return x+y;
    }
}
