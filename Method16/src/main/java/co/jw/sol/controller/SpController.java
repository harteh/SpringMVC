package co.jw.sol.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import co.jw.sol.beans.Data;


@Controller
@SessionAttributes({"session1", "session2"})
public class SpController {
	
	@ModelAttribute("session1")
	public Data session1() {
		return new Data();
	}
	@ModelAttribute("session2")
	public Data session2() {
		return new Data();
	}
	
	@GetMapping("/t5")
	public String test5(@ModelAttribute("session1") Data session1,
						@ModelAttribute("session2") Data session2) {
		
		session1.setD1("aa");
		session1.setD2("bb");
		
		session2.setD1("cc");
		session2.setD2("dd");
		
		return "t5";
	}
	
	@GetMapping("/final5")
	public String result5(@ModelAttribute("session1") Data session1,
						  @ModelAttribute("session2") Data session2) {
		
		System.out.println(session1.getD1());
		System.out.println(session1.getD2());
		
		System.out.println(session2.getD1());
		System.out.println(session2.getD2());
		return "final5";
	}
	
	
	
	@GetMapping("/t1")
	// public String test1(HttpServletRequest request) {
	public String test1(HttpSession session) {
		//HttpSession session = request.getSession();
		session.setAttribute("d1", "session1");
		
		return "t1";
	}
	
	@GetMapping("/t2")
	public String test2(HttpSession session) {
		session.setAttribute("d1", "session2");
		return "redirect:/final1";
	}
	
	@GetMapping("/t3")
	public String test3(HttpSession session) {
		session.setAttribute("d1", "session3");
		return "forward:/final1";
	}
	
	@GetMapping("/final1")
	// public String result1(HttpServletRequest request) {
	public String result1(HttpSession session) {
		String str = (String)session.getAttribute("d1");
		System.out.println(str);
		
		return "final1";
	}
	
	@GetMapping("/t4")
	public String test4(HttpSession session) {
	// public String test4(@SessionAttribute("bean1") DataBean bean1) {
		Data bean1 = new Data();
		bean1.setD1("태우");
		bean1.setD2("신우");
		
		session.setAttribute("bb", bean1);
		
		return "t4";
	}
	
	@GetMapping("/final4")
	// public String result4(HttpSession session) {
	public String result4(@SessionAttribute("bb") Data bean1) {
		
		// DataBean1 bean1 = (DataBean1)session.getAttribute("bean1");
		
		System.out.println(bean1.getD1());
		System.out.println(bean1.getD2());
		
		return "final4";
	}
	

}




















