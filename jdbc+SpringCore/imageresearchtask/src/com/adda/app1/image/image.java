package com.adda.app1.image;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Scanner;

import com.adda.app1.imageresearch;
import com.adda.app1.DAO.IimageInterface;
import com.adda.app1.DAO.impl.IimageInterfaceImpl;

public class image {

	 public void insertImage() throws FileNotFoundException, SQLException {
		 imageresearch i = new imageresearch();
		 IimageInterface I = new IimageInterfaceImpl();
		 
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter image name");
		 String s1 = s.nextLine();
		 InputStream in = new FileInputStream("C:\\Users\\Kdpat\\OneDrive\\Desktop\\Redmi 9power\\13578.jpg ");
		 i.setName(s1);
		 i.setBlob(in);
		 if(I.insertimage(i)) 
		 {
			 System.out.println("image inserted");
		 }
		 else
		 {
			 System.out.println("not inserted somthing went wrong....plz try again...");
		 }
		 
		 
	 }
	public static void main(String[] args) throws SQLException, FileNotFoundException {
		// TODO Auto-generated method stub
		image i = new image();
		i.insertImage();
	}

}
