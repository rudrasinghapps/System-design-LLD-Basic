package SystemDesign.class10;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main() {
        Car car1 = new Car(10,100);
        Car car2 = new Car(10,100);
        Car car3 = new Car(10,100);
        Car car4 = new Car(10,100 );
        Car car5 = new Car(10,100);
        Car car6 = new Car(10,100);
        Car car7 = new Car(10,100);
        Lambo lambo = new Lambo(10,100);
        Bmw bmw = new Bmw(10,100);



        Map<Car , Integer> map = new HashMap<>();

        map.put(car1 , map.getOrDefault(car1,0) +1);
        map.put(car2 , map.getOrDefault(car1,0) +1);
        map.put(car3 , map.getOrDefault(car3,0) +1);
        map.put(car4 , map.getOrDefault(car4,0) +1);
        map.put(car5 , map.getOrDefault(car5,0) +1);
        map.put(car6 , map.getOrDefault(car6,0) +1);
        map.put(car7 , map.getOrDefault(car7,0) +1);
        map.put(lambo, map.getOrDefault(lambo,0)+1);
        map.put(bmw, map.getOrDefault(bmw,0)+1);

        System.out.println(map);








    }
}
