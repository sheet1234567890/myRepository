package com.adda.app.Bean;

public class Admin {

	private Integer aId;
	private String aName;
	private String aEmail;
	private String aAddress;
	private String aMobile;
	private String aPassword;
	private String aRole;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getaId() {
		return aId;
	}
	public void setaId(Integer aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaEmail() {
		return aEmail;
	}
	public void setaEmail(String aEmail) {
		this.aEmail = aEmail;
	}
	public String getaAddress() {
		return aAddress;
	}
	public void setaAddress(String aAddress) {
		this.aAddress = aAddress;
	}
	public String getaMobile() {
		return aMobile;
	}
	public void setaMobile(String aMobile) {
		this.aMobile = aMobile;
	}
	public String getaPassword() {
		return aPassword;
	}
	public void setaPassword(String aPassword) {
		this.aPassword = aPassword;
	}
	public String getaRole() {
		return aRole;
	}
	public void setaRole(String aRole) {
		this.aRole = aRole;
	}
	@Override
	public String toString() {
		return "Admin [aId=" + aId + ", aName=" + aName + ", aEmail=" + aEmail + ", aAddress=" + aAddress + ", aMobile="
				+ aMobile + ", aPassword=" + aPassword + ", aRole=" + aRole + "]";
	}
	
}
