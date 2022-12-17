package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.bank.empdao.CustomerDao;
import com.bank.model.Customer;

/**
 * Servlet implementation class Transfers
 */
public class Transfers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Transfers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session=request.getSession(false);
		Customer cus = new Customer();
		cus = (Customer)session.getAttribute("cus");
		CustomerDao test=new CustomerDao();
		
		if("TranferBa".equalsIgnoreCase(request.getParameter("GoTranferBa")))
		{
			request.setAttribute("checking",cus.getCheckings_ac());
			
			request.setAttribute("savings",cus.getSavings_ac());
			
			request.getRequestDispatcher("TransferBWac.jsp").forward(request, response);
		}
		else if("FromTranferBa".equalsIgnoreCase(request.getParameter("GoFromTranferBa")))
		{
			//PrintWriter output = response.getWriter();
			String StoC = request.getParameter("StoC");
			String CtoS = request.getParameter("CtoS");
			float amount = Float.parseFloat(request.getParameter("amount"));
			float cSavings = cus.getSavings_ac();
			float cChecking = cus.getCheckings_ac();
			request.setAttribute("name", cus.getFirstname() + " " + cus.getLastname());
			
			request.setAttribute("username",cus.getUsername());
			
			request.setAttribute("phone_no", cus.getPhone_no());
			
			request.setAttribute("email", cus.getEmail());
			
			request.setAttribute("dob",cus.getDob());
			
			request.setAttribute("checking",cus.getCheckings_ac());
			
			request.setAttribute("savings",cus.getSavings_ac());
			//output.println(StoC+"\n"+CtoS);
			if(StoC != null && CtoS == null)
			{
				//output.println(StoC+"\n"+CtoS);
				
				if(amount<cSavings )
				{
					cSavings = cSavings - amount;
					cChecking = cChecking + amount;
				}
				else
					request.getRequestDispatcher("Insuffu.jsp").forward(request, response);
			}
			else
			{
				if(amount < cChecking )
				{
					cChecking = cChecking - amount;
					cSavings = cSavings + amount;
				}
				else
					request.getRequestDispatcher("Insuffu.jsp").forward(request, response);
			}
			test.UpdateBalc(cus.getUsername(), cSavings, cChecking);
			request.getRequestDispatcher("SuccUpHome").forward(request, response);
		}
		else if("GoFromSendMoney".equalsIgnoreCase(request.getParameter("GoSendMoney")))
		{
			//PrintWriter output = response.getWriter();
			//output.println("Hello");
			String susername = request.getParameter("susername");
			float amount=  Float.parseFloat(request.getParameter("amount"));
			if(amount<cus.getCheckings_ac())
			{
				test.SendMoney(susername, amount);
				test.SubMoney(cus.getUsername(), (cus.getCheckings_ac()-amount));
				request.getRequestDispatcher("SuccUpHome.jsp").forward(request, response);
			}
			else
				request.getRequestDispatcher("Insuffu.jsp").forward(request, response);
		}
		else if("withdrawTo_FORM".equalsIgnoreCase(request.getParameter("FORM_SUBMITTEDwithdrawTo")))
		{
			//PrintWriter output = response.getWriter();
			//output.println("Hello");
			request.setAttribute("checking",cus.getCheckings_ac());
			request.getRequestDispatcher("Withdraw.jsp").forward(request, response);
			
		}
		else if("withdraw_FORM".equalsIgnoreCase(request.getParameter("FORM_SUBMITTEDwithdraw")))
		{
			//PrintWriter output = response.getWriter();
			//output.println("Hello");
			float amount = Float.parseFloat(request.getParameter("amount"));
			if(amount<cus.getCheckings_ac())
			{
				amount = cus.getCheckings_ac() - amount;
				test.SubMoney(cus.getUsername(), amount);
				request.getRequestDispatcher("CustomerLogin.html").forward(request, response);
			}
			else
				request.getRequestDispatcher("Insuffu.jsp").forward(request, response);
		}
		else if("deposit_FORM".equalsIgnoreCase(request.getParameter("FORM_SUBMITTEDdeposit")))
		{
			//PrintWriter output = response.getWriter();
			//output.println("Hello");
			float amount = Float.parseFloat(request.getParameter("amount"));

			amount = cus.getCheckings_ac() + amount;
			test.SubMoney(cus.getUsername(), amount);
			request.getRequestDispatcher("CustomerLogin.html").forward(request, response);
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
