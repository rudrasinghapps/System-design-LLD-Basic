package SystemDesign.class11.adapter_DP;

public class Main {
    static void main() {
        AdapterStudent source = new AdapterStudent();
        Consumer consumer = new Consumer(source);
        consumer.printAllPhoneNumber();

       AdapterEmp emp = new AdapterEmp();
       Consumer consumer1 = new Consumer(emp);
       consumer1.printAllPhoneNumber();
    }
}
