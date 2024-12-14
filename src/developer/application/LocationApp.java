package developer.application;

import developer.data.City;

/**
 * Abstract Class
 */
public class LocationApp {
    public static void main(String[] args) {
        //var location = new Location(); // Error
        var city = new City();
        city.name = "New York";
        System.out.println(city.name);
    }
}
