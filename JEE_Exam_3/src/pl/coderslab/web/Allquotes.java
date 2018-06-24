package pl.coderslab.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/allquotes")
public class Allquotes extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Allquotes() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		HttpSession sess = request.getSession();
		Quote [] quotes = (Quote []) sess.getAttribute("Quotes");
		if (quotes == null) {
			quotes = new Quote [0];
		}
		String view = "<table><tr><th>Author</th><th>Quote</th></tr>";
		for (Quote quote : quotes) {
			view += String.format("<tr><td>%s</td><td>%s</td></tr>", quote.getAuthor(), quote.getContent());
		}
		view += "</table>";
		response.getWriter().append(view);
	}
}