package SystemDesign.Interface;

import java.util.ArrayList;
import java.util.List;

public class Test {
    static void main() {

        List<Temp> list = new ArrayList<>();

        dis1 dp1 = new dis1("Netflix");
        dis2 dp2 = new dis2("prime");
        dis3 dp3 = new dis3("Hotstar");

        list.add(dp1);
        list.add(dp2);
        list.add(dp3);

        for(Temp t:list){
            t.getData("Archery Started");
        }


    }
}
