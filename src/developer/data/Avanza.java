package developer.data;

import java.io.Serializable;

public class Avanza implements Car,IsMaintenance{
    public void drive() {
        System.out.println("avanza Drive");
    }

    public int getSpeed() {
        return 4;
    }


    public String getBrandName() {
        return "Toyota";
    }

    public boolean isMaintenance() {
        return false;
    }
}
