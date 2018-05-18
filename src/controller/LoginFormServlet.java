package controller;

import model.Authenticator;

import java.io.IOException;
/*import Model.MedicalRecord;
import Model.MRExploitations;
import java.util.ArrayList;
import java.util.List;
*/

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class LoginFormServlet
 */
/*@WebServlet(name="LoginFormServlet", urlPatterns={"/login"})
 */

@WebServlet("/LoginFormServlet")
public class LoginFormServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String useraccount = request.getParameter("useraccount");
		String password = request.getParameter("password");
		String role = request.getParameter("role");
		String errorString = null;
		
		if(Authenticator.Authenticate(useraccount, password, role)){
			session.setAttribute("useraccount", useraccount);	
			session.setAttribute("role", role);	
			
			if (role.equals("Patient")){
				RequestDispatcher rd = request.getRequestDispatcher("Patient.jsp");
				rd.forward(request, response);				
			}		
			else
				if (role.equals("Doctor")){
					RequestDispatcher rd = request.getRequestDispatcher("Doctor.jsp");
					rd.forward(request, response);				
				}
				else
					if (role.equals("Receptionist")){						
						RequestDispatcher rd = request.getRequestDispatcher("Rceptionist.jsp");
						rd.forward(request, response);				
					}
		}
		else{			
			if (useraccount == null || password == null||role==null || useraccount.length() == 0 || password.length() == 0||role.length() == 0) {
		          errorString = "Required username, password and role!";
			}
			else
				errorString = "User account or password or role invalid!";
			
			
			request.setAttribute("errorString", errorString);
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
	}
}