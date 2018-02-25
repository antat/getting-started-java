package gettingstartedjava2;


import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    name = "А это уже мой сервлет",
    urlPatterns = {"/MyServlet"}
)
public class MyServlet extends HttpServlet {
	
	@Override
	 public void doGet(HttpServletRequest request, HttpServletResponse response) 
	      throws IOException {
	      
	    response.setContentType("text/plain");
	    response.setCharacterEncoding("UTF-8");

	    response.getWriter().print("Мой сервлет!\r\n");

	  }
}
