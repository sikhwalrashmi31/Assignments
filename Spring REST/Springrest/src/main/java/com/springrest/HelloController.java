package com.springrest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {

	@GetMapping("/hello")
		public String helloworld() {
			return "Hello World";
		}
	
}
