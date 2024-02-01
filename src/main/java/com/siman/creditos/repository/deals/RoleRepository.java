package com.siman.creditos.repository.deals;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.siman.creditos.entity.Role;



@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
	
	
	@Query("SELECT t FROM Role t ")
	public  List<Role> findAll();


}