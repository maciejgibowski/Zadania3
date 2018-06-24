package pl.coderslab.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/homepage")
public class Homepage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Homepage() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie cookie = new Cookie("agree", "true");
		cookie.setMaxAge(60 * 2);
		response.addCookie(cookie);
		getServletContext().getRequestDispatcher("/views/homepage.jsp").forward(request, response);
	}
}