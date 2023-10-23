package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.daoimpl.ProductDaoImpl;
import com.jbk.model.Product;
import com.jbk.service.ProductService;
import com.jbk.serviceimpl.ProductServiceImpl;

@RestController
public class ProductController {
	
	
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/add-product")
	public String addProduct(@RequestBody Product product) {
		
		
		
	int status=	service.addProduct(product);
	if(status==1) {
		return "Data Added;";
	}else {
		return "Data Not Added;";
	}
			
}
	
	@GetMapping("/get-product/{pid}")
	public Object getProductById(@PathVariable("pid") long id) {
		
		Product product = service.getProductById(id);  
		
		if(product!=null) {
			return product;
		}else {
			return "Product Not Found";
		}
	
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProductById(@PathVariable long id) {
		String result = service.deleteProductById(id);
		if(result!=null)
		{
			return result;
		}
		else {
			return "Product not found";
		}
	}
	
	
	

}
