package co.jw.sol.model;

import javax.servlet.http.HttpServletRequest;

public class Test {
	public static int multi(HttpServletRequest request) {
		
		int str1=(Integer.parseInt(request.getParameter("d1")));
		int str2=(Integer.parseInt(request.getParameter("d2")));
		
		int r=str1*str2;
		
		return r;
		
	}

}
