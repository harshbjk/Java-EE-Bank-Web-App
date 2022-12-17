package com.bank.empdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bank.model.Customer;
import com.bank.model.Customer;
import com.bank.model.Customer;
public class CustomerDao {

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
public class global{
	
}
	public List<Customer> displayAllrecords()
	{
		List<Customer> list=new ArrayList<Customer>();
		Connection con=getConnection();
		String sql="select * from customer";

		//For Select statement we can use Connection Interface
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				Customer cus=new Customer(rs.getString("username"),rs.getString("password"),rs.getString("firstname"),rs.getString("lastname"),rs.getString("dob"),rs.getString("address"),rs.getString("sin_no"), rs.getString("email"), rs.getString("phone_no"), rs.getFloat("checkings_ac"),rs.getFloat("savings_ac"));
				list.add(cus);
			}	
		} 	
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return list;
	}
	public Customer checkUser(String username)
	{
		List<Customer> list=new ArrayList<Customer>();
		Connection con=getConnection();
		String sql="select *from customer where UserName='"+username+"' ";
		Customer cus=new Customer();
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				cus=new Customer(rs.getString("username"),rs.getString("password"),rs.getString("firstname"),rs.getString("lastname"),rs.getString("dob"),rs.getString("address"),rs.getString("sin_no"), rs.getString("email"), rs.getString("phone_no"), rs.getFloat("checkings_ac"),rs.getFloat("savings_ac"));
				list.add(cus);
			}	
		} 	
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cus;	
	}
	public Customer checkUserandPass(String username, String password)
	{
		List<Customer> list=new ArrayList<Customer>();
		Connection con=getConnection();
		String sql="select *from customer where UserName='"+username+"' and Password ='"+password+"'";
		Customer cus=new Customer();
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next())
			{
				cus=new Customer(rs.getString("username"),rs.getString("password"),rs.getString("firstname"),rs.getString("lastname"),rs.getString("dob"),rs.getString("address"),rs.getString("sin_no"), rs.getString("email"), rs.getString("phone_no"), rs.getFloat("checkings_ac"),rs.getFloat("savings_ac"));
				list.add(cus);
			}	
		} 	
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cus;	
	}
	public int UpdatePersonal(String username,String fname, String lname, String dob, String address, String email,String phone)
	{
		int flag = 0;
		Connection con=getConnection();
		String sql="update customer set firstname='"+fname+"', lastname='"+lname+"', dob='"+dob+"', address ='"+address+"', email='"+email+"', phone_no='"+phone+"' where username='"+username+"'";
		try {
			PreparedStatement ptsmt=con.prepareStatement(sql);
			int status=ptsmt.executeUpdate();
			System.out.println(status);
			if(status>0)
			{
				flag = 1;
			}
			else
			{
				System.out.println("Please try updating again");
			}
		} 	
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return flag;
	}
	public int UpdatePass(String Pass, String username)
	{
		int flag = 0;
		Connection con=getConnection();
		String sql="update customer set password='"+Pass+"' where username='"+username+"'";;
		try {
			PreparedStatement ptsmt=con.prepareStatement(sql);
			int status=ptsmt.executeUpdate();
			System.out.println(status);
			if(status>0)
			{
				flag = 1;
			}
			else
			{
				System.out.println("Please try updating again");
			}
		} 	
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return flag;
	}
	public int UpdateBalc(String username, float Savings,float checking)
	{
		int flag = 0;
		Connection con=getConnection();
		String sql="update customer set checkings_ac='"+checking+"',savings_ac='"+Savings+"' where username='"+username+"'";
		try {
			PreparedStatement ptsmt=con.prepareStatement(sql);
			int status=ptsmt.executeUpdate();
			System.out.println(status);
			if(status>0)
			{
				flag = 1;
			}
			else
			{
				System.out.println("Please try updating again");
			}
		} 	
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return flag;
	}
	public int SendMoney(String username,float checking)
	{
		int flag = 0;
		Connection con=getConnection();
		String sql="update customer set checkings_ac='"+checking+"'+checkings_ac where username='"+username+"'";
		try {
			PreparedStatement ptsmt=con.prepareStatement(sql);
			int status=ptsmt.executeUpdate();
			System.out.println(status);
			if(status>0)
			{
				flag = 1;
			}
			else
			{
				System.out.println("Please try updating again");
			}
		} 	
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return flag;
	}
	public int SubMoney(String username,float checking)
	{
		int flag = 0;
		Connection con=getConnection();
		String sql="update customer set checkings_ac='"+checking+"' where username='"+username+"'";
		try {
			PreparedStatement ptsmt=con.prepareStatement(sql);
			int status=ptsmt.executeUpdate();
			System.out.println(status);
			if(status>0)
			{
				flag = 1;
			}
			else
			{
				System.out.println("Please try updating again");
			}
		} 	
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return flag;
	}
	public int UpdateAll(String username,String fname, String lname, String dob, String address, String email,String phone,String sin_no, float checking, float saving)
	{
		int flag = 0;
		Connection con=getConnection();
		String sql="update customer set firstname='"+fname+"', lastname='"+lname+"', dob='"+dob+"',sin_no='"+sin_no+"', address ='"+address+"', email='"+email+"', phone_no='"+phone+"', savings_ac='"+saving+"',checkings_ac='"+checking+"' where username='"+username+"'";
		try {
			PreparedStatement ptsmt=con.prepareStatement(sql);
			int status=ptsmt.executeUpdate();
			System.out.println(status);
			if(status>0)
			{
				flag = 1;
			}
			else
			{
				System.out.println("Please try updating again");
			}
		} 	
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return flag;
	}
	public int InsertAll(String password, String username,String fname, String lname, String dob, String address, String email,String phone,String sin_no, float checking, float saving)
	{
		int flag = 0;
		Connection con=getConnection();
		String sql="INSERT INTO `customer`(`username`, `password`, `firstname`, `lastname`, `dob`, `address`, `sin_no`, `email`, `phone_no`, `checkings_ac`, `savings_ac`) VALUES ('"+username+"', '"+password+"', '"+fname+"', '"+lname+"', '"+dob+"','"+address+"', '"+email+"','"+phone+"', '"+sin_no+"', '"+checking+"', '"+saving+"')";
		try {
			PreparedStatement ptsmt=con.prepareStatement(sql);
			int status=ptsmt.executeUpdate();
			System.out.println(status);
			if(status>0)
			{
				flag = 1;
			}
			else
			{
				System.out.println("Please try updating again");
			}
		} 	
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return flag;
	}
}
