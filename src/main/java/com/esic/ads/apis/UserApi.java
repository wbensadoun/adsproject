package com.esic.ads.apis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esic.ads.dto.UserDto;
import com.esic.ads.service.UserService;

@RestController
@RequestMapping("")
public class UserApi {

	@Autowired
	UserService service;
	
	@GetMapping("/users")
	// recupérer tous les utilisateur dans la base de donnée et envoie de donnée au côté front
	public List<UserDto> getAllUsers() {
		return service.getAllUsers();
	}

	
	@PostMapping("/users")
	public UserDto register(@RequestBody UserDto userdto) {
		return service.createUser(userdto);
	}
	
	
}
