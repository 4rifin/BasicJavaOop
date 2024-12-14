package developer.application;

import developer.data.Customer;
import developer.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Arifin");
        customer.setLevel(Level.STANDARD);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.STANDARD.name();
        System.out.println();

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        Level[] levels = Level.values();
        System.out.println("print Level");
        for (Level level1 : levels) {
            System.out.println(level1);
        }
    }
}
