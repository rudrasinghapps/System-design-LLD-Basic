package SystemDesign.class11.adapter_DP;

import java.util.ArrayList;
import java.util.List;

public class AdapterEmp implements IPhoneListSource{

    EmpDetainls detainls ;

    AdapterEmp(){
        this.detainls = new EmpDetainls();
    }

    @Override
    public List<String> getPhoneNumber() {

        List<String> temp = new ArrayList<>();

        for(String s:detainls.getAllEmp()){
            String[] number = s.split(",");
            temp.add(number[2].trim());
        }
         return  temp;
    }
}
