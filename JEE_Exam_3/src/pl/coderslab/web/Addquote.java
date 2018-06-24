package pl.coderslab.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/addquote")
public class Addquote extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Addquote() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/views/addquote.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession();
		Quote [] quotes = (Quote []) sess.getAttribute("Quotes");
		if (quotes == null) {
			quotes = new Quote [0];
		}
		quotes=Quote.addSlot(quotes);
		quotes[quotes.length-1] = new Quote (request.getParameter("author"), request.getParameter("quote"));
		sess.setAttribute("Quotes", quotes);
	}
}