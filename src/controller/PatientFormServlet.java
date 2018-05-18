package controller;

import java.io.IOException;
import model.MedicalRecord;
import model.MRExploitations;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PatientFormServlet
 */
@WebServlet("/PatientFormServlet")
public class PatientFormServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String useraccount = session.getAttribute("useraccount").toString();
			
		String mrID = request.getParameter("mrID");	
		
		MedicalRecord mr = null;
		
		mr = MRExploitations.ReadMR(mrID);
		request.setAttribute("mr", mr);	
		RequestDispatcher rd = request.getRequestDispatcher("InfoMR.jsp");
		rd.forward(request, response);		
  	 }
}