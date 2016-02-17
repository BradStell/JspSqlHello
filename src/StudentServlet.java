

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentDAO studentDAO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        studentDAO = new StudentDAO();
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getOutputStream().write("this is a message".getBytes());
		try {
			List<Student> students = studentDAO.list();
			request.setAttribute("students", students);
			request.getRequestDispatcher("/WEB-INF/students.jsp").forward(request, response);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}   
}
