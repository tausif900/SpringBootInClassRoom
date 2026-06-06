package com.study.springbootbasics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RestController always return a data

@Controller
//@Controller looks for the templates
public class FirstController {

//	GET POST PUT DELETE
//	WE HAVE TO CREATE METHOD FOR ALL END POINTS
//	localhost:8080

	@GetMapping("/welcome") // this is our end-point,
	public String welcome() {
		return "welcome"; // here we are returning file name, as controller looking for templates to
							// templates ke andr ho html file hogi uska data web page pe show hoga.
	}

	@GetMapping("/about")
	public String about() {
		return "about";
	}
}
// @RestController is a combination of @Controller and @Reponsebody