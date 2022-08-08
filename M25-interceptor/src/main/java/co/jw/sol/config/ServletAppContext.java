package co.jw.sol.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import co.jw.sol.interceptor.Inter1;
import co.jw.sol.interceptor.Inter2;
import co.jw.sol.interceptor.Inter3;
import co.jw.sol.interceptor.Inter4;
import co.jw.sol.interceptor.Inter5;

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
	
	//Interceptor 등록
	public void addInterceptors(InterceptorRegistry re) {
		
		WebMvcConfigurer.super.addInterceptors(re);
		
		Inter1 i1 = new Inter1();
		InterceptorRegistration r1 = re.addInterceptor(i1);
		r1.addPathPatterns("/t1");
		
		
		Inter2 i2 = new Inter2();
		InterceptorRegistration r2 = re.addInterceptor(i2);
		r2.addPathPatterns("/t1");
		
		
		Inter3 i3 = new Inter3();
		InterceptorRegistration r3 = re.addInterceptor(i3);
		r3.addPathPatterns("/t1","/t2");
		//전체에 추가 됨
		r3.addPathPatterns("/*");
		// "/s1/t3" 에는 추가가 안된다?
		
		
		Inter5 i5 = new Inter5();
		InterceptorRegistration r5 = re.addInterceptor(i5);
		r2.addPathPatterns("/s1/*");

		
		Inter4 i4 = new Inter4();
		InterceptorRegistration r4 = re.addInterceptor(i4);
		//inter4에 모든경로를 추가?
		r4.addPathPatterns("/**");
		//어떤 경로는 제외하고 등록하고 싶을때
		r4.excludePathPatterns("/*");
		
		
		
		
	}
	

}
