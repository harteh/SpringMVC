package co.jw.sol.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import co.jw.sol.beans.Data;

@Controller
public class SpController {
	
	@GetMapping("/t1")
	public String a1(HttpServletRequest request) {
		request.setAttribute("d1", "의영");
		return "forward:/final1";
	}
	@GetMapping("/final1")
	public String f1(HttpServletRequest request) {
		
		String str=(String)request.getAttribute("d1");
		System.out.println(str);
		
		return "final1";
		
	}
	
	@GetMapping("/t2")
	public String a2(Model m) {
		
		m.addAttribute("d2","태우");
		
		return "forward:/final2";
	}
	
	@GetMapping("/final2")
		public String f2(HttpServletRequest request) {
			
			String d2=(String)request.getAttribute("d2");
			
			return "final2";
			
		}
	
	@GetMapping("/t3")
	public ModelAndView a3(ModelAndView mv) {
		
		mv.addObject("d3","민우");
		mv.setViewName("forward:/final3");
		
		return mv;
	}
	
	@GetMapping("/final3")
	public String f3(HttpServletRequest request) {
		String str=(String)request.getAttribute("d3");
		return "final3";
	}
	
	@GetMapping("/t4")
	public String a4(Model m) {
		Data dd=new Data();
		
		dd.setD1("인성");
		dd.setD2("상우");
		
		m.addAttribute("dd",dd);
		
		return "forward:/final4";
	}
	
	@GetMapping("/final4")
	public String f4(HttpServletRequest request) {
		
		Data dd=(Data)request.getAttribute("dd");
		System.out.println(dd.getD1());
		System.out.println(dd.getD2());
		
		return "final4";
		
	}
	
	@GetMapping("/t5")
	public String a5(@ModelAttribute("bean") Data dd) {
		dd.setD1("의영");
		dd.setD2("상우");
		
		return "forward:/final5";	
	}
	
	@GetMapping("/final5")
	public String f5(HttpServletRequest request) {
		Data dd=(Data)request.getAttribute("bean");
		
		System.out.println(dd.getD1());
		System.out.println(dd.getD2());
		
		return "final5";
		
	}
	
}






	


















