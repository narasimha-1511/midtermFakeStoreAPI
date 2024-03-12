package dev.narasimha.midterm.service;

import dev.narasimha.midterm.dto.FakeStoreCategoryDto;
import dev.narasimha.midterm.dto.FakeStoreProductDto;
import dev.narasimha.midterm.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.PrimitiveIterator;

@Service
public class FakeStoreProductService implements ProductService{
    private RestTemplate restTemplate = new RestTemplate();
    private String fakeStoreAPI = "https://fakestoreapi.com/";

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    public Product getSingleProduct(Long id) {

        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject(
                fakeStoreAPI+"products/"+id,
                FakeStoreProductDto.class
        );

        //we have a fake store DTO => convert to Product
        Product product = new Product();
        product.setId(fakeStoreProductDto.getId());
        product.setCategory(fakeStoreProductDto.getCategory());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setDescription(fakeStoreProductDto.getDescription());
        product.setPrice(fakeStoreProductDto.getPrice());
        product.setImageURL(fakeStoreProductDto.getImage());

        return product;
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
