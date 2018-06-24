package pl.coderslab.web;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Randomquote")
public class Randomquote extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Randomquote() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random r = new Random ();
		response.setCharacterEncoding("UTF-8");
		HttpSession sess = request.getSession();
		Quote [] quotes = (Quote []) sess.getAttribute("Quotes");
		if (quotes != null) {
			String view = "<table><tr><th>Author</th><th>Quote</th></tr>";
			int chosen = r.nextInt(quotes.length);
			for (int i=0; i<quotes.length; i++) {
				if (i == chosen) {
					view += String.format("<tr><td>%s</td><td>%s</td></tr>", quotes[i].getAuthor(), quotes[i].getContent());
				}
			}
			view += "</table>";
			response.getWriter().append(view);
		} else {
			response.getWriter().append("Brak zapisanych cytatów");
		}
	}
}