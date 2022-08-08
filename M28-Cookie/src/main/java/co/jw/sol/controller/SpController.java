package co.jw.sol.controller;

import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SpController {
	
	@GetMapping("/save")
	public String save(HttpServletResponse response) {
		try {
			String d1 = URLEncoder.encode("문자1", "UTF-8");
			String d2 = URLEncoder.encode("문자2", "UTF-8");
			
			Cookie c1 = new Cookie("c1", d1);
			Cookie c2 = new Cookie("c2", d2);
			
			//완료시간
			c1.setMaxAge(365*24*60*60);
			c2.setMaxAge(365*24*60*60);
			
			response.addCookie(c1);
			response.addCookie(c2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "save";
	}
	

	//어노테이션 방식
	@GetMapping("/cookie")
	public String cookie(@CookieValue("c1") String c1, @CookieValue("c2") String c2) {
		System.out.println(c1);
		System.out.println(c2);
		
		return "cookie";
	}
	
	//서블릿 jsp 방식
	@GetMapping("/cookie2")
	public String cookie2(HttpServletRequest request) {
		try { 
			Cookie []c = request.getCookies(); 
			for(Cookie co : c) { 
				String str = URLDecoder.decode(co.getValue(), "UTF-8");
				
				if(co.getName().equals("c1")) {
					System.out.println(str);
				}
				else if(co.getName().equals("c2")) {
					System.out.println(str);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "cookie2";
		
	}
	
	
	
	
}