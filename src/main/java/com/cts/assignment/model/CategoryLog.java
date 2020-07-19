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
@Table(name="category_log")
@NamedQuery(name="CategoryLog.findAll", query="SELECT c FROM CategoryLogEntity c")
public class CategoryLog  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int categoryId;

	private String categoryName;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDateTime;

	private String createdUser;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedDateTime;

	private String lastModifiedUser;

	private BigDecimal version;

	public CategoryLog() {
		
	}

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

	public Date getLastModifiedDateTime() {
		return lastModifiedDateTime;
	}

	public void setLastModifiedDateTime(Date lastModifiedDateTime) {
		this.lastModifiedDateTime = lastModifiedDateTime;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public CategoryLog(int categoryId, String categoryName, Date createdDateTime, String createdUser,
			Date lastModifiedDateTime, String lastModifiedUser, BigDecimal version) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.createdDateTime = createdDateTime;
		this.createdUser = createdUser;
		this.lastModifiedDateTime = lastModifiedDateTime;
		this.lastModifiedUser = lastModifiedUser;
		this.version = version;
	}
	

	
	
}
