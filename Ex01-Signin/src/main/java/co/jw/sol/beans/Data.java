package co.jw.sol.beans;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Data {

//	아이디, 비번, 이름, 메일
	@NotBlank
	@Size(min=3, max=10)
	private String uId;
	
	@Pattern(regexp="[a-zA-Z0-9]*")
	@Size(min=5, max=10)
	private String pwd;

	@NotBlank
	private String uName;
	
	@Email
	private String uEmail;

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

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	
}
