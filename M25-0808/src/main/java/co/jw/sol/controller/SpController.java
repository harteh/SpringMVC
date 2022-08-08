package co.jw.sol.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SpController {
	

	@GetMapping("/t1")
	public String t1() {
		System.out.println("t1");
		return "t1";
	}
	
	
	
	
	
	
	
}