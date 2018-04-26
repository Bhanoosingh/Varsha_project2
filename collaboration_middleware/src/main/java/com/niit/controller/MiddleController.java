package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MiddleController {
	@RequestMapping("/")
	public String callmiddle() {
		return "index";
	}

}
