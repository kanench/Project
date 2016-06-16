/**
 * 
 */
package com.oocl.mnlbc.group3.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author KANENCH
 *
 */
public class Warehouse {
	
	private List<Product> productSelection;

	public Warehouse(){
		productSelection = new ArrayList<Product>();
		this.initProducts();
	}
	
	public void initProducts(){
		this.productSelection.add(new Product(1, "Bag", 10, 50.00, "Big Blue Bag"));
		this.productSelection.add(new Product(2, "Shoes", 7, 40.00, "Silver Small Shoes"));
		this.productSelection.add(new Product(3, "Shirt", 20, 10.50, "Silky Smooth Shirt"));
		this.productSelection.add(new Product(4, "Fone", 5, 320.00, "Fancy Fone"));
	}
	public List<Product> getProductSelection() {
		return productSelection;
	}

	public void setProductSelection(List<Product> productSelection) {
		this.productSelection = productSelection;
	}
	
    public void listProducts(){
    	System.out.println("Available products: ");
    	for(Product product : this.productSelection){
    		System.out.println(product.toString());
    	}
    }
    
    public Product getProduct(int prodId){
    	Product prod1 = null;
    	for (Product product : productSelection) {
			if(product.getProductId() == prodId){
			prod1 = product;
			}
		}
		return prod1;
    }
    
	
}
