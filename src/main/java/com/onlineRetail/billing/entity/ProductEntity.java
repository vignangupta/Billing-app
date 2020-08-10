package com.onlineRetail.billing.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@SequenceGenerator(name="seq", initialValue=1001, allocationSize=1000)
@Entity
@Table(name="Products")
public class ProductEntity {
@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq") private Integer id;
@Column (name="product_name") private String productName;
@Column (name="product_description") private String productDescription;
@Column (name="product_category") private String productCategory;
@Column (name="price") private Double price;

public ProductEntity() {
}

public ProductEntity(String productName, String productDescription, String productCategory, Double price) {
	this.productName = productName;
	this.productDescription = productDescription;
	this.productCategory = productCategory;
	this.price = price;
}

public Double getPrice() {
	// TODO Auto-generated method stub
	return this.price;
}

public String getName() {
	// TODO Auto-generated method stub
	return this.productName;
}

public String getCategory() {
	// TODO Auto-generated method stub
	return this.productCategory;
}

public String getDescription() {
	// TODO Auto-generated method stub
	return this.productDescription;
}

}
