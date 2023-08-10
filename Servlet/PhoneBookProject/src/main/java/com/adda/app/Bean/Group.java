package com.adda.app.Bean;

public class Group {
   private Integer gId;
   private String gName;
   private Boolean gIsfav;
   private Integer uid;
public Group() {
	super();
	// TODO Auto-generated constructor stub
}
public Integer getgId() {
	return gId;
}
public void setgId(Integer gId) {
	this.gId = gId;
}
public String getgName() {
	return gName;
}
public void setgName(String gName) {
	this.gName = gName;
}
public Boolean getgIsfav() {
	return gIsfav;
}
public void setgIsfav(Boolean gIsfav) {
	this.gIsfav = gIsfav;
}
public Integer getUid() {
	return uid;
}
public void setUid(Integer uid) {
	this.uid = uid;
}
@Override
public String toString() {
	return "Group [gId=" + gId + ", gName=" + gName + ", gIsfav=" + gIsfav + ", uid=" + uid + "]";
}

}
