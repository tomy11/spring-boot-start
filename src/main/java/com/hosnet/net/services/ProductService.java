package com.hosnet.net.services;

import com.hosnet.net.model.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProduct();
    public Product getProductById(Long id);
    public Product createProduct(Product product);
    public Product updateProduct(Product product, Long id);
    public boolean deleteProduct(Long id);
}
