package com.bank.model;

public class Employee {

	private String UserName;
	private String Password;
	private String FirstName;
	private String LastName;
	private String DOB;
	private String Address;
	
	//getters and setters
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	//constructor
	public Employee(String userName, String password, String firstName, String lastName, String dOB, String address) {
		super();
		UserName = userName;
		Password = password;
		FirstName = firstName;
		LastName = lastName;
		DOB = dOB;
		Address = address;
	}
	
	//super class constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//tostring
	@Override
	public String toString() {
		return "Employee [UserName=" + UserName + ", Password=" + Password + ", FirstName=" + FirstName + ", LastName="
				+ LastName + ", DOB=" + DOB + ", Address=" + Address + "]";
	}
	
	
	
}
