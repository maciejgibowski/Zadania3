package pl.coderslab.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Smurfs")
public class Smurfs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Smurfs() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//Utwórz servlet dostępny pod adresem /smurfs, przekaż do widoku smurfs.jsp listę utworzoną przez klasę SmurfDao.
//Wyświetl w tabeli html wszystkie informacje dotyczące smerfów (nie korzystaj z metody toString() obiektu).
		
		request.setAttribute("smurfs", SmurfDao.getList());
		getServletContext().getRequestDispatcher("/views/smurfs.jsp").forward(request, response);
	}
}