package com.website.cool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {

	@RequestMapping("/")
	public String hello2() {
		return "hello";
	}
	
	@RequestMapping(value="hello")
    public String xxx(){        
        System.out.println("Success");
        return "xxx"; 
    }
}
