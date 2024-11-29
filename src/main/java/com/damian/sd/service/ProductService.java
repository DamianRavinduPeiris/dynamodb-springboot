package com.damian.sd.service;

import com.damian.sd.enitity.Product;

public interface ProductService {
    Product saveProduct(Product product);

    Iterable<Product> getAllProducts();
}
