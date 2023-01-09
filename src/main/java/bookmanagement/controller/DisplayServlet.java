package bookmanagement.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bookmanagement.persistant.dao.BookDAOImpl;
import bookmanagement.persistant.dto.BookDTO;

/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse
    		response) throws ServletException, IOException {
    		BookDAOImpl impl = new BookDAOImpl();
    		List<BookDTO> list = impl.selectAll();
    		if(list.size()==0) {
    		request.setAttribute("msg", "Data not found");
    		}
    		else{
    		request.setAttribute("list", list);
    		request.getRequestDispatcher("displayBook.jsp").forward(request,response);
    		}
    		}
    		/**
    		* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
    		response)
    		*/
    		protected void doPost(HttpServletRequest request, HttpServletResponse
    		response) throws ServletException, IOException {
    		// TODO Auto-generated method stub
    		doGet(request, response);
    		}
    		}