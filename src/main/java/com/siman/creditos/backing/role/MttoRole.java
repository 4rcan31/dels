package com.siman.creditos.backing.role;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.siman.creditos.backing.GenericBackingBean;
import com.siman.creditos.constants.CountryEnum;
import com.siman.creditos.entity.Role;
import com.siman.creditos.factory.SpringAppContextFactory;
import com.siman.creditos.repository.deals.RoleRepository;
//import com.siman.creditos.security.UserPrincipal;

@ManagedBean
@ViewScoped
public class MttoRole extends GenericBackingBean {

	RoleRepository repo;
	Authentication auth;
	private List<Role> listRole;
	private String rol;
	//private UserPrincipal userPrincipal;
	//private Integer nextIdParam;

	public MttoRole() {
		//repo = SpringAppContextFactory.getInstance(CountryEnum.valueOf(country)).getBean(RoleRepository.class);
		repo = SpringAppContextFactory.getInstance().getBean(RoleRepository.class);
		//auth = SecurityContextHolder.getContext().getAuthentication();
		//userPrincipal = (UserPrincipal) auth.getPrincipal();
		//idUsuarioCreacion = userPrincipal.getUsername();
		//idUsuarioActualizacion = userPrincipal.getUsername();
		listRole = repo.findAll();
		//nextIdParam = repo.getNextIdParam();
	}
	


	
	public List<Role> getListRole() {
		return listRole;
	}

	public void setListRole(List<Role> listRole) {
		this.listRole = listRole;
	}
	
	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	
}
