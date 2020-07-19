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
@Table(name="pricing_log")
@NamedQuery(name="PricingLog.findAll", query="SELECT p FROM PricingLogEntity p")
public class pricingLog implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pricingId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	private String createdUser;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedDate;

	private String lastModifiedUser;

	private BigDecimal pricingDiscountPrecentage;

	@Temporal(TemporalType.DATE)
	private Date pricingEffectiveDate;

	@Temporal(TemporalType.DATE)
	private Date pricingExpireDate;

	private String pricingName;

	private BigDecimal version;

	public pricingLog() {
		
	}

	public int getPricingId() {
		return pricingId;
	}

	public void setPricingId(int pricingId) {
		this.pricingId = pricingId;
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

	public BigDecimal getPricingDiscountPrecentage() {
		return pricingDiscountPrecentage;
	}

	public void setPricingDiscountPrecentage(BigDecimal pricingDiscountPrecentage) {
		this.pricingDiscountPrecentage = pricingDiscountPrecentage;
	}

	public Date getPricingEffectiveDate() {
		return pricingEffectiveDate;
	}

	public void setPricingEffectiveDate(Date pricingEffectiveDate) {
		this.pricingEffectiveDate = pricingEffectiveDate;
	}

	public Date getPricingExpireDate() {
		return pricingExpireDate;
	}

	public void setPricingExpireDate(Date pricingExpireDate) {
		this.pricingExpireDate = pricingExpireDate;
	}

	public String getPricingName() {
		return pricingName;
	}

	public void setPricingName(String pricingName) {
		this.pricingName = pricingName;
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
