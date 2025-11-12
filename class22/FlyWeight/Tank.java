package SystemDesign.class22.FlyWeight;

import java.awt.*;

public class Tank {
    public int x;
    public int y;
    public int currentHealth;

    public TankType tankType;

    @Override
    public String toString() {
        return "Tank{" +
                "x=" + x +
                ", y=" + y +
                ", currentHealth=" + currentHealth +
                ", tankType=" + tankType +
                '}';
    }
}
