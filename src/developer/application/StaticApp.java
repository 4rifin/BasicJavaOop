package developer.application;
/**
 * static Import
 */
import static developer.data.Application.PROCECCORS;
import static developer.data.Constant.*;

import developer.data.Country;
import developer.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        //static class constant
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        //static class mehtod
        System.out.println(MathUtil.sum(1,1,1,1,1));

        Country.city city= new Country.city();
        city.setName("Indonesia");
        System.out.println(city.getName());

        //Block Static
        System.out.println(PROCECCORS);
    }
}
