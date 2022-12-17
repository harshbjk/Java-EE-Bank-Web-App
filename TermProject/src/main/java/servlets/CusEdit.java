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
import com.bank.empdao.*;
import com.bank.model.Customer;

/**
 * Servlet implementation class CusEdit
 */
public class CusEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CusEdit() {
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
		HttpSession session=request.getSession(false);
		Customer cus = new Customer();
		cus = (Customer)session.getAttribute("cus");
		CustomerDao test=new CustomerDao();
		if("REGISTER_FORM".equalsIgnoreCase(request.getParameter("FORM_SUBMITTED")))
		{
			String username = cus.getUsername();
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String phone_no = request.getParameter("phone_no");
			String email = request.getParameter("email");
			String address = request.getParameter("address");
			String dob = request.getParameter("dob");
			
			
			test.UpdatePersonal(username, fname, lname, dob, address, email, phone_no);
			request.getRequestDispatcher("CustomerLogin.html").forward(request, response);

		}
		else if("REGISTER_FORM1".equalsIgnoreCase(request.getParameter("FORM_SUBMITTED1")))
		{
			String Cpass = request.getParameter("Cpass");
			String NPass = request.getParameter("NPass");
			String RNPass = request.getParameter("RNPass");
			PrintWriter output = response.getWriter();
			//output.println(Cpass +" \n" + NPass +" \n" + RNPass);
			if(Cpass.equals((cus.getPassword())))
			{
				if(NPass.equals(RNPass))
				{
					test.UpdatePass(NPass, cus.getUsername());
					request.getRequestDispatcher("SuccUpHome.jsp").forward(request, response);
				}
			}
		}
		else {
			
			request.setAttribute("usernmae",cus.getUsername());
			
			request.setAttribute("fname",cus.getFirstname());
			
			request.setAttribute("lname",cus.getLastname());
	
			request.setAttribute("phone_no", cus.getPhone_no());
			
			request.setAttribute("email", cus.getEmail());
			
			request.setAttribute("dob",cus.getDob());
			
			request.setAttribute("address",cus.getAddress());
			
			
			request.getRequestDispatcher("CusEdit.jsp").forward(request, response);
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
