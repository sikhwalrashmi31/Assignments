package com.springrest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	 User user= new User("Mahek","Pass");
	
	 @PostMapping("/login")
    @ResponseBody
    public String login(@RequestBody User user){
        System.out.println(user);
        if(this.user.getUsername().equals(user.getUsername()) && this.user.getPassword().equals(user.getPassword())){
            return "Valid User";
        }
        else{
            return "Invalid User";
        }
    }
    
}