package com.web.model;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class ProductResult {

	@Id
	 private Integer productId;
	 private String ProductName;
	 private String ProductType;
	 private String ProductCategory;
	 private Double BasePrice;
	 private Double discount;
	 @OneToOne(cascade=CascadeType.ALL)
	 @JoinColumn(name="cid_fk",referencedColumnName="cid")
	 private ProductCharges  charges;
	 private Double finalPrice;
	 
	public ProductResult() {
		super();
	}

	public ProductResult(Integer productId, String productName, String productType, String productCategory,
			Double basePrice, Double discount, ProductCharges charges, Double finalPrice) {
		super();
		this.productId = productId;
		ProductName = productName;
		ProductType = productType;
		ProductCategory = productCategory;
		BasePrice = basePrice;
		this.discount = discount;
		this.charges = charges;
		this.finalPrice = finalPrice;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getProductType() {
		return ProductType;
	}

	public void setProductType(String productType) {
		ProductType = productType;
	}

	public String getProductCategory() {
		return ProductCategory;
	}

	public void setProductCategory(String productCategory) {
		ProductCategory = productCategory;
	}

	public Double getBasePrice() {
		return BasePrice;
	}

	public void setBasePrice(Double basePrice) {
		BasePrice = basePrice;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public ProductCharges getCharges() {
		return charges;
	}

	public void setCharges(ProductCharges charges) {
		this.charges = charges;
	}

	public Double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(Double finalPrice) {
		this.finalPrice = finalPrice;
	}

	@Override
	public String toString() {
		return "ProductResult [productId=" + productId + ", ProductName=" + ProductName + ", ProductType=" + ProductType
				+ ", ProductCategory=" + ProductCategory + ", BasePrice=" + BasePrice + ", discount=" + discount
				+ ", charges=" + charges + ", finalPrice=" + finalPrice + "]";
	}

	
}
