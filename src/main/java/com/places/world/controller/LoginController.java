package com.places.world.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.places.world.entity.LoginPer;
import com.places.world.service.LoginService;

@RestController
@RequestMapping("/places/login")
public class LoginController {
	
	@Autowired
	LoginService logSer;
	
	@PostMapping("/add")
	public LoginPer addLogin(@RequestBody LoginPer person) {
		
		return logSer.addPerson(person);
		
	}
	
	@PostMapping("/all")
	public List<LoginPer> showLogin(@RequestBody List<LoginPer> listper){
		
		return logSer.seeLogin(listper);
	}
	
	@GetMapping("/get")
	public LoginPer getLogin(@RequestParam String userName) {
		
		return logSer.fetchLogin(userName);
		
	}

}
