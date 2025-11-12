package SystemDesign.adapter_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDetails {
    List<String> employees;

    EmployeeDetails(){
        employees = new ArrayList<>();
    }

    public List<String> getAllEmployee(){
        employees.add("Id-101 , Name-Rudra Pratap Singh , Department-IT , Salary-65000 , Mobile-9598636895");
        employees.add("Id-102 , Name-Akash Verma , Department-Finance , Salary-55000 , Mobile-9876543210");
        employees.add("Id-103 , Name-Neha Sharma , Department-HR , Salary-60000 , Mobile-9123456780");
        employees.add("Id-104 , Name-Rajesh Kumar , Department-Marketing , Salary-58000 , Mobile-9812345678");
        employees.add("Id-105 , Name-Simran Kaur , Department-IT , Salary-70000 , Mobile-9898989898");
        employees.add("Id-106 , Name-Aryan Gupta , Department-Sales , Salary-52000 , Mobile-9001122334");
        employees.add("Id-107 , Name-Pooja Mehta , Department-Admin , Salary-50000 , Mobile-0000000000");

        return employees;
    }
}
