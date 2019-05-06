package com.sun.bus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.bus.service.UserAccountSevice;

@Controller
@RequestMapping("/user")
public class UserAccountController {

	@Autowired
	private UserAccountSevice userAccountService;

	@RequestMapping("/queryUserAccount")
	private String queryUserAccount(String busNo) {
		return "user";
	}
}
