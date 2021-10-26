import java.util.Collection;

public class Cart {
    private Collection<Product> products;

    public Cart(Collection<Product> products) {
        this.products = products;
    }

    public Collection<Product> getProducts() {
        return products;
    }

    public void setProducts(Collection<Product> products) {
        this.products = products;
    }

}
