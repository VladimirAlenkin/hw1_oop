import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> products;


    public Basket(ArrayList<Product> products) {
        this.products = products;
    }
    public Basket() {
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }
}
