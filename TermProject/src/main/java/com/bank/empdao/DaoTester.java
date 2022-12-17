package com.bank.empdao;
import java.util.ArrayList;
import java.util.List;

import com.bank.empdao.*;
import com.bank.model.Employee;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class DaoTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDao test=new CustomerDao(); 
		  
		//Test Connection
		  test.getConnection();
		  
		//Display all records
		  System.out.println(test.checkUserandPass("customer1", "password09"));
		  //test.checkUserandPass("customer1", "password09");
		  
	}

}
