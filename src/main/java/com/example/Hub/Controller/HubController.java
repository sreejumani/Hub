package com.example.Hub.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api")
public class HubController {
	
	@GetMapping("/get")
	public String getAll() {
		return "Yeah! I have stored my docker image in my hub and successfully deployed it in Dev server.";
		
	}

}
