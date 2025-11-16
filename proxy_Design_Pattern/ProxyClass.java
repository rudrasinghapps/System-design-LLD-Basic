package SystemDesign.proxy_Design_Pattern;

import java.util.HashMap;

public class ProxyClass implements Task {

    private RealClass realClass;
    private HashMap<Integer, Integer> proxyMap;

    ProxyClass() {
        realClass = new RealClass();
        proxyMap = new HashMap<>();
    }

    @Override
    public int calculateTask(int x) {
        if (proxyMap.containsKey(x)) {
            System.out.println("Returned from cache");
            return proxyMap.get(x);
        }
        System.out.println("Computed by RealClass");
        int temp = realClass.calculateTask(x);
        proxyMap.put(x, temp);
        return temp;
    }

    @Override
    public int calculateTask(int x, int y) {
        return realClass.calculateTask(x, y);
    }
}
