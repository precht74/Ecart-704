package com.jbk.dao;

import com.jbk.model.Product;

public interface ProductDao {
	
	public int addProduct(Product product);
	public Product getProductById(long id);
	public String deleteProductById(long id);

}
