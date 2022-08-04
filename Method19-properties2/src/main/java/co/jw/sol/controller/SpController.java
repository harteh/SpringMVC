package co.jw.sol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SpController {
	
	@Autowired
	ReloadableResourceBundleMessageSource res;
	
	@GetMapping("/t1")
	public String t1(Model m) {
		String a1 = res.getMessage("aaa.a1", null, null);
		String b1 = res.getMessage("bbb.b1", null, null);
		
		Object a[]= {3, "하이"};
		String c1 = res.getMessage("aaa.a2", a, null);
		
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		
		m.addAttribute("a", a);
		
		return "t1";
	}
	
}