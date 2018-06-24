package pl.coderslab.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Receiver")
public class Receiver extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Receiver() {
        super();
    }
//W servlecie dostępnym pod adresem /receiver napisz kod, który odbierze te zmienne i wyświetli je na ekranie.
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String mail = request.getParameter("mail");
		String id = request.getParameter("id");
		
		response.getWriter().append(name + ", " + mail + ", " + id);
	}
}