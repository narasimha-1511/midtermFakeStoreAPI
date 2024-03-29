package dev.narasimha.midterm.controllers;


import dev.narasimha.midterm.models.Product;
import dev.narasimha.midterm.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/products/")
    public List<Product> GetAllProducts(){
        System.out.println("working in controller");
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getSingleProduct(@PathVariable("id") Long id){
        return productService.getSingleProduct(id);
    }


    @GetMapping("/products/categories")
    public String[] getAllCategories(){
        return productService.getAllCategories();
    }

    @GetMapping("/products/category/{category}")
    public List<Product> getInCategory(@PathVariable("category") String category){
    return productService.getSingleCategories(category);
    }

    @PostMapping("/products")
    public Product CreateProduct(@RequestBody Product product) {
        return productService.addNewProduct(product);
    }

    @PutMapping("/products/{id}")
    @PatchMapping("/products/{id}")
    public Product UpdateProduct(@PathVariable("id") Long id, @RequestBody Product product){
        return productService.UpdateProduct(id,product);
    }

    @DeleteMapping("/products/{id}")
    public Product DeleteProduct(@PathVariable("id") Long id){
        return productService.DeleteProduct(id);
    }
}

