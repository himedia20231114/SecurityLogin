package com.mysite.SecurityLogin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	// http://localhost:8787
	@GetMapping("/")
	public String main() {
		
		return "redirect:/user/signup" ;
	}

}
