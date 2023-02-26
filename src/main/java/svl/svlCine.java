package svl;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


public class svlCine extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public svlCine() {
        super();
       
    }


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        dao.daoCine daoCine = new dao.daoCine();
        
        Object idCine= request.getParameter("idCine");
        if( idCine== null ) {
            String [][] mCines = daoCine.getVerCines();
            session.setAttribute("id", mCines==null ? null : "cines");
            session.setAttribute("mCines", mCines);
            
        }
        response.sendRedirect("index.jsp");
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

}
