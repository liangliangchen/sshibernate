package me.demo.sshibernate.action;

import javax.servlet.http.HttpServletRequest;

import me.demo.sshibernate.model.Users;
import me.demo.sshibernate.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserAction {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/user/addUser.action")
	public String addUser(Users user, HttpServletRequest request) {
		userService.addUser(user);
		return "redirect:/user/index.action";
	}

}
