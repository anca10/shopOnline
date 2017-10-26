package main.java.com.fortech.shop.service;

import java.util.List;

import main.java.com.fortech.shop.model.Product;

public interface ProductServiceInterface {

	public List<Product> getAllProducts();
	public void insertProduct(Product product);
	public void deleteProduct(int id);
}
