package co.jw.sol.beans;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Data {
	
	@AssertTrue
	private boolean d1;
	//항상 true 여야 한다
	
	@AssertFalse
	private boolean d2;
	
	@Max(100)
	@Min(10)
	private String d3;
	//10~100
	
	@Null
	private String d4;
	//빈값이여야한다
	
	@NotNull
	private String d5;
	//무조건 값이 있어야 한다
	
	@Digits(integer = 3, fraction = 3)
	private String d6;
	//정수 자리수3, 실수(소수점) 3자리
	
	@Size(min=4, max=10)
	private String d7;
	//4~10 글자수(길이)
	
	@Pattern(regexp="[a-zA-Z]*")
	private String d8;
	//정규식표현 영문 소문자, 대문자 범위

	public Data() {
		this.d1 = true;
		this.d2 = false;
		this.d3 = "22";
		this.d4 = null;
		this.d5 = "java";
		this.d6 = "444.444";
		this.d7 = "aaaa";
	}
	

	public boolean isD1() {
		return d1;
	}

	public void setD1(boolean d1) {
		this.d1 = d1;
	}

	public boolean isD2() {
		return d2;
	}

	public void setD2(boolean d2) {
		this.d2 = d2;
	}

	public String getD3() {
		return d3;
	}

	public void setD3(String d3) {
		this.d3 = d3;
	}

	public String getD4() {
		return d4;
	}

	public void setD4(String d4) {
		this.d4 = d4;
	}

	public String getD5() {
		return d5;
	}

	public void setD5(String d5) {
		this.d5 = d5;
	}

	public String getD6() {
		return d6;
	}

	public void setD6(String d6) {
		this.d6 = d6;
	}

	public String getD7() {
		return d7;
	}

	public void setD7(String d7) {
		this.d7 = d7;
	}

	public String getD8() {
		return d8;
	}

	public void setD8(String d8) {
		this.d8 = d8;
	}
	
}
