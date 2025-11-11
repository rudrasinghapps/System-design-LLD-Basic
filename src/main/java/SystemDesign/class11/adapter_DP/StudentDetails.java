package SystemDesign.class11.adapter_DP;

import java.util.ArrayList;
import java.util.List;

public class StudentDetails {
    public List<String> getAllStudent(){
        List<String>  list = new ArrayList<>();

        list.add("1 , A , 95986368987");
        list.add("2 , B , 95986368988");
        list.add("3 , C , 95986368989");
        list.add("4 , D , 95986368980");
        list.add("5 , E , 95986368981");
        list.add("6 , F , 95986368982");

        return list;
    }
}
