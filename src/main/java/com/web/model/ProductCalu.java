package com.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductCalu {

	
	
	@Id
	private String productCategory;
	private Double discount;
	private Double gst;
	private Double deliveryCharges;
	public ProductCalu() {
		super();
	}
	public ProductCalu(String productCategory, Double discount, Double gst, Double deliveryCharges) {
		super();
		this.productCategory = productCategory;
		this.discount = discount;
		this.gst = gst;
		this.deliveryCharges = deliveryCharges;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Double getGst() {
		return gst;
	}
	public void setGst(Double gst) {
		this.gst = gst;
	}
	public Double getDeliveryCharges() {
		return deliveryCharges;
	}
	public void setDeliveryCharges(Double deliveryCharges) {
		this.deliveryCharges = deliveryCharges;
	}
	
	
	
	
	
	
	
}
