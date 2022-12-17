package com.bank.empdao;
import com.bank.empdao.*;
import com.bank.model.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BankDao {

	public Connection getConnection()
	{
	Connection con = null;
	String user="root";
	String pwd="";
	String url="jdbc:mysql://localhost:3306/bankdatabase";		
	//Load or Register the driver for Mysql
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection(url,user,pwd);
		System.out.println("Connection successful!!!");
	}
	catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
	}
	public List<Employee> displayAllrecords()
	{
		List<Employee> list=new ArrayList<Employee>();
		Connection con=getConnection();
		String sql="select * from employee";

		//For Select statement we can use Connection Interface
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				Employee emp=new Employee(rs.getString("username"),rs.getString("password"),rs.getString("firstname"),rs.getString("lastname"),rs.getString("dob"),rs.getString("address"));
				list.add(emp);
			}	
		} 	
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return list;	
	}
	public Employee checkUserandPass(String username, String password)
	{
		List<Employee> list=new ArrayList<Employee>();
		Connection con=getConnection();
		String sql="select *from employee where UserName='"+username+"' and Password ='"+password+"'";
		Employee emp=new Employee();
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				emp=new Employee(rs.getString("username"),rs.getString("password"),rs.getString("firstname"),rs.getString("lastname"),rs.getString("dob"),rs.getString("address"));
				list.add(emp);
			}	
		} 	
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;	
	}
}
