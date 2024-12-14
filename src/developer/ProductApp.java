package developer;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("MacBook Pro",10);
        System.out.println(product.name);
        System.out.println(product.price);
        System.out.println(product);

        Product product2 = new Product("MacBook Pro",10);
        /**
         * equals Method
         */
        System.out.println(product2.equals(product));

        /**
         * hashcode Method
         */
        System.out.println(product2.hashCode() == product.hashCode());
    }
}
