package Emp.service;

import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Autowired;

import Emp.entity.entity;
import Emp.repo.Emprepo;

public class Service {
	
	@Autowired
	private Emprepo repo;
	
	
	public void addEmp(entity e) {
		System.out.println("Rep");

		repo.save(e);
	}

}
