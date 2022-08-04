package co.jw.sol.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

import co.jw.sol.beans.Data;
import co.jw.sol.beans.Data2;

@Configuration
public class RootAppContext {
	
	@Bean
	@SessionScope
	public Data d1() {
		return new Data();
	}
	
	@Bean("b1")
	@SessionScope
	public Data2 d2() {
		return new Data2();
	}
	

}








