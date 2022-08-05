package co.jw.sol.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import co.jw.sol.beans.Data;


@Controller
public class SpController {
	
	@GetMapping("/in")
	public String in(Data d) {
		return "in";
	}
	@PostMapping("/po")
	public String po(@Valid Data d, BindingResult r) {
		if(r.hasErrors()) {
			return "in";
		}
		return "success";
	}
	
}