package com.example.demo.map;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Category {
	
@Id
private int categoryId;
private String categoryName;

@OneToMany(mappedBy = "category")
private List<Products> products=new ArrayList<>();

public int getCategoryId() {
	return categoryId;
}
public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}

public List<Products> getProducts() {
	return products;
}
public void setProducts(List<Products> products) {
	this.products = products;
}
public Category(int categoryId, String categoryName,List<Products> product) {
	super();
	this.categoryId = categoryId;
	this.categoryName = categoryName;
	this.products=product;
}
public Category() {
	super();
	// TODO Auto-generated constructor stub
}
}
