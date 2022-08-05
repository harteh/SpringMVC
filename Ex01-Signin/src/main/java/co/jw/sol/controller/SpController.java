package co.jw.sol.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import co.jw.sol.beans.Data;


@Controller
@SessionAttributes({"session1"})
public class SpController {
	
	//메인(로그인폼)에서 로그인 버튼 클릭 시 유효성 검사가 이루워진다
	@GetMapping("/pro")
	public String chk() {
		
		return "forward:/pdtPage";
	}
	
	//로그인 성공하면 
	//검증된 id와 pwd를 세션에 저장하고
	//pdtPage로 이동 시킨다
	
	//상품담기 클릭 하면 선택항목을 저장해서 
	//myPage로 이동한다
	
	
	
	
	
}