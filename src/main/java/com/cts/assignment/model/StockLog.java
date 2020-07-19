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
@Table(name="stock_log")
@NamedQuery(name="StockLog.findAll", query="SELECT s FROM StockLogEntity s")
public class StockLog implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int refrenceId;

	private int categoryId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	private String createdUser;

	@Temporal(TemporalType.DATE)
	private Date dateStock;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedDate;

	private String lastModifiedUser;

	private int productId;

	private int quantity;

	//private int stockId;

	private int supplierId;

	private BigDecimal version;

	public StockLog() {
		
	}

	public int getRefrenceId() {
		return refrenceId;
	}

	public void setRefrenceId(int refrenceId) {
		this.refrenceId = refrenceId;
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

	public Date getDateStock() {
		return dateStock;
	}

	public void setDateStock(Date dateStock) {
		this.dateStock = dateStock;
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

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
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
