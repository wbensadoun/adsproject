package com.esic.ads.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esic.ads.dto.UserDto;
import com.esic.ads.model.User;
import com.esic.ads.repository.UserRepository;

@Service
public class UserService {

	
	@Autowired
	UserRepository userRepository;
	
	public UserDto createUser(UserDto userDto) {
		
		User userExist = userRepository.findByLogin(userDto.getLogin());
		if(userExist != null) {
			throw new RuntimeException("Ce login existe déjà");
		}
		User user = new User();
		user.setEmail(userDto.getEmail());
		user.setLogin(userDto.getLogin());
		user.setPassword(userDto.getPassword());
		
		User createdUser = userRepository.save(user);
		userDto.setId(createdUser.getId());
		
		return userDto;
	}
	
	public boolean login(UserDto userDto) {
		User user = userRepository.findByLogin(userDto.getLogin());
		if(user != null) {
			if(user.getPassword().equals(userDto.getPassword()))
				return true;
			else
				return false;
		}else {
			return false;
		}
		
	}
	
	public List<UserDto> getAllUsers() {
		List<User> users = userRepository.findAll();
		List<UserDto> userDtos = new ArrayList<>();
		for (User user : users) {
			UserDto userDto = new UserDto(user.getId(), user.getEmail(), user.getLogin());
			
			userDtos.add(userDto);
		}
		return userDtos;
	}

}
