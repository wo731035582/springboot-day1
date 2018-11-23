package com.baizhi.ssm.dao;

import org.apache.ibatis.annotations.Param;

import com.baizhi.ssm.entity.User;

public interface UserDao {
	User login(@Param("name") String name, @Param("pwd") String pwd);
	void reg(User u);
}
