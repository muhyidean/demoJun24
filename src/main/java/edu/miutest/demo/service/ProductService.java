package edu.miutest.demo.service;

import edu.miutest.demo.entity.Product;
import edu.miutest.demo.entity.dto.response.ProductSimpleDto;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    ProductSimpleDto findById(int id);
}
