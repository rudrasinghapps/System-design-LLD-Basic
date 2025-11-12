package SystemDesign.adapter_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAdapter implements IPhoneNumbe{

    EmployeeDetails details;

    public EmployeeAdapter() {
        details = new EmployeeDetails();
    }

    @Override
    public List<String> getPhoneNumer() {
        List<String> mobileNumbers = new ArrayList<>();

        for (String str : details.getAllEmployee()) {
            int len = str.length();
            String number = str.trim().substring(len - 10, len);
            mobileNumbers.add(number);
        }
        return mobileNumbers;
    }
}
