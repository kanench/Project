/**
 * 
 */
package com.oocl.mnlbc.group3.model;

/**
 * Product Model Class
 * 
 * @author YUME
 * @author2 Group3
 * @version 1
 */
public class Product {

	private String productName;
	private int inStock;
	private double price;
	private String productDesc;
	private int productId;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Product(int productId, String productName, int inStock, double price,
			String productDesc) {
		this.productId = productId;
		this.productName = productName;
		this.inStock = inStock;
		this.price = price;
		this.productDesc = productDesc;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getInStock() {
		return inStock;
	}

	public void setInStock(int inStocks) {
		this.inStock = inStocks;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	
	public String toString(){
		return "[" + this.productId + "]" + " Product name: " + this.productName + " "+ this.productDesc
				+" Price: $"+ this.price+" Currently in stock: " + this.inStock ;
	}

}