package SystemDesign.adapter_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDetails {

    List<String> list;

    StudentDetails(){
        list = new ArrayList<>();
    }

    public List<String> getAllStudent(){
        list.add("Name-Rudra , RollNo-10 , MobileNumber-9598636895");
        list.add("Name-Rudra , RollNo-10 , MobileNumber-9598636895");
        list.add("Name-Akash , RollNo-11 , MobileNumber-9876543210");
        list.add("Name-Neha , RollNo-12 , MobileNumber-9123456780");
        list.add("Name-Rajesh , RollNo-13 , MobileNumber-9812345678");
        list.add("Name-Simran , RollNo-14 , MobileNumber-9898989898");
        list.add("Name-Aryan , RollNo-15 , MobileNumber-9001122334");
        list.add("Name-Pooja , RollNo-16 , MobileNumber-9090909090");

        return list;
    }


}
