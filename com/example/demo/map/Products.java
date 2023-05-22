package com.example.demo.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Products {
   @Id
   @Column(name="Product_ID")
	private int pId;
   private String pName;
   
   @ManyToOne
   @JoinColumn(name="categoryId")
   private Category category;
   
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public Products(int pId, String pName,Category Category) {
	super();
	this.pId = pId;
	this.pName = pName;
	this.category=Category;
}
public Products() {
	// TODO Auto-generated constructor stub
}
public int getpId() {
	return pId;
}
public void setpId(int pId) {
	this.pId = pId;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}

}
