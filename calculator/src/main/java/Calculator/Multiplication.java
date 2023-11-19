package Calculator;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Multiplication extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int x=Integer.parseInt(req.getParameter("a"));
		int y=Integer.parseInt(req.getParameter("b"));
		int result=x * y;
		resp.getWriter().print("<h1 style='color:black'>The Mul of "+x+" and "+y+" is "+result+"</h1>");
	}
	

}
