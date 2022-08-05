package co.jw.sol.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import co.jw.sol.beans.Data;


import co.jw.sol.beans.Data;

public class Vali implements Validator{

	public boolean supports(Class<?> clazz) {
		return Data.class.isAssignableFrom(clazz);
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "d2", "error2");
		//값이 비어있는지 확인하겠다
		//d2의 에러에 대한 이름을 에러2로 설정
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "d3", "error3");
		//값이 비어있는지 공백
		
		Data d = (Data)target;
		
		String str = d.getD2();
		String str2 = d.getD3();
		
		//rejectValue : 유효성 조건을 직접 만들어 검사할 때 사용
		//-> 오류 정보를 지정함
		if(str.length()>10) {
			errors.rejectValue("d2", "error4");
			//값이 비진 않았는데 10이상이면 error4로 에러를 등록하겠다
		}
		
		if(str2.contains("@") == false) {
			errors.rejectValue("d3", "error5");
		}
		
	}


}
