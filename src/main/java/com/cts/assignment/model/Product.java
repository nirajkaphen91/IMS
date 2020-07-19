package com.cts.assignment.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;




@Entity
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productId;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	private String createdUser;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastchangDateTime;

	private String lastModifiedUser;

	private double productPerchasePrice;

	private byte productIsService;

	private String productName;

	private double productsellingPrice;

	private BigDecimal version;
	
	@ManyToOne
	@JoinColumn(name="categoryId")
	private Category category;      //bi-directional many-to-one association to Category
	@OneToMany(mappedBy="product")
	private List<ProductInvoice> productInvoices;//bi-directional many-to-one association to ProductInvoice
	
	@OneToMany(mappedBy="product")
	private List<ProductPricing> productPricings;
	

	
	@OneToMany(mappedBy="product")
	private List<Stock> stocks;////bi-directional many-to-one association to Stock



	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
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



	public Date getLastchangDateTime() {
		return lastchangDateTime;
	}



	public void setLastchangDateTime(Date lastchangDateTime) {
		this.lastchangDateTime = lastchangDateTime;
	}



	public String getLastModifiedUser() {
		return lastModifiedUser;
	}



	public void setLastModifiedUser(String lastModifiedUser) {
		this.lastModifiedUser = lastModifiedUser;
	}



	public double getProductPerchasePrice() {
		return productPerchasePrice;
	}



	public void setProductPerchasePrice(double productPerchasePrice) {
		this.productPerchasePrice = productPerchasePrice;
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



	public Category getCategory() {
		return category;
	}



	public void setCategory(Category category) {
		this.category = category;
	}



	public List<ProductInvoice> getProductInvoices() {
		return productInvoices;
	}



	public void setProductInvoices(List<ProductInvoice> productInvoices) {
		this.productInvoices = productInvoices;
	}



	public List<ProductPricing> getProductPricings() {
		return productPricings;
	}



	public void setProductPricings(List<ProductPricing> productPricings) {
		this.productPricings = productPricings;
	}



	public List<Stock> getStocks() {
		return stocks;
	}



	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}
	
	
	public ProductInvoice addProductInvoice(ProductInvoice
			productInvoice) {
getProductInvoices().add(productInvoice);
productInvoice.setProduct(this);

return productInvoice;
}
	
	public ProductInvoice removeProductInvoice(ProductInvoice productInvoice) {
		getProductInvoices().remove(productInvoice);
		productInvoice.setProduct(null);

		return productInvoice;
	}

	public ProductPricing addProductPricing(ProductPricing productPricing) {
		getProductPricings().add(productPricing);
		productPricing.setProduct(this);

		return productPricing;
	}

	public ProductPricing removeProductPricing(ProductPricing productPricing) {
		getProductPricings().remove(productPricing);
		productPricing.setProduct(null);

		return productPricing;
	}

	public Stock addStock(Stock stock) {
		getStocks().add(stock);
		stock.setProduct(this);

		return stock;
	}

	public Stock removeStock(Stock stock) {
		getStocks().remove(stock);
		stock.setProduct(null);

		return stock;
	}

	
}
