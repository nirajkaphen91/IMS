package com.cts.assignment.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;





public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int categoryId;

	private String categoryName;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDateTime;

	private String createdUser;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastChangeDateTime;

	private String lastModifiedUser;

	private BigDecimal version;

	
	@OneToMany(mappedBy="category")
	private List<Product> products; //bi-directional many-to-one association to Product

	
	@OneToMany(mappedBy="category") //bi-directional many-to-one association to Stock
	private List<Stock> stocks;
	
	
	
	
	
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

	public Date getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	public Date getLastChangeDateTime() {
		return lastChangeDateTime;
	}

	public void setLastChangeDateTime(Date lastChangeDateTime) {
		this.lastChangeDateTime = lastChangeDateTime;
	}

	public String getLastModifiedUser() {
		return lastModifiedUser;
	}

	public void setLastModifiedUser(String lastModifiedUser) {
		this.lastModifiedUser = lastModifiedUser;
	}

	public BigDecimal getVersion() {
		return version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}

	public Product addProduct(Product product) {
		getProducts().add(product);
		product.setCategory(this);

		return product;
	}

	public Product removeProduct(Product product) {
		getProducts().remove(product);
		product.setCategory(null);

		return product;
	}
	
	public Stock addStock(Stock stock) {
		getStocks().add(stock);
		stock.setCategory(this);

		return stock;
	}

	public Stock removeStock(Stock stock) {
		getStocks().remove(stock);
		stock.setCategory(null);

		return stock;
	}
	

}
