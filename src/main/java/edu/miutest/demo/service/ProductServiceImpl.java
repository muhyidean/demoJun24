package edu.miutest.demo.service;

import edu.miutest.demo.entity.Product;
import edu.miutest.demo.entity.dto.response.ProductSimpleDto;
import edu.miutest.demo.repo.ProductRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public ProductSimpleDto findById(int id) {
        return modelMapper.map(productRepo.getById(id),ProductSimpleDto.class);
    }
}
