import java.util.ArrayList;

public class Shop {
    private ArrayList<Category> categories;


    public Shop(ArrayList<Category> categories) {
        this.categories = new ArrayList<>();
    }

    public Shop() {
    }


    public void addCategory(Category category) {
        categories.add(category);
    }

    public void printCatalog() {
        for (Category category : categories) {
            System.out.println(category.getName());
            ArrayList<Product> products = category.getProducts();
            for (Product product : products) {
                System.out.println(" - " + product.getName() + " - ");
            }
        }
    }


}
