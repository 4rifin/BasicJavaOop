package developer.application;

/**
 * Import Class Product
 */
import developer.Product;



public class Application {
    public static void main(String[] args) {
        Product product = new Product("MacBook Pro",101);
        System.out.println(product.name);
    }
}
