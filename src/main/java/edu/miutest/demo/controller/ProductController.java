package edu.miutest.demo.controller;


import edu.miutest.demo.entity.Product;
import edu.miutest.demo.entity.dto.response.ProductSimpleDto;
import edu.miutest.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> findAll(){
        return productService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public ProductSimpleDto findById(@PathVariable("id") int id){
        return productService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping// POST api/v1/products
    public void save(@RequestBody Product p){
//        productService.save(p);
    }

}
