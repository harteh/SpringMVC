package co.jw.sol.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SpController {
	
	@GetMapping("/t1")
	public String a1(HttpServletRequest request) {
		
		String s1=request.getParameter("d1");
		String s2=request.getParameter("d2");
		String s3[]=request.getParameterValues("d3");
		
		System.out.println(s1);
		System.out.println(s2);
		for(String s:s3) {
			System.out.println(s);
		}
		return "final"; 
	
	}
	
	@PostMapping("/t2")
	public String a2(HttpServletRequest request) {
		
		String s1=request.getParameter("d1");
		String s2=request.getParameter("d2");
		String s3[]=request.getParameterValues("d3");
		
		System.out.println(s1);
		System.out.println(s2);
		for(String s:s3) {
			System.out.println(s);
		}
		return "final"; 
	
	}
	
	@GetMapping("/t3/{d1}/{d2}/{d3}")
	public String a3(@PathVariable int d1, @PathVariable int d2,
			@PathVariable int d3) {
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		return "final";			
	}
	
	@GetMapping("/t4")
	public String a4(@RequestParam int d1, @RequestParam int d2, 
			@RequestParam int[] d3) {
		
		System.out.println(d1);
		System.out.println(d2);
		for(int n:d3) {
			System.out.println(n);
		}
		return "final";
	}
	
	@GetMapping("/t5")
	public String a5(@RequestParam int d1, @RequestParam(required = false)
	                  String d2, @RequestParam(defaultValue = "0") int d3) {
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		return "final";
		
	}

}

































