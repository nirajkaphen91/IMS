package com.cts.assignment.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;




@Entity
@NamedQuery(name="Stock.findAll", query="SELECT s FROM Stock s")
public class Stock implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int refrenceId;
	private String branchId;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;
	
	private String createdUser;
	
	@Temporal(TemporalType.DATE)
	private Date dateStock;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastchangedDate;
	
	private String lastChangedUser;
	
	private int quantity;
	private BigDecimal version;
	
	@ManyToOne
	@JoinColumn(name="productId")
	private Product product; //bi-directional many-to-one association to Product
	
	@ManyToOne
	@JoinColumn(name="supplierId")
	private Supplier supplier;//bi-directional many-to-one association to Supplier
	
	@ManyToOne
	@JoinColumn(name="categoryId")
	private Category category;//bi-directional many-to-one association to Category

	public Stock() {
	}

	public int getRefrenceId() {
		return refrenceId;
	}

	public void setRefrenceId(int refrenceId) {
		this.refrenceId = refrenceId;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
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

	public Date getLastchangedDate() {
		return lastchangedDate;
	}

	public void setLastchangedDate(Date lastchangedDate) {
		this.lastchangedDate = lastchangedDate;
	}

	public String getLastChangedUser() {
		return lastChangedUser;
	}

	public void setLastChangedUser(String lastChangedUser) {
		this.lastChangedUser = lastChangedUser;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getVersion() {
		return version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	
	
	
	
}
