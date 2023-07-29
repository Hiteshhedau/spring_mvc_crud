package com.crud.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crud.dao.UserDao;
import com.crud.entity.User;

@Controller
public class HomeController {

	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(path = "/home")
	public String home(Model model) {
		
		List<User> list= userDao.getAllUser();
		
		model.addAttribute("userList",list);
;		return "home";
	}
	

	@RequestMapping(path = "/addUser")
	public String addUser() {
		return "add_user";
	}
	
	@RequestMapping(path = "/createUser",method = RequestMethod.POST)
	public String createUser(@ModelAttribute User user,HttpSession httpSession) {
		int i=userDao.saveUser(user);		
		
		httpSession.setAttribute("msg", "Register Successfully");
		return "redirect:/addUser";
	}
	
	@RequestMapping(path="/editUser/{id}")
	public String editUser(@PathVariable int id,Model model) {
		
	User user=	userDao.getUserById(id);
	
	model.addAttribute("user",user);
		return "edit";
	}
	
	@RequestMapping(path = "/updateUser",method = RequestMethod.POST)
	public String updateUser(@ModelAttribute User user ,HttpSession httpSession) {
		
		userDao.update(user);
	httpSession.setAttribute("msg","Update Successfully");
		return "redirect:/home";
	}
	
	@RequestMapping(path = "/deleteUser/{id}")
	public String deleteUser(@PathVariable int id,HttpSession httpSession) {
		
		userDao.deleteUser(id);
		httpSession.setAttribute("msg", "User delete successfully");
		return "redirect:/home";
	}
	
}
