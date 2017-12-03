package buaa;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demo")
public class ClientServer extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// method setContentType
		resp.setContentType("text/html");
		
		// method getParmater
		String name = req.getParameter("name");
		
		// Get Header Info
		String uri = req.getRequestURI();
		String method = req.getMethod();
		String remoteAddress = req.getRemoteAddr();
		String protocol = req.getProtocol();
		
		// working with cookie
		Cookie cookie = new Cookie("MyCookie", name);
		resp.addCookie(cookie);
		
		// Set Attribute
		req.setAttribute("name", name);
		req.setAttribute("uri", uri);
		req.setAttribute("method", method);
		req.setAttribute("remoteAddress", remoteAddress);
		req.setAttribute("protocol", protocol);
		
		req.getRequestDispatcher("display.jsp").forward(req, resp);
	}
	
}

