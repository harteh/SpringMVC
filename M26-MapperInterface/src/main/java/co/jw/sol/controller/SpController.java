package co.jw.sol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import co.jw.sol.beans.Data;
import co.jw.sol.database.MapperInterface;


@Controller
public class SpController {
	

	@Autowired
	MapperInterface m1;
	
	@GetMapping("/t1")
	public String t1() {
		return "t1";
	}
	
	//Data만 저장됨
	@PostMapping("/t2")
	public String t2(Data d) {
		m1.in_sert(d);
		//인터페이스 m1에 Data 자바빈에 넣는다
		return "t2";
	}
	
	@GetMapping("/output")
	public String out(Model m) {
		
		//함수를 호출하면 함수 위의 어노테이션이 실생된다
		List<Data> li = m1.sel();
		//받아온 값을 값을 모델에 담는다
		m.addAttribute("li", li);
		return "output";
	}
	
	
	
	
	
	
}