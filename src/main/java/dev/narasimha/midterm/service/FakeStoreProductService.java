package dev.narasimha.midterm.service;

import dev.narasimha.midterm.models.Product;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class FakeStoreProductService implements ProductService{
    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getSingleProduct(Long id) {
        //lets calll the api

        return null;
    }

    @Override
    public String[] getAllCategories() {
        return new String[0];
    }

    @Override
    public List<Product> getSingleCategories(String category) {
        return null;
    }

    @Override
    public Product addNewProduct(Product product) {
        return null;
    }

    @Override
    public Product UpdateProduct(Long id) {
        return null;
    }

    @Override
    public Product DeleteProduct(Long id) {
        return null;
    }
}
