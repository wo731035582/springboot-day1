package com.baizhi.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baizhi.ssm.dao.UserDao;
import com.baizhi.ssm.entity.User;
import com.baizhi.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao dao;
	
	@Override
	public User getOne(String name, String pwd) {
		// TODO Auto-generated method stub
		System.out.println(name);
		return dao.login(name, pwd);
	}

	@Override
	public void add(User u) {
		// TODO Auto-generated method stub
		dao.reg(u);
	}

}
