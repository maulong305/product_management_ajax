package com.example.productmanagement.service.impl;

import com.example.productmanagement.model.Product;
import com.example.productmanagement.repository.ProductRepository;
import com.example.productmanagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return (Product) productRepository.save(product);
    }

    @Override
    public void delete(Product product) {
productRepository.delete(product);
    }

    @Override
    public void update(Long id, Product product) {

    }

    @Override
    public Product findById(Long id) {
        return (Product)productRepository.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Iterable<Product> search(String keyword) {
        return productRepository.findAllByNameContaining(keyword);
    }
}
