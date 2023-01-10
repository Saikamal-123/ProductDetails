package com.product.products;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ProductController {
	
	@Autowired
	ProductServices productservices;
	
	@RequestMapping("/allproducts")
	public List<ProductDetails> returnAll()
	{
		return productservices.returnAll();
	}
	@RequestMapping("/allproducts/{id}")
	 public Optional<ProductDetails> getProducts(@PathVariable Long id)
    {
        return productservices.getProduct(id);
    }
	@RequestMapping(method= RequestMethod.POST,value="/allproducts")
    public void addProducts(@RequestBody ProductDetails product)
    {
		productservices.addProduct(product);
    }
	@RequestMapping(method=RequestMethod.DELETE,value="/allproducts/{id}")
    public void deleteProducts(@PathVariable Long id)
    {
		productservices.deleteProduct(id);
    }
	 @RequestMapping(method=RequestMethod.PUT,value="/allproducts/{id}")
	    public void updateProducts(@RequestBody ProductDetails product,@PathVariable Long id)
	    {
		 productservices.updateProduct(id, product);
	    }

}
