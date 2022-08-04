package co.jw.sol.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@PropertySources({
	@PropertySource("/WEB-INF/properties/d1.properties"),
	@PropertySource("/WEB-INF/properties/d2.properties")
})
public class SpController {
	
	@Value("${qqq.q1}")
	private int q1;
	
	@Value("${qqq.q2}")
	private String q2;
	
	@Value("${www.w1}")
	private int w1;
	
	@Value("${www.w2}")
	private String w2;
	
	@GetMapping("/t1")
	public String a1() {
		System.out.println(q1);
		System.out.println(q2);
		System.out.println(w1);
		System.out.println(w2);
		
		return "t1";
	}

}