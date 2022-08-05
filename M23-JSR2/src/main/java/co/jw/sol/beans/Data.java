package co.jw.sol.beans;

import javax.validation.constraints.Email;
import javax.validation.constraints.Negative;
import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

public class Data {
	
	@NotEmpty
	private String d1;
	//비어있으면 안된다. 공백을 인식한다
	
	@NotBlank
	private String d2;
	//비어있으면 안된다. 공백을 인식하지 않는다
	
	@Positive
	private int d3;
	//양수
	
	@PositiveOrZero
	private int d4;
	
	@Negative
	private int d5;
	
	@NegativeOrZero
	private int d6;
	
	@Email
	private String d7;

	public Data() {
		this.d1 = "ab";
		this.d2 = "ab";
		this.d3 = 55;
		this.d4 = 55;
		this.d5 = 66;
		this.d6 = 66;
	}

	public String getD1() {
		return d1;
	}

	public void setD1(String d1) {
		this.d1 = d1;
	}

	public String getD2() {
		return d2;
	}

	public void setD2(String d2) {
		this.d2 = d2;
	}

	public int getD3() {
		return d3;
	}

	public void setD3(int d3) {
		this.d3 = d3;
	}

	public int getD4() {
		return d4;
	}

	public void setD4(int d4) {
		this.d4 = d4;
	}

	public int getD5() {
		return d5;
	}

	public void setD5(int d5) {
		this.d5 = d5;
	}

	public int getD6() {
		return d6;
	}

	public void setD6(int d6) {
		this.d6 = d6;
	}

	public String getD7() {
		return d7;
	}

	public void setD7(String d7) {
		this.d7 = d7;
	}
	
}
