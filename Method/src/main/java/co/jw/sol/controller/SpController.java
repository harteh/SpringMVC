package co.jw.sol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpController {
	
	@RequestMapping(value="/t1", method=RequestMethod.GET)
	public String a() {
		return "t1";
	}
	
	@PostMapping("/t1")
	public String b() {
		return "t1";
	}
	
	@RequestMapping(value="/t2", method= {RequestMethod.GET, RequestMethod.POST})
	public String c() {
		return "t2";
	}
	
	@GetMapping("/t3")
	public String d() {
		return "t3";
	}
	
	@PostMapping("/t3")
	public String e() {
		return "t3";
	}
	
}











