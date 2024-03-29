package dev.narasimha.midterm.service;

import dev.narasimha.midterm.dto.FakeStoreCategoryDto;
import dev.narasimha.midterm.dto.FakeStoreProductDto;
import dev.narasimha.midterm.models.Product;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
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

            Product product = new Product(dto);


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
        Product product = new Product(fakeStoreProductDto);


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

            Product product = new Product(dto);

            products.add(product);
        }

        return products;
    }

    @Override
    public Product addNewProduct(Product product) {
        // just ignoring the id of the product as it won't be given

        FakeStoreProductDto fakeStoreProductDto1 = new FakeStoreProductDto();
        fakeStoreProductDto1.FakeStoreCategoryDto(product);

        FakeStoreProductDto fakeStoreProductDto = restTemplate.postForObject(
                fakeStoreAPI+"products",
                    fakeStoreProductDto1,
                    FakeStoreProductDto.class
        );

        Product product1 = new Product(fakeStoreProductDto);


        return product1;
    }

    @Override
    public Product UpdateProduct(Long id, Product product1) {

        FakeStoreProductDto dto = new FakeStoreProductDto();
        dto.FakeStoreCategoryDto(product1);

        restTemplate.put(
                fakeStoreAPI+"products/"+id,
                dto
        );


        Product product = new Product(dto);


        return product;
    }

    @Override
    public Product DeleteProduct(Long id) {
        FakeStoreProductDto fakeStoreProductDto = new FakeStoreProductDto();

        restTemplate.delete(fakeStoreAPI+"products/"+id,fakeStoreProductDto);

        return getSingleProduct(id);
    }
}
