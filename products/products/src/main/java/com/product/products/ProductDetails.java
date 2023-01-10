package com.product.products;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "details")
public class ProductDetails {
	
	@Transient
    public static final String SEQUENCE_NAME = "users_sequence";
	
	@Id
	Long id;
	String productName;
	Integer productPrice;
	Integer productDiscount;
	Date productExpiry;
	public ProductDetails() {
		
	}
	public ProductDetails(Long id, String productName, Integer productPrice, Integer productDiscount,
			Date productExpiry) {
		super();
		this.id = id;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDiscount = productDiscount;
		this.productExpiry = productExpiry;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}
	public Integer getProductDiscount() {
		return productDiscount;
	}
	public void setProductDiscount(Integer productDiscount) {
		this.productDiscount = productDiscount;
	}
	public Date getProductExpiry() {
		return productExpiry;
	}
	public void setProductExpiry(Date productExpiry) {
		this.productExpiry = productExpiry;
	}
	@Override
	public String toString() {
		return "ProductDetails [id=" + id + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productDiscount=" + productDiscount + ", productExpiry=" + productExpiry + "]";
	}
	
	
	

}
