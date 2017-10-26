package main.java.com.fortech.shop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import main.java.com.fortech.shop.model.Product;

@Component
public class ProductDao implements ProductDaoInterface{

	public List<Product> getAllProducts() {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "NY", 2.0));
		products.add(new Product(2, "ALBAMA", 15));
		products.add(new Product(3, "NEBRASKA", 22.3));
		return products;
	}

	public void insertProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		
	}

	
}
