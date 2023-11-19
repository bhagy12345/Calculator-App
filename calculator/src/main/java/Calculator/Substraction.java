package Calculator;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/sub")

public class Substraction extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int x=Integer.parseInt(req.getParameter("a"));
		int y=Integer.parseInt(req.getParameter("b"));
		int result=x-y;
		res.getWriter().print("<h1 style='color:blue'>The difference of "+x+" and "+y+" is "+result+"</h1>");
		
		
	}
}
