package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
@Id
private int prodid;
private String Product_name;
private String Product_desc;
private String ProductImageUrl;
private float price;
public int getProdid() {
	return prodid;
}
public void setProdid(int prodid) {
	this.prodid = prodid;
}
public String getProduct_name() {
	return Product_name;
}
public void setProduct_name(String product_name) {
	Product_name = product_name;
}
public String getProduct_desc() {
	return Product_desc;
}
public void setProduct_desc(String product_desc) {
	Product_desc = product_desc;
}
public String getProductImageUrl() {
	return ProductImageUrl;
}
public void setProductImageUrl(String productImageUrl) {
	ProductImageUrl = productImageUrl;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [prodid=" + prodid + ", Product_name=" + Product_name + ", Product_desc=" + Product_desc
			+ ", ProductImageUrl=" + ProductImageUrl + ", price=" + price + "]";
}

}