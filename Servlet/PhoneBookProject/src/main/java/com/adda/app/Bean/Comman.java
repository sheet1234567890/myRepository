package com.adda.app.Bean;

public class Comman {
	private Integer ccid;
	private Integer cuid;
	private Integer cgid;
	public Comman() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getCcid() {
		return ccid;
	}
	public void setCcid(Integer ccid) {
		this.ccid = ccid;
	}
	public Integer getCuid() {
		return cuid;
	}
	public void setCuid(Integer cuid) {
		this.cuid = cuid;
	}
	public Integer getCgid() {
		return cgid;
	}
	public void setCgid(Integer cgid) {
		this.cgid = cgid;
	}
	@Override
	public String toString() {
		return "Comman [ccid=" + ccid + ", cuid=" + cuid + ", cgid=" + cgid + "]";
	}


}
