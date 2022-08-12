package co.sp.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.sp.beans.User;
import co.sp.dao.UserDao;
import co.sp.service.UserService;
import co.sp.validator.UserValidator;

@Controller
@RequestMapping("/user")
public class UserController {

	//-	UserService 자동주입, resource로 LoginBean주입
	@Autowired
	private UserService userService;
	
	@Resource(name = "loginBean")
	private User loginBean;
	
	@GetMapping("/login")
	public String login(@ModelAttribute("tempLoginUserBean") User tempLoginUserBean,
						@RequestParam(value = "fail", defaultValue = "false") boolean fail,
						Model model) {
		//페이지 들어오면서 @ModelAttribute("tempLoginUserBean") User tempLoginUserBean 생성?
		//ModelAttribute로 로그인한 회원정보 담긴 tempLoginUserBean을 지정
		//@RequestParam을 이용해 로그인에 실패할 경우 boolean값을 fail이라는
		//이름으로 지정하고 기본값을 false로 세팅
		
		model.addAttribute("fail", fail);
		//모델에 로그인 실패할 경우의 값을 저장하여 login.jsp로 넘긴다.
	
		return "user/login";
	}
	
	@PostMapping("/login_pro")
	public String login_pro(@Valid @ModelAttribute("tempLoginUserBean") User tempLoginUserBean, BindingResult result) {
		//로그인 폼에서 입력받은 값들을 @ModelAttribute("tempLoginUserBean") User tempLoginUserBean 에 저장,
		// 유효성 검사,
		
		if(result.hasErrors()) {
			return "user/login";
		}
		
		userService.getLoginUserInfo(tempLoginUserBean);
		//유저서비스에서 
		//userMapper.getLoginUserInfo 에서 아이디와 비번으로 검색 결과가 있다면
		//tempLoginUserBean2에 유저의 인덱스와 이름, 로그인 여부를 LoginInterceptor에 User 타입으로 저장한다 = 로그인한 사용자
		
		if(loginBean.isUserLogin() == true) {
			return "user/login_success";
		} else {
			return "user/login_fail";
		}
	}
	
	@GetMapping("/join")
	public String join(@ModelAttribute("joinUserBean") User joinUserBean) {
		return "user/join";
	}
	//User 타입의 객체가 'joinUserBean' 이름으로 생성되어 모델에 담아, user/join 페이지로 이동한다
	
	@PostMapping("/join_pro")
	public String join_pro(@Valid @ModelAttribute("joinUserBean") User joinUserBean, BindingResult result) {
		//jsp 파일의 modelAttribute="joinUserBean" 로 연결 되어, path=""의 이름과 동일한 이름의 빈에 저장?
		//UserService 의 @Autowired	private UserDao userDao; 를 통해서 DI?
		
		if(result.hasErrors()) {
			return "user/join";
		}
		
		userService.addUserInfo(joinUserBean);
		//UserMapper 의 void addUserInfo(User joinUserBean); 의 오버라이드된 쿼리문 실행
		
		return "user/join_success";
	}
	//유효성 검사 후 이상이 없으면 UserService의 addUserInfo 함수에 joinUserBean 빈을 담아서 호출한다
	
	@GetMapping("/modify")
	public String modify(@ModelAttribute("modifyUserBean") User modifyUserBean) {
		
		userService.getModifyUserInfo(modifyUserBean);
		
		return "user/modify";
	}
	
	@PostMapping("/modify_pro")
	public String modify_pro(@Valid @ModelAttribute("modifyUserBean") User modifyUserBean, BindingResult result) {
		
		if(result.hasErrors()) {
			return "user/modify";
		}
		
		userService.modifyUserInfo(modifyUserBean);
		
		return "user/modify_success";
	}
	
	@GetMapping("/logout")
	public String logout() {
		
		loginBean.setUserLogin(false);
		
		return "user/logout";
	}
	
	@GetMapping("/not_login")
	public String not_login() {
		return "user/not_login";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		UserValidator validator1 = new UserValidator();
		binder.addValidators(validator1);
	}
}








