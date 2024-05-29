package edu.miutest.demo.repo;

import edu.miutest.demo.entity.Product;
import edu.miutest.demo.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Integer> {


}
