package co.jw.sol.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import co.jw.sol.beans.Data;

@Controller
public class SpController {
	
	@PostMapping("/t1")
	public String a1(Data dd) {
		
		System.out.println(dd.getD1());
		System.out.println(dd.getD2());
		
		return "t1";
	}
	
	@PostMapping("/t2")
	public String a2(@ModelAttribute("spring") Data dd) {
		return "t2";
	}
	
	
	
}



































