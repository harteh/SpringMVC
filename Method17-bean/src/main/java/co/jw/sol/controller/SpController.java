package co.jw.sol.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.jw.sol.beans.Data;
import co.jw.sol.beans.Data2;


@Controller
public class SpController {
	
	@Autowired
	Data d1;
	
	@Resource(name="b1")
	Data2 d2;
	
	@GetMapping("/t1")
	public String a1() {
		d1.setD1("aa");
		d1.setD2("bb");
		
		d2.setD3("cc");
		d2.setD4("dd");
		
		return "t1";
	}
	
	@GetMapping("/final1")
	public String f1(Model m) {
		System.out.println(d1.getD1());
		
		m.addAttribute("ss", d1);
		m.addAttribute("yy", d2);
		
		return "final1";
	}

}




















