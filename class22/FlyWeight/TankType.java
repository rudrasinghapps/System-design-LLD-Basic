package SystemDesign.class22.FlyWeight;

import java.awt.*;

public class TankType {
    String typeName;
    public int power;
    public int orginalHealth;
    public Image img;

    public TankType(String typeName, int power, int orginalHealth, Image img) {
        this.typeName = typeName;
        this.power = power;
        this.orginalHealth = orginalHealth;
        this.img = img;
    }

    @Override
    public String toString() {
        return "TankType{" +
                "typeName='" + typeName + '\'' +
                ", power=" + power +
                ", orginalHealth=" + orginalHealth +
                ", img=" + img +
                '}';
    }
}
