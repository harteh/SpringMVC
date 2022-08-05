package co.jw.sol.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import co.jw.sol.beans.Data;


@Controller
public class SpController {
	
	@GetMapping("/t1")
	public String t1() {
		return "t1";
	}
	@PostMapping("/po")
	public String po(@Valid Data data1, BindingResult result) {
		System.out.println(data1.getD1());
		System.out.println(data1.getD2());
		
		System.out.println(result);
		
		if(result.hasErrors()) {
			//유효성 위반했을 때, (size,max) 위반 결과값들을 다 가져옴
			
			for(ObjectError obj:result.getAllErrors()) {
				System.out.println(obj.getDefaultMessage());
				System.out.println(obj.getCode());
				
				String [] codes = obj.getCodes();
				for(String s:codes) {
					System.out.println(s);
				}
				
				//어노테이션이름.
				if(codes[0].equals("Size.data.d1")) {
					System.out.println("d1은 3~10글자를 쓸 수 있다");
				}
				else if(codes[1].equals("Max.data.d2")) {
					System.out.println("d2는 100보다 클 수 없다");
				}
			}//obj end
			return "t1";
			
		}//hasErrors end
		return "success";
		
	}//po end
	
}