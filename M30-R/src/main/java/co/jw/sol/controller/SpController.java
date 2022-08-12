package co.jw.sol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.jw.sol.beans.Member;


@Controller
public class SpController {
	
	/*
	@PostMapping("/login")
	public String login(@RequestParam String id, @RequestParam String pw) {
	public String login(HttpServletRequest request) {
	    return "login";
	}
	*/
	@GetMapping("/t1")
	public String t1(@ModelAttribute("aa") Member mem) {
		mem.setId("jj");
		mem.setName("뭐래");
		return "t1";
	}
	
	
	@PostMapping("/login")
	public String login(@RequestParam("id") String id, 
			@RequestParam("pw") String pw,
			Model model) {

		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
//		return "login";
		return "tt1";
	}
	
	

	
	
	
	
}