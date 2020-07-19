package com.cts.assignment.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



public class ProductPricing {
	
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int refrenceId;

	
	@ManyToOne
	private Pricing pricing;  //bi-directional many-to-one association to Pricing

	
	@ManyToOne
	private Product product; //bi-directional many-to-one association to Product


	public int getRefrenceId() {
		return refrenceId;
	}


	public void setRefrenceId(int refrenceId) {
		this.refrenceId = refrenceId;
	}


	public Pricing getPricing() {
		return pricing;
	}


	public void setPricing(Pricing pricing) {
		this.pricing = pricing;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}
	
	

}
