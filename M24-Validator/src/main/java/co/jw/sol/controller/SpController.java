package co.jw.sol.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import co.jw.sol.beans.Data;
import co.jw.sol.validator.Vali;


@Controller
public class SpController {
	
	@GetMapping("/in")
	public String in(Data d) {
		return "in";
	}
	@PostMapping("/pro")
	public String input_pro(@Valid Data d, BindingResult r) {
//	public String pro(@Valid Data d, BindingResult r) {
		if(r.hasErrors()) {
			return "in";
		}
		return "success";
	}
	
	//Validator를 등록한다
	//Validator가 하나면 setValidator, 한개 이상이면 addValidators
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		Vali v1 = new Vali();
		binder.addValidators(v1);
	}
	
	
	
}