package services;

import entities.Product;

import java.util.List;
import java.util.Comparator;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductManagement implements Management {

    // 1️ Affichage simple
    @Override
    public void displayProducts(List<Product> products, Consumer<Product> con) {
        products.forEach(con);
    }

    // 2️ Affichage avec filtre
    @Override
    public void displayProductsByFilter(List<Product> products,
                                        Predicate<Product> pre,
                                        Consumer<Product> con) {
        products.stream()
                .filter(pre)
                .forEach(con);
    }

    // 3️ Retourner les noms des produits
    @Override
    public String returnProductsNames(List<Product> products,
                                      Function<Product, String> fun) {
        return products.stream()
                .map(fun)
                .collect(Collectors.joining(" | "));
    }

    // 4️ Création d’un produit
    @Override
    public Product createProduct(Supplier<Product> sup) {
        return sup.get();
    }

    // 5️ Tri des produits par id
    @Override
    public List<Product> sortProductsById(List<Product> products,
                                          Comparator<Product> com) {
        return products.stream()
                .sorted(com)
                .collect(Collectors.toList());
    }

    // 6️ Conversion en Stream
    @Override
    public Stream<Product> convertToStream(List<Product> products) {
        return products.stream();
    }
}
