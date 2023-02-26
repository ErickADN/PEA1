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
        
        String id= request.getParameter("id");
        Object data =null;
        if( id== null ) {
             data = daoCine.getVerCines(true);
            session.setAttribute("id", data==null ? null : "cines");
            session.setAttribute("data", data);
            
        }else {
        	data = daoCine.getVerCine(id,true);
            session.setAttribute("id", data==null ? null : "cine");
            session.setAttribute("data", data);
            session.setAttribute("mTarifas", daoCine.getCineTarifas(id,true));
            session.setAttribute("mPeliculas", daoCine.getCinePeliculas(id,true));
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
