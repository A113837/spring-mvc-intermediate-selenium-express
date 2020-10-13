package com.seleniumexpress.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.seleniumexpress.lc.api.UserInfoDTO;

@Controller
public class LCAppController {
	
	@RequestMapping("/")
	public String showHomepage(@ModelAttribute("userInfo") UserInfoDTO userInfo)
	{
		
		
		return "home-page";
	}
	
	@RequestMapping("/process-homepage")
	public String showResultPage( @ModelAttribute("userInfo") UserInfoDTO userInfoDTO
			)
	{
		
		
		
		return "result-page";
	}
}
