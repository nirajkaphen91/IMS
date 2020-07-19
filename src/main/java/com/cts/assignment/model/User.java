package com.cts.assignment.model;

import java.io.Serializable;
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
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int userId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date registartionDateTime;
	private String createdUser;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastChangeDateTime;
	private String lastChangedUser;

	private BigDecimal userMobileNumber;

	private String userEmail;

	private String userFname;

	private String userLname;

	private String userName;
	private BigDecimal version;

	public BigDecimal getVersion() {
		return version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

	public User() {

	}

	@OneToMany(mappedBy = "user")
	private List<UserRole> userRoles;

	public int getUserId() {
		return userId;
	}

	public List<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getRegistartionDateTime() {
		return registartionDateTime;
	}

	public void setRegistartionDateTime(Date registartionDateTime) {
		this.registartionDateTime = registartionDateTime;
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

	public String getLastChangedUser() {
		return lastChangedUser;
	}

	public void setLastChangedUser(String lastChangedUser) {
		this.lastChangedUser = lastChangedUser;
	}

	public BigDecimal getUserMobileNumber() {
		return userMobileNumber;
	}

	public void setUserMobileNumber(BigDecimal userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserFname() {
		return userFname;
	}

	public void setUserFname(String userFname) {
		this.userFname = userFname;
	}

	public String getUserLname() {
		return userLname;
	}

	public void setUserLname(String userLname) {
		this.userLname = userLname;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public UserRole addUserRole(UserRole userRole) {
		getUserRoles().add(userRole);
		userRole.setUser(this);

		return userRole;
	}

	public UserRole removeUserRole(UserRole userRole) {
		getUserRoles().remove(userRole);
		userRole.setUser(null);

		return userRole;
	}

}
