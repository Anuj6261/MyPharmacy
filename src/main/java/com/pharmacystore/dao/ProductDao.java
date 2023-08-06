 package com.pharmacystore.dao;

import java.util.List;

import com.pharmacystore.pojo.Product;

public interface ProductDao {

	boolean addProduct(Product product);
	boolean deleteProduct(int productId);
	boolean updateProduct(Product product);
	List<Product> getAllProducts(int start,int total);
	List<Product> getAllProducts();
	List<Product> displayProductsCategoryWise( int cid);
	Product searchProduct(int productId);
	boolean updateQuantityAfterOrder(int pid,
			int new_quantity);
	int  getQuantityOfProduct(Product product);
	void updateQuantityAfterCancellation(Product product);
}
