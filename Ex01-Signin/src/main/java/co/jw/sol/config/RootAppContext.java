package co.jw.sol.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

import co.jw.sol.beans.Data;

@Configuration
public class RootAppContext {
	
	//세션 쓸수있나?
	@Bean
	@SessionScope
	public Data userData() {
		return new Data();
	}
	
}