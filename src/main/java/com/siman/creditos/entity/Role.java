package com.siman.creditos.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROLE")
@Cacheable(false)
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public Role() {
		
	}
	
	@Id
	@Column(name = "ID")	
	private Integer idRol;
	
	@Column(name = "ROLE_NAME")
	private String roleName;
	
	public Integer getIdRol() {
		return idRol;
	}
	
	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}
	
	public String getRoleName() {
		return roleName;
	}
	
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
	
}