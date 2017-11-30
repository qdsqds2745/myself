package com.tcb.login.facade;

import java.util.List;

import com.tcb.login.entity.User;

public interface LoginService {

	 List<User> query();

    User getUserById(User user);
}
