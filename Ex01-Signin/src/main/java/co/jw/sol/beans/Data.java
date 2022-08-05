package co.jw.sol.beans;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

public class Data {

	@Size(min=3, max=10)
	private String uId;
	
	@Size(min=3, max=10)
	private String pwd;

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
