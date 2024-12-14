package developer;

import java.util.Objects;

public class Product {
    public  String name;
    public int price;
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    /**
     * ToString Method override
     * @return
     */
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
