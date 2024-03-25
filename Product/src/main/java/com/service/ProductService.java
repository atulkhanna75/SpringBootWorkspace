package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Product;
import com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public List<Product> findAllProduct() {
		return productRepository.findAll();
	}
	
	public Product findProductInfo(int prodid) {
		Optional<Product> op = productRepository.findById(prodid);
		if(op.isPresent()) {
			Product prd= op.get();
			return prd;
		}else {
			return null;
		}
	}
	
	public String productCreate(Product product) {
		Optional<Product> op = productRepository.findById(product.getprodid());
		if(op.isPresent()) {
			return "Product is already present, it must be unique";  
		}else {
			productRepository.save(product);
			return "Product Created successfully";
		}
	}
	public String deleteProduct(int prodid) {
		Optional<Product> op = productRepository.findById(prodid);
		if(op.isPresent()) {
			Product prd= op.get();
			productRepository.delete(prd);
			return "Product deleted successfully";
		}else {
			return "Product didn't exist";
		}
	}
		
}