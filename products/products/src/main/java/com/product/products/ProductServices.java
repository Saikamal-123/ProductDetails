package com.product.products;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductServices {

	@Autowired
	SequenceGenerator sequenceGenerator;

	 @Autowired
	    private com.product.products.ProductRepository productRepository;


	    public List<ProductDetails> returnAll()
	    {
	        List<ProductDetails> Products = new ArrayList<>();
	        productRepository.findAll()
	        .forEach(Products::add);
	        return Products;
	    }


	    public Optional<ProductDetails> getProduct(Long id)
	    {
	        return productRepository.findById(id);
	    }
	    public void addProduct(ProductDetails item)
	    {
	    	 item.setId(sequenceGenerator.generateSequence(ProductDetails.SEQUENCE_NAME));
	    	productRepository.save(item);
	    }
	    public void deleteProduct(Long id)
	    {
	    	productRepository.deleteById(id);
	    }
	    public void updateProduct(Long id,ProductDetails product)
	    {
	    	productRepository.save(product);
	    }
}
