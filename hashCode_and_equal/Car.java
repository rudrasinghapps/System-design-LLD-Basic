package SystemDesign.hashCode_and_equal;

import java.util.Objects;

public class Car {
    int price;
    int speed;

    public Car(int price, int speed) {
        this.price = price;
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;                                          // for checking same insatance twice ..
        if(o == null || this.getClass() != o.getClass()) return false;      //  for checking both object are same class or not...
        Car temp = (Car)o;
        if(this.price == temp.price && this.speed == temp.speed)  return  true;
        else  return false;

    }

    @Override
    public int hashCode() {
        return  Objects.hash(this.price , this.speed);                // HashCode on the basis of price and speed.....
    }


    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", speed=" + speed +
                '}' ;
    }
}
