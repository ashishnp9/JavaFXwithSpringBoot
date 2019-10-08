package com.javafx.service;

import com.javafx.bean.User;
import com.javafx.generic.GenericService;

public interface UserService extends GenericService<User> {

	boolean authenticate(String email, String password);
	
	User findByEmail(String email);
	
}
