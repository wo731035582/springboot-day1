package com.baizhi.ssm.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.ssm.entity.User;
import com.baizhi.ssm.service.UserService;

@Controller()
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String login(String number,User u,HttpSession session,Map map){
		String kapt=(String) session.getAttribute("code");
		User user=userService.getOne(u.getName(), u.getPwd());
		if(number.equalsIgnoreCase(kapt)&&user!=null){
			session.setAttribute("user",user);
		return "redirect:/auction/getAll.do";	
		}else{
			map.put("errorMessage", "输入不正确");
			return "/login";
		}
	}
	
	@RequestMapping("/add")
	public String add(User u,HttpSession session,String number){
		String kapt=(String) session.getAttribute("code");
	if(number.equalsIgnoreCase(kapt)){
		userService.add(u);
		return "redirect:/login.jsp";
	}else{
		return "redirect:/register.jsp";
	}
	}
}
