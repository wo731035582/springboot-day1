package com.baizhi.ssm.service;

import com.baizhi.ssm.entity.User;

public interface UserService {
	User getOne(String name, String pwd);
	void add(User u);
}
