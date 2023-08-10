package com.adda.app.Bean;

public class Contect {
  private Integer cId;
  private String cName;
  private String cEmail;
  private String cMobile;
  private String cAddress;
  private Boolean cIsfav;
  private Integer cuId;
public Contect() {
	super();
	// TODO Auto-generated constructor stub
}
public Contect(Integer cId, String cName, String cEmail, String cMobile, String cAddress, Boolean cIsfav,
		Integer cuId) {
	super();
	this.cId = cId;
	this.cName = cName;
	this.cEmail = cEmail;
	this.cMobile = cMobile;
	this.cAddress = cAddress;
	this.cIsfav = cIsfav;
	this.cuId = cuId;
}
public Integer getcId() {
	return cId;
}
public void setcId(Integer cId) {
	this.cId = cId;
}
public String getcName() {
	return cName;
}
public void setcName(String cName) {
	this.cName = cName;
}
public String getcEmail() {
	return cEmail;
}
public void setcEmail(String cEmail) {
	this.cEmail = cEmail;
}
public String getcMobile() {
	return cMobile;
}
public void setcMobile(String cMobile) {
	this.cMobile = cMobile;
}
public String getcAddress() {
	return cAddress;
}
public void setcAddress(String cAddress) {
	this.cAddress = cAddress;
}
public Boolean getcIsfav() {
	return cIsfav;
}
public void setcIsfav(Boolean cIsfav) {
	this.cIsfav = cIsfav;
}
public Integer getCuId() {
	return cuId;
}
public void setCuId(Integer cuId) {
	this.cuId = cuId;
}
@Override
public String toString() {
	return "Contect [cId=" + cId + ", cName=" + cName + ", cEmail=" + cEmail + ", cMobile=" + cMobile + ", cAddress="
			+ cAddress + ", cIsfav=" + cIsfav + ", cuId=" + cuId + "]";
}
 


  
}
