package com.damian.sd.service;

import com.damian.sd.enitity.Product;
import com.damian.sd.repo.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);

    }

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
