package servlets;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.bank.empdao.BankDao;
import com.bank.empdao.CustomerDao;
import com.bank.model.Customer;
import com.bank.model.Employee;

/**
 * Servlet implementation class LoginServCus
 */
public class LoginServCus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServCus() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		CustomerDao test=new CustomerDao();
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		Customer cus = new Customer();
		String user=request.getParameter("userName");
		String pass=request.getParameter("userPassword");
		cus = test.checkUserandPass(user, pass);
		
		request.setAttribute("name", cus.getFirstname() + " " + cus.getLastname());
		
		request.setAttribute("username",cus.getUsername());
		
		request.setAttribute("phone_no", cus.getPhone_no());
		
		request.setAttribute("email", cus.getEmail());
		
		request.setAttribute("dob",cus.getDob());
		
		request.setAttribute("checking",cus.getCheckings_ac());
		
		request.setAttribute("savings",cus.getSavings_ac());
		
		
		cus = test.checkUserandPass(user, pass);
		
		HttpSession session=request.getSession();
		session.setAttribute("cus",cus);
		/*session.setAttribute("uname",cus.getUsername());
		session.setAttribute("fname",cus.getFirstname());
		session.setAttribute("lname",cus.getLastname());
		session.setAttribute("phone",cus.getPhone_no());
		session.setAttribute("email",cus.getEmail());
		session.setAttribute("dob",cus.getDob());
		session.setAttribute("address",cus.getAddress());*/
		
		if(cus.getUsername() != null)
			request.getRequestDispatcher("CusHome.jsp").forward(request, response); 
		else
			response.sendRedirect("CustomerLoginError.html");  
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
