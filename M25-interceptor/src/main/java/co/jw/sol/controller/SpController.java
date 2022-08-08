package co.jw.sol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SpController {
	

	@GetMapping("/t1")
	public String t1() {
		System.out.println("t1");
		return "t1";
	}
	
	@GetMapping("/t2")
	public String t2() {
		System.out.println("t2");
		return "t2";
	}
	
	@GetMapping("/s1/t3")
	public String t3() {
		System.out.println("t2");
		return "t2";
	}
	
	@GetMapping("/s1/t4")
	public String t4() {
		System.out.println("t4");
		return "t4";
	}
	
	
	
	
	
	
	
}