package co.sp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

import co.sp.beans.User;


@Configuration
public class RootContext {
	
	@Bean("loginBean")
	@SessionScope
	public User loginBean() {
//		유저빈을 세션에 저장해준다
		return new User();
	}
}
