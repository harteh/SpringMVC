package co.jw.sol.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.jw.sol.beans.Data;
import co.jw.sol.beans.Data2;

@Controller
public class SpController {
	
	//파라미터로 넘긴 값들 d1,d2,d3값이 ( Data클래스에 있는 d1,d2,d3 )에 자동주입된다
	//파라미터로 넘긴 값들 d1,d2 ( Data2클래스에 있는 d1,d2 )에 자동주입된다
	@GetMapping("/t1")
	public String a1(Data bean, Data2 bean2) {
		
		System.out.println(bean.getD1());
		System.out.println(bean.getD2());
		
		for(int n:bean.getD3()) {
			System.out.println(n);
		}
		
		System.out.println(bean2.getD1());
		System.out.println(bean2.getD2());
		
		return "final";
				
	}
	
	@GetMapping("/t2")
	public String a2(@RequestParam Map<String,String> m, 
			@RequestParam List<String> d3) {
		
		String s=m.get("d1");
		String s2=m.get("d2");
		String s3=m.get("d3");
		
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
				
		for(String a:d3) {
			System.out.println(a);
		}
		
		return "final";
		
		
	}
	
}



































