package SystemDesign.adapter_design_pattern;

public class Main {
    static void main() {
          StudentAdapter studentAdapter = new StudentAdapter();
          EmployeeAdapter employeeAdapter = new EmployeeAdapter();

          Consumer consumer = new Consumer(studentAdapter);
          consumer.printAllPhoneNumber();
    }
}
