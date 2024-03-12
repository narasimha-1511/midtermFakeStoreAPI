package dev.narasimha.midterm.service;

import dev.narasimha.midterm.models.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    Product getSingleProduct(Long id);

    String[] getAllCategories();

    List<Product> getSingleCategories(String category);

    Product addNewProduct(Product product);

    Product UpdateProduct(Long id, Product product);

    Product DeleteProduct(Long id);
}
