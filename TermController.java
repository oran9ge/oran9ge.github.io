package com.contra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.contra.entity.Terms;
import com.contra.service.TermService;

@Controller
@RequestMapping("/terms")
public class TermController {
	
	@Autowired
	TermService termService;
	
	@RequestMapping("/addterm")
	public String addATerm(@ModelAttribute("terms")Terms terms)
	{
		termService.addTerms(terms);
		return "redirect:/contract";
	}
}
