package SystemDesign.class24.Factory_DP;

public class Test {
    static void main() {
      CarRentService car1 = new HyundaiCarService();

        car1.rentCar(100);

      CarRentService car2 = new MarutiCarService();
      car2.rentCar(200);
    }
}
