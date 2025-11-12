package SystemDesign.adapter_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class StudentAdapter implements IPhoneNumbe{

    StudentDetails details;

    StudentAdapter(){
        details = new StudentDetails();
    }

    @Override
    public List<String> getPhoneNumer() {
        List<String> mobileNumber = new ArrayList<>();

        for(String str :details.getAllStudent()){
            int len = str.length();
            String number = str.trim().substring(len-10 ,len);
            mobileNumber.add(number);
        }

        return  mobileNumber;
    }
}
