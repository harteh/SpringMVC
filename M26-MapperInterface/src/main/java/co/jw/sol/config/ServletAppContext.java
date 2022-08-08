package co.jw.sol.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import co.jw.sol.database.MapperInterface;

//spring mvc프로젝트의 관련된 설정을 하는 클래스
@Configuration
@EnableWebMvc
@ComponentScan("co.jw.sol.controller")
@PropertySource("/WEB-INF/properties/db.properties")
public class ServletAppContext implements WebMvcConfigurer{
	
	//프로퍼티 주입
	@Value("${db.classname}")
	private String db_classname;
	
	@Value("${db.url}")
	private String db_url;
	
	@Value("${db.username}")
	private String db_username;
	
	@Value("${db.password}")
	private String db_password;
	
	
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
	
	//DB 접속정보 관리 - 주입받은 값 대입
	@Bean
	public BasicDataSource dataSource() {
		
		BasicDataSource so = new BasicDataSource();
		so.setDriverClassName(db_classname);
		so.setUrl(db_url);
		so.setUsername(db_username);
		so.setPassword(db_password);
		
		return so;
	}
	
	//쿼리문 접속 관리
	@Bean
	public SqlSessionFactory fac(BasicDataSource so) throws Exception{
		
		SqlSessionFactoryBean fac = new SqlSessionFactoryBean();
		fac.setDataSource(so);
		SqlSessionFactory f = fac.getObject();
		return f;
	}
	
	//쿼리문 실행 관리
	@Bean
	public MapperFactoryBean<MapperInterface> mm(SqlSessionFactory fac) throws Exception{
		
		MapperFactoryBean<MapperInterface> fa = new MapperFactoryBean<MapperInterface>(MapperInterface.class);
		fa.setSqlSessionFactory(fac);
		
		return fa;
	}

}
