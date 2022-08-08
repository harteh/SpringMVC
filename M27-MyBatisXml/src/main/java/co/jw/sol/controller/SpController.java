package co.jw.sol.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import co.jw.sol.beans.Data;


@Controller
public class SpController {
	
	@Autowired
	SqlSessionTemplate SqlSessionTemplate; 
	
	@GetMapping("/t1")
	public String t1() {
		return "t1";
	}
	
	@PostMapping("/t2")
	public String t2(Data d) {
		SqlSessionTemplate.insert("test_db.in_sert", d);
		
		return "t2";
	}

	@GetMapping("/output")
	public String out(Model m) {
		List<Data> li = SqlSessionTemplate.selectList("test_db.sel");
		m.addAttribute("li",li);
		return "output";
	}
	
}