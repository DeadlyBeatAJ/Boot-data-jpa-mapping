package com.deadlybeat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deadlybeat.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
