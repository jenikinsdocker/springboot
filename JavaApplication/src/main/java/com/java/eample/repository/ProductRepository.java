package com.java.eample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.eample.entity.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
