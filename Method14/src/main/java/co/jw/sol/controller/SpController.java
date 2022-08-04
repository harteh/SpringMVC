package co.jw.sol.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.jw.sol.beans.Data;
import co.jw.sol.beans.Data2;
import co.jw.sol.beans.Data3;

@Controller
public class SpController {
	
	@Autowired
	Data d1;
	//data객체의 주소값을 d1에 주입한다

	@Resource(name="b1")
	Data2 d2;
	
	@Autowired
	Data3 d3;
	
	@GetMapping("/t1")
	public String a1() {
		d1.setD1("세종대왕");
		d1.setD2("이순신");
		
		d2.setD3("야키자카");
		d2.setD4("호호");
		
		d3.setD5("컴포넌트 주입");
		
		return "forward:/final1";
	}
	
	@GetMapping("/final1")
	public String f1(Model m) {
		System.out.println(d1.getD1());
		System.out.println(d1.getD2());
		
		m.addAttribute("d1", d1);
		m.addAttribute("d2", d2);
		m.addAttribute("d3", d3);
		
		return "final1";
	}
	
	
}






	


















