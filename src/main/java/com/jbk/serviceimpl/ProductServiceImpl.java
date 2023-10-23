package com.jbk.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jbk.dao.ProductDao;
import com.jbk.daoimpl.ProductDaoImpl;
import com.jbk.model.Product;
import com.jbk.service.ProductService;

@Component
public class ProductServiceImpl implements ProductService {

	
	public ProductServiceImpl() {
		System.out.println("in product service impl");
	}
	
	@Autowired
	private ProductDao  dao;
	
	@Override
	public int addProduct(Product product) {
		
		return dao.addProduct(product);
	}

	@Override
	public Product getProductById(long id) {
		
		return dao.getProductById(id);
	}
	
	public String deleteProductById(long id) {
		return dao.deleteProductById(id);
	}

}
