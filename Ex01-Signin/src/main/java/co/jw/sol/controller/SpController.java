package co.jw.sol.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import co.jw.sol.beans.Data;


@Controller
@SessionAttributes({"session1"})
public class SpController {
	
	//인덱스페이지에서 로그인 버튼 클릭 시 로그인 폼이 있는 화면으로 이동한다
	@GetMapping("/in")
	public String In(Model model) {
		System.out.println("in...");
		model.addAttribute("data", new Data());
		return "forward:/login";
	}
	@GetMapping("/login")
	public String logIn(HttpServletRequest request) {
		System.out.println("login...");

		String str=(String)request.getAttribute("uId");
		System.out.println("login: "+str);
		
		return "login";
	}
	
	
	//로그인 성공하면 	//검증된 id와 pwd를 세션에 저장하고	//pdtPage로 이동 시킨다
	//유효성 검사가 이루워진다
	@PostMapping("/pro")
	public String chk(HttpSession session, @Valid Data data, BindingResult r) {
		System.out.println("pro...");
		
		String str=(String)data.getuId();
		System.out.println("pro: "+str);
		
		if(r.hasErrors()) {
			return "login";
		}
		
		session.setAttribute("uId", data.getuId());
		session.setAttribute("pwd", data.getPwd());
		
		
		return "pdtPage";
	}
//	@PostMapping("/pro")
//	public String chk(@Valid Data data, BindingResult r) {
//		System.out.println("pro...");
//		
//		String str=(String)data.getuId();
//		System.out.println("myPage: "+str);
//		
//		if(r.hasErrors()) {
//			return "login";
//		}
//		return "pdtPage";
//	}

	
	//상품담기 클릭 하면 선택항목을 저장해서 
	//myPage로 이동한다
	@GetMapping("/secP")
	public String secP(HttpSession session) {
		System.out.println("secP...");
		return "forward:/myPage";
	}
	@GetMapping("/myPage")
	public String myPage(HttpSession session) {
		System.out.println("myPage...");
		
		String str=(String)session.getAttribute("uId");
		System.out.println("myPage: "+str);
		
		return "myPage";
	}
	
	
	
	
	
}