package com.seleniumexpress.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LCAppController {
	
	@RequestMapping("/")
	public String showHomepage()
	{
		return "home-page";
	}
	
	@RequestMapping("/process-homepage")
	public String showResultPage(@RequestParam("userName") String userName1, @RequestParam("crushName") String crushName1)
	{
		System.out.println("user name is: "+ userName1);
		System.out.println("crush name is: "+ crushName1);
		return "result-page";
	}
}
