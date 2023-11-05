import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        Category category = new Category();
        Basket basket = new Basket();
        Shop shop = new Shop();
        User user = new User();
        Category category1 = new Category("Хозяйственные товары");
        category1.addProduct(new Product("Мыло", 20.0, 5));
        category1.addProduct(new Product("Верёвка", 15.0, 3));
        category1.addProduct(new Product("Табуретка", 50.0, 4));

        Category category2 = new Category("Сопутствующие товары");
        category2.addProduct(new Product("Водка", 150.0, 3));
        category2.addProduct(new Product("Селёдка", 35.0, 4));
        category2.addProduct(new Product("Сигареты", 50.0, 5));

        shop.addCategory(category1);
        shop.addCategory(category2);
        shop.printCatalog();

        User user1 = new User("Пользователь номер 1", "Пароль 1",basket);
        User user2 = new User("Пользователь номер 2", "Пароль 2",basket);

        user1.getBasket().addProduct(category1.getProducts().get(0));
        user2.getBasket().addProduct(category2.getProducts().get(1));

        category1.getProducts().remove(0);
        category2.getProducts().remove(1);

        System.out.println(user1.getLogin() + " - Покупки: ");
        ArrayList<Product> user1Products = user1.getBasket().getProducts();
        for (Product products: user1Products) {
            System.out.println("- " + product.getName() + " - " + product.getPrice() + " -  " + product.getRating());
        }

        System.out.println(user2.getLogin() + " - Покупки: ");
        ArrayList<Product> user2Products = user2.getBasket().getProducts();
        for (Product products: user2Products) {
            System.out.println("- " + product.getName() + " - " + product.getPrice() + " -  " + product.getRating());
        }
    }
}
