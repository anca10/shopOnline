package main.java.com.fortech.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.com.fortech.shop.dao.ProductDao;
import main.java.com.fortech.shop.model.Product;


@Service("productService")
public class ProductService implements ProductServiceInterface{

	@Autowired
	private ProductDao productDao;

	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}

	public void insertProduct(Product product) {
		productDao.insertProduct(product);
		
	}

	public void deleteProduct(int id) {
		productDao.deleteProduct(id);;
		
	}
	
}
