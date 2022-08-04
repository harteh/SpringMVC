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
/* @SessionAttributes -> request 영역이 아니라 session 영역에 주입된다
	@ModelAttribute에 같은 이름으로 저장된 메서드가 자동 호출 */
public class SpController {
	
	@ModelAttribute("session1")
	public Data session1() {
		return new Data();
	}
	@ModelAttribute("session2")
	public Data session2() {
		return new Data();
	}
	/**
	 * 새로운 요청이 발생하면 
		@SessionAttributes({"session1","session2"}) 이름으로 등록되어져 있는
		메소드가 자동으로 호출됨 (public Data session1())
		
		Data1이 반환하는 객체의 주소값을 session1이라는 이름으로 
		세션영역에 저장을 하게됨
		
		public String a4(@ModelAttribute("session1") Data bean) 로
		주입되게 된다.
		=> 원래는 request영역인데 session영역이라고 선언함
	 * @param session
	 * @return
	 */
	
	@GetMapping("/t5")
	public String a5(@ModelAttribute("session1") Data s1,
					@ModelAttribute("session1") Data s2) {
		s1.setD1("뭐래");
		s1.setD2("정신");
		s2.setD1("없노");
		s2.setD2("뭐야");
		
		return "t5";
		
	}
	
	
	
	
	@GetMapping("/t1")
	public String a1(HttpSession session) {
		session.setAttribute("d1", "세종대왕");
		return "t1";
	}
	
	@GetMapping("/t2")
	public String a2(HttpSession session) {
//	public String a2(HttpServletRequest request) {
		
		session.setAttribute("d1", "세종대왕");
//		request.setAttribute("d1", "세종대왕");
		
		return "redirect:/final1";
	}
	
	@GetMapping("/t3")
	public String a3(HttpSession session) {
		session.setAttribute("d1", "이순신");
		return "forward:/final1";		//세션이 유지된다
	}
	
	/*
	@GetMapping("/t4")
	public String a4(HttpSession session) {
		Data dd = new Data();
		dd.setD1("정조");
		dd.setD2("단군");
		
		session.setAttribute("bb", dd);
		return "t4";
	}
	*/
	/*
	@GetMapping("/final4")
	public String a4(@SessionAttribute("bb") Data dd) {

		System.out.println(dd.getD1());
		System.out.println(dd.getD2());
		
		return "final4";
	}
	*/
	/*
	@GetMapping("/final4")
	public String f4(HttpSession session) {
		Data dd = (Data) session.getAttribute("bb");
		System.out.println(dd.getD1() + " / "+ dd.getD2());
		return "final4";
	}
	*/
	
	@GetMapping("/t4")
	public String a4(@SessionAttribute("bb") Data dd) {
		dd.setD1("정조");
		dd.setD2("단군");
		
		return "t4";
	}
	@GetMapping("/final4")
	public String f4(@SessionAttribute("bb") Data dd) {
		System.out.println(dd.getD1());
		System.out.println(dd.getD1());
		
		return "final4";
	}
	
	
	
	
	
	@GetMapping("/final1")
	public String f1(HttpSession session) {
//	public String f1(HttpServletRequest request) {
		
		String str = (String)session.getAttribute("d1");
		System.out.println(str);
//		request.getAttribute("d1");
		
		return "final1";
		
	}
	

	
	
}






	


















