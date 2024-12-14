package developer.application;

import developer.data.Avanza;
import developer.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        car.drive();
        System.out.println(car.getSpeed());

    }
}
