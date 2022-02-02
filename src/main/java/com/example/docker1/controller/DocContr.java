package com.example.docker1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/docker")
public class DocContr 
{
	@GetMapping("/home")
	public @ResponseBody String home() 
	{
		return "THIS IS HOME PAGE";
	}
}