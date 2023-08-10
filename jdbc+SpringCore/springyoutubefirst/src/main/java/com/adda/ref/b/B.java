package com.adda.ref.b;

public class B {
    private int y;                //refrence type.....setter injection...

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public B() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "B [y=" + y + "]";
	}
}
