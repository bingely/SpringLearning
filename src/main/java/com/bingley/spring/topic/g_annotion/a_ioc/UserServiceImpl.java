package com.bingley.spring.topic.g_annotion.a_ioc;

import org.springframework.stereotype.Service;

@Service("userServiceId")
public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		System.out.println("a_ico add user");
	}

}
