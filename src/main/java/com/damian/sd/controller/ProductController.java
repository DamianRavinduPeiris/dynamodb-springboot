package com.damian.sd.controller;

import com.damian.sd.enitity.Product;
import com.damian.sd.response.Response;
import com.damian.sd.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/products",consumes = "application/json",produces = "application/json")
@CrossOrigin
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping(path = "/save")
    public ResponseEntity<Response> saveProduct(@RequestBody Product product) {
        return ResponseEntity.ok(new Response("Product saved successfully!",
                productService.saveProduct(product)));
    }
    @GetMapping(path = "/fetchAll")
    public ResponseEntity<Response> getAllProducts() {
        return ResponseEntity.ok(new Response("All products fetched successfully!",
                productService.getAllProducts()));
    }


}
