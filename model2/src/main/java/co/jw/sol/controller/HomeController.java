package co.jw.sol.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;

import co.jw.sol.model.Test;

@WebServlet("*.mvc")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HomeController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String url=request.getRequestURI(); //index.mvc
		String name=null;
		
		if(url.contains("index.mvc")) {
			name="main.jsp";
		}
		else if(url.contains("t1.mvc")) {
			int str1=(Integer.parseInt(request.getParameter("d1")));
			int str2=(Integer.parseInt(request.getParameter("d2")));
			
			int r=str1+str2;
			
			request.setAttribute("r", r);
			name="t1.jsp";	
		}
		else if(url.contains("t2.mvc")) {
			
			int r=Test.multi(request);  //곱하기
			request.setAttribute("r", r);
			name="t2.jsp";
		}
		RequestDispatcher di=request.getRequestDispatcher(name);
		di.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
