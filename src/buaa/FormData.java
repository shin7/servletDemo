package buaa;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form")
public class FormData extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("===========FormData: doGet===========");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		// Get Parameter value
		String name = req.getParameter("name");
		name = name != null? name : "Servlet";
		
		out.println(String.format("<h1>Hello <i>%s</i>!</h1>", name));
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("===========FormData: doPost===========");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<table  border='1'>");
		out.println("<tr bgcolor='#C6C6C6'>");
		out.println("<th>Param Name</th>");
		out.println("<th>Param Value</th>");
		out.println("</tr>");
		
		Enumeration<String> paramNames = req.getParameterNames();
		while(paramNames.hasMoreElements()) {
			out.println("<tr>");
			String paramName = paramNames.nextElement();
			out.println(String.format("<td>%s</td>", paramName));
			
			String[] paramValues = req.getParameterValues(paramName);
			out.println("<td><ul>");
			for(String value : paramValues) {
				out.print(String.format("<li>%s</li>", value));
			}
			out.println("</ul></td>");
			out.println("</tr>");
		}
		out.println("</table>");
	}
	
}

