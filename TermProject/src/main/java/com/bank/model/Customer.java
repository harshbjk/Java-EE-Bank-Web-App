package com.bank.model;

public class Customer {

	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String dob;
	private String address;
	private String sin_no;
	private String email;
	private String phone_no;
	private float checkings_ac;
	private float savings_ac;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSin_no() {
		return sin_no;
	}
	public void setSin_no(String sin_no) {
		this.sin_no = sin_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public float getCheckings_ac() {
		return checkings_ac;
	}
	public void setCheckings_ac(float checkings_ac) {
		this.checkings_ac = checkings_ac;
	}
	public float getSavings_ac() {
		return savings_ac;
	}
	public void setSavings_ac(float savings_ac) {
		this.savings_ac = savings_ac;
	}
	public Customer(String username, String password, String firstname, String lastname, String dob, String address,
			String sin_no, String email, String phone_no, float checkings_ac, float savings_ac) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.address = address;
		this.sin_no = sin_no;
		this.email = email;
		this.phone_no = phone_no;
		this.checkings_ac = checkings_ac;
		this.savings_ac = savings_ac;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [username=" + username + ", password=" + password + ", firstname=" + firstname + ", lastname="
				+ lastname + ", dob=" + dob + ", address=" + address + ", sin_no=" + sin_no + ", email=" + email
				+ ", phone_no=" + phone_no + ", checkings_ac=" + checkings_ac + ", savings_ac=" + savings_ac + "]";
	}
	
	
}
