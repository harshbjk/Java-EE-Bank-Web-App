package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


import com.mysql.jdbc.PreparedStatement;
import com.bank.empdao.*;
import com.bank.model.Employee;
/**
 * Servlet implementation class LoginServ
 */
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		BankDao test=new BankDao();
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		Employee emp = new Employee();
		String user=request.getParameter("userName");
		String pass=request.getParameter("userPassword");
		emp = test.checkUserandPass(user, pass);
		if(emp.getUserName() != null)
			request.getRequestDispatcher("EmployeHomePage.jsp").forward(request, response);
		else
			response.sendRedirect("LogInError.html");  
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
