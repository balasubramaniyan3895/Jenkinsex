package com.jenkinsex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jen")
public class JenkinsController {
	@GetMapping("/getmsg")
	public String getMag()
	{
		return "Jenkins introduction";
	}

}
