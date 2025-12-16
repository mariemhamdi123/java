import entities.Product;
import services.ProductManagement;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ProductManagement pm = new ProductManagement();

        List<Product> products = new ArrayList<>();

        products.add(new Product(3, "PC", 2500));
        products.add(new Product(1, "Clavier", 80));
        products.add(new Product(2, "Souris", 50));

        System.out.println("📌 Tous les produits :");
        pm.displayProducts(products, System.out::println);

        System.out.println("\n📌 Produits prix > 100 :");
        pm.displayProductsByFilter(
                products,
                p -> p.getPrix() > 100,
                System.out::println
        );

        System.out.println("\n📌 Noms des produits :");
        System.out.println(
                pm.returnProductsNames(products, Product::getNom)
        );

        System.out.println("\n📌 Produit créé par Supplier :");
        Product p = pm.createProduct(() -> new Product(4, "Casque", 150));
        System.out.println(p);

        System.out.println("\n📌 Produits triés par ID :");
        pm.sortProductsById(products,
                        Comparator.comparing(Product::getId))
                .forEach(System.out::println);
    }
}
