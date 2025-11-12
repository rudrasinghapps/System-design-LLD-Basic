package SystemDesign.hashCode_and_equal;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main() {

        // Lambo  and  Bmw extends Car class

        Car car1 = new Car(10, 100);
        Car car2 = new Car(10, 100);
        Car car3 = new Car(10, 100);

        Lambo lambo1 = new Lambo(10, 100);
        Lambo lambo2 = new Lambo(10, 100);
        Lambo lambo3 = new Lambo(10, 100);

        Bmw bmw1 = new Bmw(10, 100);
        Bmw bmw2 = new Bmw(10, 100);
        Bmw bmw3 = new Bmw(10, 100);

        Map<Car, Integer> map = new HashMap<>();

        map.put(car1, map.getOrDefault(car1, 0) + 1);
        map.put(car2, map.getOrDefault(car1, 0) + 1);
        map.put(car3, map.getOrDefault(car3, 0) + 1);

        map.put(lambo1, map.getOrDefault(lambo1, 0) + 1);
        map.put(lambo2, map.getOrDefault(lambo2, 0) + 1);
        map.put(lambo3, map.getOrDefault(lambo3, 0) + 1);

        map.put(bmw1, map.getOrDefault(bmw1, 0) + 1);
        map.put(bmw2, map.getOrDefault(bmw2, 0) + 1);
        map.put(bmw3, map.getOrDefault(bmw3, 0) + 1);


        System.out.println(map);


    }
}
