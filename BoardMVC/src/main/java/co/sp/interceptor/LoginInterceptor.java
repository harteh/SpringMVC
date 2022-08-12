package co.sp.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import co.sp.beans.User;

public class LoginInterceptor implements HandlerInterceptor{
	
	private User loginBean;
	
	public LoginInterceptor(User loginBean) {
		// TODO Auto-generated constructor stub
		this.loginBean = loginBean;
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		if(loginBean.isUserLogin() == false) {
			String contextPath = request.getContextPath();
			response.sendRedirect(contextPath + "/user/not_login");
			return false;
		}
		return true;
	}
	//로그인빈에 로그인한 회원정보를 넘기기 전에 로그인 여부를 확인하여 로그인이 되어 있지 않다면
	//not_login 으로 이동하고 로그인 빈에 아무런 데이터도 넘기지 않음
	//로그인 되어 있다면 로그인빈에 로그인한 회원정보를 반환
}








