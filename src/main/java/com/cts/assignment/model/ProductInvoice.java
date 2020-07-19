package com.cts.assignment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity
@Table(name="product_invoice")
@NamedQuery(name="ProductInvoice.findAll", query="SELECT p FROM ProductInvoice p")
public class ProductInvoice {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int refrenceId;
	
	@ManyToOne
	private Invoice invoice; 
	@ManyToOne
	private Product product;//bi-directional many-to-one association to Product
	
	public ProductInvoice() {
	}

	public int getRefrenceId() {
		return refrenceId;
	}

	public void setRefrenceId(int refrenceId) {
		this.refrenceId = refrenceId;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}




}
