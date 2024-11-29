package com.damian.sd.repo;

import com.damian.sd.enitity.Product;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@EnableScan
@Repository
public interface ProductRepository extends CrudRepository<Product, String> { }
