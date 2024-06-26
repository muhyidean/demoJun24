//package edu.miutest.demo.entity;
//
//import com.fasterxml.jackson.annotation.JsonManagedReference;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//public class ProductOld {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    private String name;
//    private float price;
//    private String category;
//    private int discount;
//    private int starCount; // star_count
//    private boolean deleted;
//    private LocalDateTime createdAt;
//
//    @OneToMany()
//    @JoinColumn(name = "product_id")
//    @JsonManagedReference
//    private List<Review> reviews;
//
////    public Product(int id, String name, float price, List<Review> reviews) {
////        this.id = id;
////        this.name = name;
////        this.price = price;
//////        this.reviews = reviews;
////    }
//}
