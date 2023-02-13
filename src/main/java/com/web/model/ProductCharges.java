package com.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ProductCharges {

	@Id
	Integer cid;
	private Double gst;
	private Double delivery;
	@OneToOne(mappedBy="charges")
	private ProductResult res;
	public ProductCharges() {
		super();
	}
	public ProductCharges(Integer cid, Double gst, Double delivery, ProductResult res) {
		super();
		this.cid = cid;
		this.gst = gst;
		this.delivery = delivery;
		this.res = res;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Double getGst() {
		return gst;
	}
	public void setGst(Double gst) {
		this.gst = gst;
	}
	public Double getDelivery() {
		return delivery;
	}
	public void setDelivery(Double delivery) {
		this.delivery = delivery;
	}
	public ProductResult getRes() {
		return res;
	}
	public void setRes(ProductResult res) {
		this.res = res;
	}
	
	
	
}
