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
@Table(name="supplier_log")
@NamedQuery(name="SupplierLog.findAll", query="SELECT s FROM SupplierLogEntity s")
public class SupplierLog implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int supplierId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	private String createdUser;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedDate;

	private String lastModifiedUser;

	private String supplierCompany;

	private BigDecimal supplierContact;

	private String supplierName;

	private BigDecimal version;

	public SupplierLog() {
		
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
