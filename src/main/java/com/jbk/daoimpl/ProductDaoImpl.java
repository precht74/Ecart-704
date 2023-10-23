package com.jbk.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.jbk.dao.ProductDao;
import com.jbk.model.Product;
import java.util.Iterator;
@Component


public class ProductDaoImpl implements ProductDao {
	
	List<Product> list=new ArrayList<>();

	@Override
	public int addProduct(Product product) {
	
		//list.add(product);
		
		//return 1;
		
		  Product prdById= getProductById(product.getProductId());
		  Product prdByName= getProductByName(product.getProductName());
		  if(prdById==null && prdByName==null){
		  	list.add(product)l
		  	return 1;
		  }else{
		  return 2;
		  }
		  }
		 
	}

	@Override
	public Product getProductById(long id) {
		
		for (Product product : list) {
			System.out.println(1);
			if(product.getProductId()==id) {
				return  product;
			}
		}
		
		return null;
	}
	
	@Override
	public String deleteProductById(long id) {
		for(Product product: list) {
			if(product.getProductId()==id) {
				list.remove(product);
				return "Product deleted";
			}
		}
		return "Product not deleted";
	}
	
		@GetMapping("get-product-")

}
