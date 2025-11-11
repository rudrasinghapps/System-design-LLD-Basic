package SystemDesign.class11.adapter_DP;

import java.util.ArrayList;
import java.util.List;

public class AdapterStudent implements IPhoneListSource{

    StudentDetails details;

    AdapterStudent(){
        this.details =new StudentDetails();
    }


    @Override
    public List<String> getPhoneNumber() {
        List<String> result = new ArrayList<>();
        for(String s:details.getAllStudent()){
            String[] parts = s.split(",");
            result.add(parts[2].trim());
        }
        return result;
    }
}
