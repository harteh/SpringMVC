package co.jw.sol.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//spring mvc프로젝트의 관련된 설정을 하는 클래스
@Configuration
@EnableWebMvc
@ComponentScan("co.jw.sol.controller")
@ComponentScan("co.jw.sol.beans")
public class ServletAppContext implements WebMvcConfigurer{
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/",".jsp");
		
	}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/resources/");
	}
	
	
	//프로퍼티파일을 메시지로 등록함
	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		
		ReloadableResourceBundleMessageSource res = 
				new ReloadableResourceBundleMessageSource();
		
		res.setBasenames("/WEB-INF/properties/d1", "/WEB-INF/properties/d2");
		
		return res;
	}
	

}
