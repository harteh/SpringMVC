package co.jw.sol.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

import co.jw.sol.beans.Data;
import co.jw.sol.beans.Data2;

@Configuration
public class RootAppContext {
	
	@Bean
	@RequestScope
	//범위를 Request 영역까지 설정한다(생략 가능)
	//응답결과가 브라우저로 전송될 때까지 유지
	public Data d1() {
		return new Data();	//리턴값은 Data객체의 주소값
	}

	@Bean("b1")
	public Data2 d2() {
		return new Data2();
	}
}
