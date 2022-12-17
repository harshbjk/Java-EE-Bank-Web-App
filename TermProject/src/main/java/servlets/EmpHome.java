package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.bank.empdao.BankDao;
import com.bank.empdao.CustomerDao;
import com.bank.model.Customer;
import com.bank.model.Employee;

/**
 * Servlet implementation class EmpHome
 */
public class EmpHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpHome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		CustomerDao test=new CustomerDao();
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		if("Search_FORM".equalsIgnoreCase(request.getParameter("FORM_SUBMITTEDSearch")))
		{
			Customer cus = new Customer();
			String user=request.getParameter("username");
			cus = test.checkUser(user);
			request.setAttribute("fname", cus.getFirstname());
			
			request.setAttribute("lname", cus.getLastname());
			
			request.setAttribute("username",cus.getUsername());
			
			request.setAttribute("phone_no", cus.getPhone_no());
			
			request.setAttribute("email", cus.getEmail());
			
			request.setAttribute("address",cus.getAddress());
			
			request.setAttribute("dob",cus.getDob());
			
			request.setAttribute("sin_no",cus.getSin_no());
			
			request.setAttribute("checking",cus.getCheckings_ac());
			
			request.setAttribute("savings",cus.getSavings_ac());
			
			//PrintWriter output = response.getWriter();
			//output.println(cus.getUsername());
			
			request.getRequestDispatcher("SearchRes.jsp").forward(request, response);
			
		}
		if("Add_FORM".equalsIgnoreCase(request.getParameter("FORM_SUBMITTEDAdd")))
		{
			request.getRequestDispatcher("NewCus.jsp").forward(request, response);
		}
		if("Edit_FORM".equalsIgnoreCase(request.getParameter("FORM_SUBMITTEDEdit")))
		{
			//PrintWriter output = response.getWriter();
			//output.println("Edit");
			String username = request.getParameter("username");
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String phone_no = request.getParameter("phone_no");
			String email = request.getParameter("email");
			String address = request.getParameter("address");
			String dob = request.getParameter("dob");
			String sin = request.getParameter("sin_no");
			float checking = Float.parseFloat(request.getParameter("checking"));
			float savings = Float.parseFloat(request.getParameter("savings"));
			test.UpdateAll(username, fname, lname, dob, address, email, phone_no, sin, checking, savings);
			request.getRequestDispatcher("EmployeHomePage.jsp").forward(request, response);
		}
		if("create_FORM".equalsIgnoreCase(request.getParameter("FORM_SUBMITTEDcreate")))
		{
			
			//PrintWriter output = response.getWriter();
			//output.println("Create");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String phone_no = request.getParameter("phone_no");
			String email = request.getParameter("email");
			String address = request.getParameter("address");
			String dob = request.getParameter("dob");
			String sin = request.getParameter("sin_no");
			float checking = Float.parseFloat(request.getParameter("checking"));
			float savings = Float.parseFloat(request.getParameter("savings"));
			test.InsertAll(password, username, fname, lname, dob, address, email, phone_no, sin, checking, savings);
		}
		}catch (NumberFormatException e) {
			request.getRequestDispatcher("WrongInput.jsp").forward(request, response);
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
