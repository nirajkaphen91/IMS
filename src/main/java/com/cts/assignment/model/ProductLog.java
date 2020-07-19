package com.cts.assignment.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="product_log")
@NamedQuery(name="ProductLog.findAll", query="SELECT p FROM ProductLogEntity p")
public class ProductLog implements Serializable { 
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productId;

	private int categoryId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	private String createdUser;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedDate;

	private String lastModifiedUser;

	private int pricingId;

	private double productbuyingPrice;

	private byte productIsService;

	private String productName;

	private double productsellingPrice;

	private BigDecimal version;

	public ProductLog() {
		
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getLastModifiedUser() {
		return lastModifiedUser;
	}

	public void setLastModifiedUser(String lastModifiedUser) {
		this.lastModifiedUser = lastModifiedUser;
	}

	public int getPricingId() {
		return pricingId;
	}

	public void setPricingId(int pricingId) {
		this.pricingId = pricingId;
	}

	public double getProductbuyingPrice() {
		return productbuyingPrice;
	}

	public void setProductbuyingPrice(double productbuyingPrice) {
		this.productbuyingPrice = productbuyingPrice;
	}

	public byte getProductIsService() {
		return productIsService;
	}

	public void setProductIsService(byte productIsService) {
		this.productIsService = productIsService;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductsellingPrice() {
		return productsellingPrice;
	}

	public void setProductsellingPrice(double productsellingPrice) {
		this.productsellingPrice = productsellingPrice;
	}

	public BigDecimal getVersion() {
		return version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
