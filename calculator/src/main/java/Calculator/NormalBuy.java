package Calculator;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NormalBuy extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int shirtprice=1200;
		int shoesprice=2800;
		int watchprice=2200;
		
		int discount=200;
		String product=req.getParameter("product");
		resp.getWriter().print("<h1>you selected: "+ product +"</h1>");
		resp.getWriter().print("<h1>Discount is: "+ discount +"</h1>");
		if(product.equalsIgnoreCase("shirt"))
		{
			resp.getWriter().print("<h1>Actual price is : " + shirtprice + "</h1>");
			resp.getWriter().print("<h1>Total price is  : " + (shirtprice-discount) + "</h1>");
		}
		else if(product.equalsIgnoreCase("shoe")) {
		resp.getWriter().print("<h1>Actual price is : " + shoesprice + "</h1>");
		resp.getWriter().print("<h1>Total price is  : " + (shoesprice-discount) + "</h1>");
		}
		else {
		 resp.getWriter().print("<h1>Actual price is : " + watchprice + "</h1>");
		resp.getWriter().print("<h1>Total price is  : " + (watchprice-discount) + "</h1>");
	}
	}
}



