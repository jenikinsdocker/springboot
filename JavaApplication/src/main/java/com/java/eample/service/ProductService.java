package com.java.eample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.eample.entity.Product;
import com.java.eample.repository.ProductRepository;



@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product saveProductDetails(Product product) {
		return productRepository.save(product);
	}
    public List<Product> findAllProductDetails(){
    	List<Product> list=productRepository.findAll();
    	return list;
    }
}
