package com.BackApiTest.BackApiTest.controller;



import com.BackApiTest.BackApiTest.entity.Product;
import com.BackApiTest.BackApiTest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping()
    public List<Product> getAll(){
        return service.getAll();
    }

    @GetMapping("{/id}")
    public Product findById(@PathVariable Long id){
        return service.getById(id);
    }

    @PostMapping()
    public Product create(@RequestBody Product product){
        return service.create(product);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product){
        return service.update(id, product);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        service.deleteProduct(id);
    }



}
