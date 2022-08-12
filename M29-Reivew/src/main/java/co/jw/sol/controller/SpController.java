package co.jw.sol.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SpController {
	
	@GetMapping("/main")
	public ModelAndView main(ModelAndView mv) {
	    mv.addObject("msg1","1");
	    mv.addObject("msg2","2");
	    mv.setViewName("forward:/main1");
	    return mv;
	}
	@GetMapping("/main1")
	public String f3(HttpServletRequest request) {
	    String str=(String)request.getAttribute("msg1");
	    String str1=(String)request.getAttribute("msg2");
	    System.out.println(str+"/"+str1);
	    
	    return "main1";
	}
	

	
	
	
	
}