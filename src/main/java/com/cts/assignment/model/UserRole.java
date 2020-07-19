package com.cts.assignment.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "user_role")
@NamedQuery(name = "UserRole.findAll", query = "SELECT u FROM UserRole u")
public class UserRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int refrenceId;

	@ManyToOne
	private Role role;

	@ManyToOne
	private User user;

	public UserRole() {
	}

	public int getRefrenceId() {
		return refrenceId;
	}

	public void setRefrenceId(int refrenceId) {
		this.refrenceId = refrenceId;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
