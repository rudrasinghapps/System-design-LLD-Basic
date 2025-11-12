package SystemDesign.class18.Proxy_DP;

import java.util.HashMap;

public class ProxyClass implements Task {
    RealClass realClass = new RealClass() ;
    private HashMap<Integer , Integer> map = new HashMap<>();


    @Override
    public int m1(int x) {
        if(map.containsKey(x)){
            System.out.println("from map");
            return map.get(x);
        }
        int temp = realClass.m1(x);
        map.put(x ,temp);
        return  temp;
    }

    @Override
    public int m2(int x, int y) {
        return realClass.m2(x,y);
    }
}
