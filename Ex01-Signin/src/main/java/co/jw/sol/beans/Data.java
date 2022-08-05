package co.jw.sol.beans;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Data {

	@NotBlank
	@Size(min=3, max=10)
	private String uId;
	
	@Pattern(regexp="[a-zA-Z0-9]*")
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
