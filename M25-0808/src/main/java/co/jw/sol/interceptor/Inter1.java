package co.jw.sol.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Inter1 implements HandlerInterceptor {

	//컨트롤러메서드가 호출되기 전에 호출됨
	 public boolean preHandle(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		 
		 System.out.println("inter1_pre");

		return true;
	}
	 
	 
	 //컨트롤러메서드가 호출된 후에 호출됨
	 public void postHandle(HttpServletRequest request, HttpServletResponse response,
				ModelAndView modelAndView) throws Exception {
		 
		 System.out.println("inter1_post");
	 } 
	 
	 
	 //view 처리가 다 완료되면 호출
	 public void afterCompletion(HttpServletRequest request, 
			 HttpServletResponse response, Object handler) throws Exception {

		 System.out.println("inter1_after");
	 }
	 
	 
}
