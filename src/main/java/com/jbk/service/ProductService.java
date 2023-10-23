package com.jbk.service;

import com.jbk.model.Product;

public interface ProductService {

	public int addProduct(Product product);
	public Product getProductById(long id);
	public String deleteProductById(long id);
}
