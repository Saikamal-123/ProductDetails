package com.product.products;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface ProductRepository extends MongoRepository<ProductDetails,Long>{

}
