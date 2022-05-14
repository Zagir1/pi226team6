package laba4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.Console;
import java.io.IOException;


@WebServlet(name="Calc", urlPatterns="/Calc")
public class Calc extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstParameter;
		String secondParameter;
		Double result = new Double(0);
		
		firstParameter = request.getParameter("first");
		secondParameter = request.getParameter("second");
		
		PerimeterCalculation pyr = new PerimeterCalculation(firstParameter,secondParameter);
		result = pyr.calculate(pyr.getside2(), pyr.getside1());
		
		request.setAttribute("first", firstParameter);
		request.setAttribute("second", secondParameter);
 		request.setAttribute("result", result);
 		
 		request.getRequestDispatcher("/Results.jsp").forward(request, response);
		
}
}