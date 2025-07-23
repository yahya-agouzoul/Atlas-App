package com.example.demo.service;

import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Product;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

     @Autowired
     ProductRepository productRepository ;

     public List<Product> getAllProducts(){
         return productRepository.findAll();
     }
    public Optional<Product> getProductById(Long id){
        return productRepository.findById(id);
    }
    public void deleteProductById(Long id){
        productRepository.deleteById(id);
    }
}
