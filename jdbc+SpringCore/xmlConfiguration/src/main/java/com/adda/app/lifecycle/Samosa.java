package com.adda.app.lifecycle;

public class Samosa {
     private double price;                      //xml configuration .....from youtube...

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting property");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	public void init() {
		System.out.println("inside init methode");
	}
	public void destroy() {
		System.out.println("destroy method");
	}
	
}
