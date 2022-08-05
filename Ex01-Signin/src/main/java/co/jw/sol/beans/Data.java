package co.jw.sol.beans;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

public class Data {

	@Size(min=3, max=10)
	private String d1;
	
	@Max(100)
	private int d2;

	public String getD1() {
		return d1;
	}

	public void setD1(String d1) {
		this.d1 = d1;
	}

	public int getD2() {
		return d2;
	}

	public void setD2(int d2) {
		this.d2 = d2;
	}
	
}
