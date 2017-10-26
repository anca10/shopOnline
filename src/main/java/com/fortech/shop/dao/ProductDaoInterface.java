package main.java.com.fortech.shop.dao;

import java.util.List;

import main.java.com.fortech.shop.model.Product;

public interface ProductDaoInterface {

	public List<Product> getAllProducts();
	public void insertProduct(Product product);
	public void deleteProduct(int id);
}
