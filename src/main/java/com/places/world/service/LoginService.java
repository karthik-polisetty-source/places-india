package com.places.world.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.places.world.entity.LoginPer;
import com.places.world.repo.LoginRepo;

@Service
public class LoginService {
	
	@Autowired
	LoginRepo lrepo;

	public LoginPer addPerson(LoginPer person) {
		return lrepo.save(person);
	}

	

	public LoginPer fetchLogin(String userName) {
		
		//return lrepo.findById(userName);
		
		return null;
	}

	public List<LoginPer> seeLogin(List<LoginPer> listper) {
		
		return lrepo.saveAll(listper);
	}

	
}
