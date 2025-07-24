package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
public class Product {

    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(nullable = false)
    private String name;

    @Setter
    @Column(length = 1000)
    private String description;

    @Setter
    @Column(nullable = false)
    private Double price;

    @Setter
    @Column(nullable = false)
    private String image ;

    @Setter
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Setter
    @Column(nullable = false)
    private Integer stock;

    @Setter
    @Column
    private Double rating ;

    @Setter
    @Column
    private String video ;


    @Setter
    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt = LocalDateTime.now();

    @PreUpdate
    public void setUpdatedAt() {
        this.updatedAt = LocalDateTime.now();
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
