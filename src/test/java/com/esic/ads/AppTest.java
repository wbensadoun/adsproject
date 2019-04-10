package com.esic.ads;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.esic.ads.model.User;
import com.esic.ads.repository.UserRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class AppTest{
	
	@Autowired
	UserRepository userRepository;
	
	@Test
	public void testCreateUser() {
		User user = new User();
		user.setEmail("test@test.com");
		user.setLogin("test.test");
		user.setPassword("test");
		
		userRepository.save(user);
	}
}
