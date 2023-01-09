package bookmanagement.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bookmanagement.persistant.dao.BookDAOImpl;
import bookmanagement.persistant.dto.BookDTO;

/**
 * Servlet implementation class DeleteBookServlet
 */
@WebServlet("/DeleteBookServlet")
public class DeleteBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request,
    		HttpServletResponse response) throws ServletException,
    		IOException {

    		String code = request.getParameter("code");
    		BookDTO dto = new BookDTO();
    		dto.setBookCode(code);
    		BookDAOImpl impl = new BookDAOImpl();
    		int i = impl.deleteData(dto);
    		if(i>0)
    		response.sendRedirect("DisplayServlet");
    		else {
    		request.setAttribute("msg", "Delete Fail!");
    		request.getRequestDispatcher("displayBook.jsp").forward(request, response);
    		}
    		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
