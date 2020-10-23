package com.example.productmanagement.service;

import com.example.productmanagement.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product save(Product product);

    void delete(Product product);

    void update(Long id, Product product);

    Product findById(Long id);

    void deleteById(Long id);

    Iterable<Product> search(String keyword);

}
