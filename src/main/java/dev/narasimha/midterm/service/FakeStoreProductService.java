package dev.narasimha.midterm.service;

import dev.narasimha.midterm.dto.FakeStoreCategoryDto;
import dev.narasimha.midterm.dto.FakeStoreProductDto;
import dev.narasimha.midterm.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeStoreProductService implements ProductService{
    private  RestTemplate  restTemplate = new RestTemplate();
    private  String fakeStoreAPI = "https://fakestoreapi.com/";

    @Override
    public List<Product> getAllProducts() {
        System.out.println("inside func");
        FakeStoreProductDto[] fakeStoreProductDto = restTemplate.getForObject(
                fakeStoreAPI+"products/",
                FakeStoreProductDto[].class
        );

        System.out.println("calling all the products");

        List<Product> products = new ArrayList<>();

        for(FakeStoreProductDto dto: fakeStoreProductDto){

            Product product = new Product();
            product.setId(dto.getId());
            product.setCategory(dto.getCategory());
            product.setTitle(dto.getTitle());
            product.setDescription(dto.getDescription());
            product.setPrice(dto.getPrice());
            product.setImageURL(dto.getImage());

            products.add(product);
        }

        return products;
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
        String[] fakeStoreCategoryDto =  restTemplate.getForObject(
                fakeStoreAPI+"products/categories",
                String[].class
        );

        return fakeStoreCategoryDto;
    }

    @Override
    public List<Product> getSingleCategories(String category) {

        FakeStoreProductDto[] fakeStoreProductDto = restTemplate.getForObject(
                fakeStoreAPI+"products/category/"+category,
                FakeStoreProductDto[].class
        );

        List<Product> products = new ArrayList<>();

        for(FakeStoreProductDto dto: fakeStoreProductDto){

            Product product = new Product();
            product.setId(dto.getId());
            product.setCategory(dto.getCategory());
            product.setTitle(dto.getTitle());
            product.setDescription(dto.getDescription());
            product.setPrice(dto.getPrice());
            product.setImageURL(dto.getImage());

            products.add(product);
        }

        return products;
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
