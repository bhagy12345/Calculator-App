package Calculator;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/add")

public class Addition implements Servlet
{
	public static void main(String[] args) {
	
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String a=req.getParameter("a");
		String b=req.getParameter("b");
		int x=Integer.parseInt(a);
		int y=Integer.parseInt(b);
		int result=x+y;
		res.getWriter().print("<h1 style='color:red'>The sum of "+x+" and "+y+" is "+result+"</h1>");
//		System.out.println(b);
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
