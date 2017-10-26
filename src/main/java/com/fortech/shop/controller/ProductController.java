package main.java.com.fortech.shop.controller;

import java.util.Arrays;
import java.util.List;

import main.java.com.fortech.shop.model.Product;
import main.java.com.fortech.shop.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prod")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "/product/", method = RequestMethod.GET)
	public List<Product> getAllProducts(){
		List<Product> products = productService.getAllProducts();
		if(products.isEmpty()) return Arrays.asList(new Product(100,"Lista goala",0.0));
		return products;
	}
	
	@RequestMapping(value = "/product/insert", method = RequestMethod.POST)
	public void insertProduct(Product product){
		productService.insertProduct(product);
	}
	
	@RequestMapping(value = "/product/{id}", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("id") int id){
		productService.deleteProduct(id);
	}
}
