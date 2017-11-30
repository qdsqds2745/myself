package com.tcb.login.service;

import java.util.ArrayList;
import java.util.List;

import com.tcb.login.entity.User;
import com.tcb.login.facade.LoginService;

public class LoginServiceImpl implements LoginService {

	public List<User> query() {
		List<User>  uList =  new ArrayList<User>();
		User u = new User();
		u.setName("zhang hui");
		uList.add(u);
		return uList;
	}

	public User getUserById(User user) {
		User u = new User();
		u.setName("li feng");
		return u;
	}

}
