package com.cts.assignment.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@NamedQuery(name="Supplier.findAll", query="SELECT s FROM Supplier s")
public class Supplier {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int supplierId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	private String createdUser;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastChangDate;

	private String lastModifiedUser;

	private String supplierCompany;

	private BigDecimal supplierContact;

	private String supplierName;

	private BigDecimal version;
	
	
	
		@OneToMany(mappedBy="supplier")
		private List<Stock> stocks;//bi-directional many-to-one association to Stock
		
		public Supplier() {
		}
		
		
		
		
		
		public int getSupplierId() {
			return supplierId;
		}





		public void setSupplierId(int supplierId) {
			this.supplierId = supplierId;
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





		public Date getLastChangDate() {
			return lastChangDate;
		}





		public void setLastChangDate(Date lastChangDate) {
			this.lastChangDate = lastChangDate;
		}





		public String getLastModifiedUser() {
			return lastModifiedUser;
		}





		public void setLastModifiedUser(String lastModifiedUser) {
			this.lastModifiedUser = lastModifiedUser;
		}





		public String getSupplierCompany() {
			return supplierCompany;
		}





		public void setSupplierCompany(String supplierCompany) {
			this.supplierCompany = supplierCompany;
		}





		public BigDecimal getSupplierContact() {
			return supplierContact;
		}





		public void setSupplierContact(BigDecimal supplierContact) {
			this.supplierContact = supplierContact;
		}





		public String getSupplierName() {
			return supplierName;
		}





		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}





		public BigDecimal getVersion() {
			return version;
		}





		public void setVersion(BigDecimal version) {
			this.version = version;
		}





		public List<Stock> getStocks() {
			return stocks;
		}





		public void setStocks(List<Stock> stocks) {
			this.stocks = stocks;
		}





		public Stock addStock(Stock stock) {
			getStocks().add(stock);
			stock.setSupplier(this);

			return stock;
		}

		public Stock removeStock(Stock stock) {
			getStocks().remove(stock);
			stock.setSupplier(null);

			return stock;
		}
}
