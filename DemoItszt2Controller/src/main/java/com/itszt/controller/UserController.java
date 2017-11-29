package com.itszt.controller;

//
import com.itszt.service.UserService;
import com.itszt.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("reg")
	public String reg(String username,String userpwd){
		System.out.println("UserController777.....");
		userService.regUser(username, userpwd);
		
		return "user/usercenter";
	}
}
