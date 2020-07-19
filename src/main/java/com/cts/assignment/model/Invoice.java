package com.cts.assignment.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;






@Entity
@NamedQuery(name="Invoice.findAll", query="SELECT i FROM Invoice i")
public class Invoice {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int invoiceId;

	private double lineTotal;

	private int productId;

	private String productName;

	private double quantity;

	private double total;

	private BigDecimal version;
	
	public Invoice() {
	}

	@OneToMany(mappedBy="invoice")
	private List<ProductInvoice> productInvoices;
	
	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public double getLineTotal() {
		return lineTotal;
	}

	public void setLineTotal(double lineTotal) {
		this.lineTotal = lineTotal;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public BigDecimal getVersion() {
		return version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}
	
	public ProductInvoice addProductInvoice(ProductInvoice productInvoice) {
		getProductInvoices().add(productInvoice);
		productInvoice.setInvoice(this);

		return productInvoice;
	}

	public ProductInvoice removeProductInvoice(ProductInvoice productInvoice) {
		getProductInvoices().remove(productInvoice);
		productInvoice.setInvoice(null);

		return productInvoice;
	}
	
	public List<ProductInvoice> getProductInvoices() {
		return this.productInvoices;
	}

	public void setProductInvoices(List<ProductInvoice> productInvoices) {
		this.productInvoices = productInvoices;
	}
}
