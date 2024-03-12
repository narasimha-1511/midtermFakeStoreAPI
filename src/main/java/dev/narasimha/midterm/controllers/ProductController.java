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

    //you should receive the body of the json
    //how do you do??
    // using URL Params as you know
    // BEst --> USe a Request Body.
    @PostMapping("/products")
    public Product CreateProduct(@RequestBody Product product) {
        System.out.println("create a product");
        return null;
        // return new product
//        return new
    }
}

