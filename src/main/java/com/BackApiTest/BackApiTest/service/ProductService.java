package com.BackApiTest.BackApiTest.service;


import com.BackApiTest.BackApiTest.entity.Product;
import com.BackApiTest.BackApiTest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public List<Product> getAll(){
        return repository.findAll();
    }

    public Product getById(Long id){
        return repository.findById(id).get();
    }

    public Product create(Product product){
        return  repository.save(product);
    }

    public Product update(Long id, Product product){
        Product productToUpdate = repository.findById(id).get();
        productToUpdate.setName(product.getName());
        productToUpdate.setPrice(product.getPrice());
        return repository.save(productToUpdate);
    }

    public void deleteProduct(Long id){
        repository.deleteById(id);
    }

}
