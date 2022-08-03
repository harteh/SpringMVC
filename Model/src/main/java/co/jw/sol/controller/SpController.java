package co.jw.sol.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpController {
	
	@GetMapping("/t1")
	public String a1() {
		return "t1";
	}
	
	@GetMapping("/t2")
	public String a2(HttpServletRequest request) {
		
		request.setAttribute("d1",4);
		request.setAttribute("d2",7);
		
		return "t2";
	
	}
	@GetMapping("/t3")
	public String a3(Model model) {
		
		model.addAttribute("d1",3);
		model.addAttribute("d2",8);
		
		return "t3";
	}
	
	@GetMapping("/t4")
	public ModelAndView a4(ModelAndView mv) {
		
		mv.addObject("d1",6);
		mv.addObject("d2",9);
		
		mv.setViewName("t4");
		return mv;
	}
}



































