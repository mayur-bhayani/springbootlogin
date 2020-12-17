package com.example.HelloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.HelloWorld.service.UserService;
import com.example.HelloWorld.dto.UserRegistrationDto;
import com.example.HelloWorld.model.User;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
private UserService userService;
	
	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	
	@ModelAttribute("user")
	public UserRegistrationDto UserRegistrationDto()
	{
		return new UserRegistrationDto();
	}
	
	@GetMapping
	public String showRegistrationForm()
	{
		return "registration";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto)
	{
		User user = userService.save(registrationDto);
		if (user == null) {
			return "redirect:/registration?error";
		} else { 
			return "redirect:/registration?success";
		}
	}
}
