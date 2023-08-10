package com.adda.app.PayLoad;

public class User {

	
	 private Integer id;
	 private String FirstName;
	 private String LastName;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "User [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
	 
}
