package dev.narasimha.midterm.controllers;


import dev.narasimha.midterm.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {



    @GetMapping("/products")
    public List<Product> GetAllProducts(){
        return new ArrayList<>();
    }

    @GetMapping("/products/{id}")
    public Product getSingleProduct(@PathVariable("id") Long id){
        System.out.println("hello");
        return new Product();
    }

    //you should recive the body of the json
    //how do you do??
    // using URL Params as you know..
    // BEst --> USe a Request Body.
    @PostMapping("/products")
    public Product CreateProduct(@RequestBody Product product) {
        System.out.println("create a product");
        return null;
        // return new product
//        return new
    }
}

