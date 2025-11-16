package SystemDesign.proxy_Design_Pattern;

public class RealClass implements Task {
    @Override
    public int calculateTask(int x) {
        return x*x;
    }

    @Override
    public int calculateTask(int x, int y) {
        return x+y*2;
    }
}
