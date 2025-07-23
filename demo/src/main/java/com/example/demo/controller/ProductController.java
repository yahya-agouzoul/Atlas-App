package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")

    public Optional<Product> getProductById(@PathVariable long id){

        return productService.getProductById(id);
    }

    @DeleteMapping("/{id}")

    public void deleteProduct(@PathVariable long id){
       productService.deleteProductById(id);
    }

}
