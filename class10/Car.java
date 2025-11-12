package SystemDesign.class10;

import java.awt.*;
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
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        Car temp = (Car)o;
        if(this.price == temp.price && this.speed == temp.speed)
            return  true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return  Objects.hashCode(this.price+this.speed);
    }

    public Car methodCar(){
     return this;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", speed=" + speed +
                '}' ;
    }
}
